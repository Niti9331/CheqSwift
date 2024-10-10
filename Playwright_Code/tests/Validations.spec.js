const{test,expect}=require('@playwright/test');
test('Validate Login Credentials',async({browser})=>{
   
    const context=await browser.newContext();
    const page=await context.newPage();
    await page.goto("https://cheqswift.ai/");
    //get title & assert
    console.log('Title is',await page.title());
    const clientcode=page.locator('#clientcode');
    const submit=page.locator("#btnSubmit");
    const username=page.locator('#LoginId');
    const password=page.locator('#LoginPassword');
    const login=page.locator("#btnLogin");
    const optionName='Cheque Truncation System';
    const options=page.locator(".card-body");
   // await expect(page).toHaveTitle(Cheqswift');
    await clientcode.fill("cld_mojo");
    await submit.click();
    await username.fill("cmm01");
    await password.fill("12345678");
    await login.click();
    await page.locator(".card-body p").last().waitFor();
    const titles=await page.locator(".card-body p").allTextContents();
    console.log('Contents are displayed below',titles);
    const count=await options.count
    for(let i=0;i<count;i++)
    {
      if(await options.nth(i).locator("p").textContent()===optionName)
      {
        await options.nth(i).locator("text=Cheque Truncation System").click;
        break;
      }
    }
    //await username.fill("");
    //await page.locator(".card-body p").allTextContents();
    //await page.getByRole('link',{text='Cheque Truncation System (CTS OUTWARD)'}).click();
    //await page.pause();
    
    
    //const dropdown=await page.locator("select.form-select valid");
    //await dropdown.selectOption("MAKER")
   





   



    
    


})