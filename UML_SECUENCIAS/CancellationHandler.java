import java.time.LocalDate;

public class CancellationHandler extends AbstractHandler {

    private Notification notification;

    public CancellationHandler(Storage storage, Notification notification) {
        super(storage);
        // Logica de constructor CancellationHandler...
    }

    public Reservation chooseReservation() {
        // Logica de chooseReservation...
        return null;
    }

    public int processCancellation(Reservation reservation) {
        // Logica de processCancellation...
        return 0;
    }

}
