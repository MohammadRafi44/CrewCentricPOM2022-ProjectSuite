package sa.gov.zatca.erad.portal.taxpayer.angular.web.pages;

import com.example.base.Actions;

import java.util.Map;

import static sa.gov.zatca.erad.portal.taxpayer.angular.web.objects.TaxPayerAngularAccountPageObjects.*;

public class TaxPayerAngularAccountPage {

    public void backFromCreateNewAccount() {
        Actions.waitForElementAtIntervals(Link_Back_CreateNewAccount, 1, 1);
        Actions.click(Link_Back_CreateNewAccount, "Clicked Back Link of Create New Account");
    }

    public void backFromNewOtherAccount() {
        Actions.waitForElementAtIntervals(Link_Back_Account, 1, 1);
        Actions.click(Link_Back_Account);
    }


    public static void backFromConsortiumCompany() {
        Actions.waitForElementAtIntervals(Link_Back_ConsortiumCompany, 1, 1);
        Actions.click(Link_Back_ConsortiumCompany);
    }

    public void selectAccountType(Map<String, String> data) {
        Actions.waitForElementAtIntervals(getCardAccountType(data.get("AccountType")), 1, 1);
        Actions.click(getCardAccountType(data.get("AccountType")),
                "Clicked Account type - " + data.get("AccountType"));
    }

    public void selectOtherAccountCategory(Map<String, String> data) {
        Actions.waitForElementAtIntervals(getCardNewOtherAccount(data.get("OtherAccountCategory")), 1, 1);
        Actions.click(getCardNewOtherAccount(data.get("OtherAccountCategory")),
                "Clicked New Other Account Category - " + data.get("OtherAccountCategory"));
        Actions.sleep(10);
        Actions.waitForElementInvisibilityAtIntervals(Icon_Loading_Spinner, 10, 5);
    }

    public void fillConsortiumCompanyOrganizationInformationDetails(Map<String, String> data) {
        Actions.waitForElementAtIntervals(Text_Consortium_Company_ID, 1, 1);
        Actions.enterText(Text_Consortium_Company_ID, data.get("Company_ID"), "Entered : " + data.get("Company_ID"));
        Actions.click(Text_Consortium_Company_Name);
        Actions.sleep(10);
        Actions.waitForElementInvisibilityAtIntervals(Icon_Loading_Spinner, 10, 5);
        Actions.enterText(Text_Consortium_Company_Name, data.get("Company_Name"), "Entered : " + data.get("Company_Name"));
        Actions.enterText(Text_Consortium_Contract_Number, data.get("Contract_Number"), "Entered : " + data.get("Contract_Number"));
    }

    public void fillConsortiumCompanyContactInformationDetails(Map<String, String> data) {
        Actions.waitForElementAtIntervals(Text_Consortium_Mobile_Number, 1, 1);
        Actions.enterText(Text_Consortium_Mobile_Number, data.get("Mobile_Number"), "Entered : " + data.get("Mobile_Number"));
        Actions.enterText(Text_Consortium_Email, data.get("Email"), "Entered : " + data.get("Email"));
        Actions.enterText(Text_Consortium_Confirm_Email, data.get("Confirm_Email"), "Entered : " + data.get("Confirm_Email"));
    }

    public void fillConsortiumCompanyCaptcha() {
        String captcha = Actions.getAttribute(Text_Consortium_Captcha, "value");
        Actions.enterText(Text_Consortium_Verification_Code, captcha, "Entered : " + captcha);
    }

    public void continueOrganizationInformationDetails() {
        Actions.click(BUTTON_Continue);
        Actions.sleep(10);
        Actions.waitForElementInvisibilityAtIntervals(Icon_Loading_Spinner, 10, 5);
    }
}
