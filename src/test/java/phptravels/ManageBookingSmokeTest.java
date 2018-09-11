package phptravels;

import org.junit.jupiter.api.Test;
import phptravels.enums.*;
import phptravels.page.DashboardPage;
import phptravels.page.QuickBookingPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManageBookingSmokeTest extends FunctionalTest {

    @Test
    void quickBookingHotel() throws Exception {

        DashboardPage.TopNavigationBar.QUICK_BOOKING.click();

        assertTrue(QuickBookingPage.isAt(), "Isn't at the QuickBookingPage");

        QuickBookingPage.createQuickBooking()
                .withService(Service.HOTELS)
                .withDurationToStayInDays(7)
                .withHotelName(Hotel.RENDEZVOUS_HOTELS)
                .withRoomType(RoomType.DELUX_ROOM)
                .withPaymentMethod(PaymentMethod.JAZZ_CASH)
                .withExtras(Extra.CHAMPAGNE)
                .book();
    }
}
