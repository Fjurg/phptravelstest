package phptravels;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import phptravels.driver.Driver;
import phptravels.page.LoginPage;

public abstract class FunctionalTest {

    @BeforeEach
    public void init() {
        Driver.initialize();
        LoginPage.goTo();
        LoginPage.loginAs("admin@phptravels.com").withPassword("demoadmin").login();
    }

    @AfterEach
    public void tearDown() {
        Driver.destroy();
    }
}
