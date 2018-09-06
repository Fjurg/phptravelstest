package phptravels;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import phptravels.page.DashBoardPage;
import phptravels.page.LoginPage;

public class LoginTest extends FunctionalTest {

    @Test
    public void adminUserCanLogin() {
        LoginPage.goTo();
        LoginPage.loginAs("").withPassword("").login();

        Assert.assertTrue("Failed to login.", DashBoardPage.isAt());
    }

}
