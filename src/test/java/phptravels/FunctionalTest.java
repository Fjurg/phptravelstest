package phptravels;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import phptravels.driver.Driver;
import phptravels.page.LoginPage;

import static phptravels.page.LoginPage.loginAs;

public abstract class FunctionalTest {

    @BeforeEach
    public void init() {
        Driver.initialize();
        LoginPage.goTo();
        loginAs("admin@phptravels.com")
                .withPassword("demoadmin")
                .login();
    }

    @AfterEach
    public void tearDown() {
        Driver.destroy();
    }
}
