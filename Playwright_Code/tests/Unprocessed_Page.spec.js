const{test,expect}=require('@playwright/test');
test('Validate Login Credentials',async({browser})=>{
   
    const context=await browser.newContext();
    const page=await context.newPage();
    await page.goto("https://cheqswift.ai/");
    //get title & assert
    //console.log('Title is',await page.title());
    const clientcode=page.locator('#clientcode');
    const submit=page.locator("#btnSubmit");
    const username=page.locator('#LoginId');
    const password=page.locator('#LoginPassword');
    const login=page.locator("#btnLogin");
    //await expect(page).toHaveTitle(Cheqswift');
    await clientcode.fill("cld_mojo");
    await submit.click();
    await username.fill("cmm01");
    await password.fill("12345678");
    await login.click();
    //const titles=await page.locator("").allTextContents();
    //console.log('Contents are displayed below',titles);
    await page.getByRole('link', {name:'Select' }).nth(2).click();
    await page.getByRole('button', { name: 'Continue' }).click();
    await page.locator('.bg-correctionReview').click();
    console.log('Title is',await page.title());
})
