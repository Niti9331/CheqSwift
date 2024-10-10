import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://cheqswift.ai/');
  await page.getByPlaceholder('Already a client? Enter your').fill('cld_mojo');
  await page.getByPlaceholder('Already a client? Enter your').press('Enter');
  await page.getByPlaceholder('Login ID').fill('cmm0');
  await page.getByPlaceholder('Login ID').press('Tab');
  await page.getByPlaceholder('********').fill('12345678');
  await page.getByPlaceholder('********').press('Enter');
  await expect(page.getByText('Invalid Access')).toBeVisible();
  await page.goto('https://cheqswift.ai/Users/Login/AppSelection');
  await page.goto('https://cheqswift.ai/Users/Login/BankBranchSelection');
  await page.goto('https://cheqswift.ai/CTSOW/Dashboard');
});