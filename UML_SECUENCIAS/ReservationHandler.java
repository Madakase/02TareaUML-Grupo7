public class ReservationHandler extends AbstractHandler {

    private Notification notification;
    private Catalog catalog;

    public ReservationHandler(Storage storage, Notification notification, Catalog catalog) {
        super(storage);
        // Logica de constructor ReservationHandler...
    }

    public int startReservation(Copy copy) {
        // Logica de startReservation...
        return 0;
    }

    public Reservation chooseReservation() {
        // Logica de chooseReservation...
        return null;
    }

    public void updateReservation(String paymentDetails) {
        // Logica de updateReservation...
    }

    public int showHistory() {
        // Logica de showHistory...
        return 0;
    }

}
