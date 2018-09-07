package phptravels;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import phptravels.page.DashboardPage;

class LoginTest extends FunctionalTest {

    @Test
    void adminUserCanLogin() {
         Assert.assertTrue("Failed to login.", DashboardPage.isAt());
    }
}
