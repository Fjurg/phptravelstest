package phptravels;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import phptravels.driver.Driver;

public abstract class FunctionalTest {

    @BeforeEach
    public void init() {
        Driver.initialize();
    }

    @AfterEach
    public void tearDown() {
        Driver.destroy();
    }
}
