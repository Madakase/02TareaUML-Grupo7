import java.util.List;
public class PaymentController {
    private IPenaltyRepository penaltyRepository;
    private IReservationRepository reservationRepository;
    private IItemRepository itemRepository;
    private IPaymentService paymentService;
    public List<Penalty> showPenalties(String userId){ return null; }
    public int payPenalty(String id, PaymentMethod method){ return 0; }
    public List<Reservation> showReservationsToPay(String userId){ return null; }
    public int payReservation(String id, PaymentMethod method){ return 0; }
}