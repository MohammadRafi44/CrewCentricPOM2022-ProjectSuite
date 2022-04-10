package sa.gov.zatca.erad.portal.taxpayer.angular.web;

import com.example.base.Actions;
import sa.gov.zatca.erad.portal.taxpayer.angular.web.pages.TaxPayerAngularAccountPage;
import sa.gov.zatca.erad.portal.taxpayer.angular.web.pages.TaxPayerAnugularLoginPage;

import java.util.Map;

public class TaxPayerAngularPortal {

    public TaxPayerAnugularLoginPage loginPage;
    public TaxPayerAngularAccountPage accountPage;

    public TaxPayerAngularPortal() {
        loginPage = new TaxPayerAnugularLoginPage();
        accountPage = new TaxPayerAngularAccountPage();
    }

    public void openApplication(Map<String, String> data) {
        Actions.openUrl(data.get("URL"));
        Actions.takeScreenshot();
    }
}
