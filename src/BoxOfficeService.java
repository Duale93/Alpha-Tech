import java.util.List;

public interface BoxOfficeService {
    //Get all bookings for a specific date range
    List<Booking> getBookingsByDateRange(String startDate, String endDate);

    //Get a seating plan for a specific event
    SeatingPlan getSeatingPlanForBooking(String bookingId);

    //Update seating plan (mark specific seats as wheelchair accessible or restricted view)
    boolean updateSeatingPlan(int bookingId, SeatingPlan seatingPlan);

    //Release held seats (after a certain time or when they are no longer needed)
    boolean releaseHeldSeats(int bookingId, int seatId);

    //Get revenue breakdown for a specific booking
    FinancialRecord revenueBreakdown(double revenue, int bookingId);
    //i feel like we should have something that breaks down the revenue, profit and cost

    //Log a refund for a specific booking
    boolean logRefund(int bookingId);

    //Get a refund for a specific booking

    //Get guest estimates for a specific booking
    int getGuestEstimitesFor
}
