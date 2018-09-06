package phptravels;

import junit.framework.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @BeforeEach
    public void init() {
        Driver.initialize();
    }

    @Test
    public void adminUserCanLogin() {
        LoginPage.goTo();
        LoginPage.loginAs("").withPassword("").login();

        Assert.assertTrue("Failed to login.", DashBoard.isAt());
    }

}
