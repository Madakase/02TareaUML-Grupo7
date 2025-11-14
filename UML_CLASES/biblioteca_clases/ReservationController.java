import java.util.List;
public class ReservationController {
    private IItemRepository itemRepository;
    private IReservationRepository reservationRepository;
    private INotificationService notificationService;
    public List<Copy> showCatalog(){ return itemRepository.getCatalog(); }
    public int startReservation(String copyId, String userId){ return 0; }
}