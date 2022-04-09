package sa.gov.zatca.erad.portal.taxpayer.angular.web.pages;

import com.example.base.Actions;

import java.util.Map;

import static sa.gov.zatca.erad.portal.taxpayer.angular.web.objects.TaxPayerAngularAccountPageObjects.*;

public class TaxPayerAnugularAccountPage {

    public void backFromCreateNewAccount() {
        Actions.waitForElementAtIntervals(Link_Back_CreateNewAccount, 1, 1);
        Actions.click(Link_Back_CreateNewAccount);
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
        Actions.click(getCardAccountType(data.get("AccountType")));
    }

    public void selectOtherAccountCategory(Map<String, String> data) {
        Actions.waitForElementAtIntervals(getCardAccountType(data.get("AccountType")), 1, 1);
        Actions.click(getCardAccountType(data.get("AccountType")));
    }
}
