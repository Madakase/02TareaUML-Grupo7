import java.util.List;
public interface IReservationRepository {
    List<Reservation> findReservationsByUser(String userId);
    Reservation findReservationById(String id);
    void save(Reservation r);
    void update(Reservation r);
    void delete(String id);
    List<Reservation> getHistoryByUser(String userId);
}