import java.util.Date;
public class Reservation {
    private String id;
    private String userId;
    private String copyId;
    private Date dueDate;
    private boolean wasBorrowed;
    private Date cancelTimeLimit;
    private boolean paid;
    public boolean canRenovate(){ return true; }
    public boolean canCancel(){ return true; }
}