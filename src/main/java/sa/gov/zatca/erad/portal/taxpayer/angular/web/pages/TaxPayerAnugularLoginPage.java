package sa.gov.zatca.erad.portal.taxpayer.angular.web.pages;

import com.example.base.Actions;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static sa.gov.zatca.erad.portal.taxpayer.angular.web.objects.TaxPayerAngularLoginPageObjects.*;

public class TaxPayerAnugularLoginPage {

    public void login(Map<String, String> data) {
        Actions.waitForElementAtIntervals(BUTTON_Login, 1, 1);
        Actions.sleep(2);
        Actions.enterText(TEXT_TIN_Or_Email, data.get("TIN_Or_Email"), "Entered : " + data.get("TIN_Or_Email"));
        Actions.enterText(TEXT_Password, data.get("Password"), "Entered : " + data.get("Password"));
        Actions.click(BUTTON_Login, "Clicked Login button.");
    }

    public void assertLoginPageDisplayed() {
        Actions.takeScreenshot();
        Assert.assertTrue(Actions.checkIfWebElementExists(BUTTON_Login), "Login Page displayed.");
        Helper.log("Login Page displayed.");
    }

    public void openSignUpPage() {
        Actions.waitForElementAtIntervals(Link_SignUp, 1, 1);
        Actions.click(Link_SignUp, "Clicked SignUp Link.");
    }
}
