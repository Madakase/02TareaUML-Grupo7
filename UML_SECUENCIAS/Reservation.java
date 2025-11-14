import java.time.LocalDate;

public class Reservation { private boolean isPaid; private boolean
wasBorrowed;

    public Reservation(String id, Copy copy, User user, LocalDate date, LocalDate limit, boolean borrowed) {
        // Logica del constructor Reservation...
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        // Logica de setPaid...
    }

    public boolean getWasBorrowed() {
        return wasBorrowed;
    }

    public void setWasBorrowed(boolean wasBorrowed) {
        // Logica de setWasBorrowed...
    }

}
