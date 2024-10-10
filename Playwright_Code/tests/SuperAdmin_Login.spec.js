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
    await clientcode.fill("cld_fin_tech");
    await submit.click();
    await username.fill("sa");
    await password.fill("sa");
    await login.click();
    console.log('Title is',await page.title());
    await page.locator('.bg-masters').click();
    await page.getByRole('link', { name: 'Add Bank', exact: true }).click();
    await page.getByPlaceholder('Bank name').fill('abcBank');
    await page.getByPlaceholder('e.g. 142').fill('263');
    await page.getByPlaceholder('Bank name').press('Tab');
    await page.getByRole('button', { name: 'Submit' }).click();
    //await expect(page.locator("[role=alert]").toContainText('×  Data added successfully'));
   const BankName=await page.getByPlaceholder("Bank name").textContent();
   console.log(BankName);

    //Validate recently added Bank-
   /*await page.getByRole('link', { name: 'Banks', exact: true }).click();
    const rows=await page.locator("tbody tr");
    for(let i=0;i<await rows.count;i++)
    {
        const BankNames=await rows.nth(i).locator("a").textContent();
        if(BankName.includes(BankNames))
        {
            await page.rows.nth(i).getByRole('link', {Name:'abcBank', exact: true}).click();
            break;
        }
   // await page.locator;
    }*/
})


//Press sequentially- It is used for auto suggestive dropdown