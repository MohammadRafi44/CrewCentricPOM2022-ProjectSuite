package sa.gov.zatca.erad.portal.taxpayer.angular.web.objects;

import org.openqa.selenium.By;

public class TaxPayerAngularAccountPageObjects {

    // Button
    public static final By BUTTON_Continue = By.xpath("//span[contains(text(),'Continue')]");

    // Card
    public static By getCardAccountType(String accountType) {
        String xpath = "//p[@class='insideCard' and text()='" + accountType + "']";
        return By.xpath(xpath);
    }

    public static By getCardNewOtherAccount(String newOtherAccount) {
        String xpath = "//p[@class='insideCard' and text()='" + newOtherAccount + "']";
        return By.xpath(xpath);
    }

    // Link
    public static final By Link_Back_CreateNewAccount = By.xpath("//span[contains(text(),'Back')]");
    public static final By Link_Back_Account = By.xpath("//div[contains(text(),'Back')]");
    public static final By Link_Back_ConsortiumCompany = By.xpath("//div[contains(text(),'Back')]");


    // Text
    public static final By Text_Consortium_Company_ID = By.xpath("//input[@formcontrolname='companyID']");
    public static final By Text_Consortium_Company_Name = By.xpath("//input[@formcontrolname='companyName']");
    public static final By Text_Consortium_Contract_Number = By.xpath("//input[@formcontrolname='contractNumber']");
    public static final By Text_Consortium_Mobile_Number = By.xpath("//input[@formcontrolname='mobileNumber']");
    public static final By Text_Consortium_Email = By.xpath("//input[@formcontrolname='email']");
    public static final By Text_Consortium_Confirm_Email = By.xpath("//input[@formcontrolname='confirmEmail']");
    public static final By Text_Consortium_Captcha = By.xpath("//input[@formcontrolname='captcha1']");
    public static final By Text_Consortium_Verification_Code = By.xpath("//input[@formcontrolname='captcha2']");

    // DropDown
    public static final By DropDown_Consortium_Reporting_Branch = By.xpath("//mat-select[@formcontrolname='reportingBranch']");

    // Icon
    public static final By Icon_Refresh_Verification = By.xpath("//mat-icon[contains(text(),'autorenew')]");
    public static final By Icon_Loading_Spinner = By.xpath("//div[@id='loader' and contains(@style, 'none')]");

}
