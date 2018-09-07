package phptravels;

import org.junit.jupiter.api.Test;
import phptravels.enums.*;
import phptravels.page.DashboardPage;
import phptravels.page.QuickBookingPage;

public class ManageBookingSmokeTest extends FunctionalTest {

    @Test
    void quickBookingHotel() {

        DashboardPage.TopNavigationBar.QUICK_BOOKING.click();

        QuickBookingPage.createQuickBooking()
                .withService(Service.HOTELS)
                .withDurationToStayInDays(1)
                .withHotelName(Hotel.RENDEZVOUS_HOTELS)
                .withRoomName(Room.DELUX_ROOM)
                .withPaymentMethod(PaymentMethod.JAZZ_CASH)
                .withExtras(Extra.CHAMPAGNE)
                .book();
    }
}
