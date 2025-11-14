import java.util.List;
public class CancellationController {
    private IReservationRepository reservationRepository;
    private IItemRepository itemRepository;
    private INotificationService notificationService;
    public List<Reservation> showReservations(String userId){ return null; }
    public int startCancel(String reservationId){ return 0; }
}