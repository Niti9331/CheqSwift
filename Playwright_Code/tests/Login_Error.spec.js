const{test,expect}=require('@playwright/test');
test('Validate Login Credentials',async({browser})=>{
    const context=await browser.newContext();
    const page=await context.newPage();
    await page.goto("https://cheqswift.ai/");
    //get title & assert
    console.log(await page.title());
    const clientcode=page.locator('#clientcode');
    const submit=page.locator("#btnSubmit");
    const username=page.locator('#LoginId');
    const password=page.locator('#LoginPassword');
    const login=page.locator("#btnLogin");

    //await expect(page).toHaveTitle(Cheqswift');
    await clientcode.fill("cld_mojo");
    await submit.click();
    await username.fill("cmm0");
    await password.fill("12345678");
    await login.click();
    console.log(await page.locator("[role=alert]").textContent());
    await expect(page.locator("[role=alert]")).toContainText('×  Invalid Access');
    
})