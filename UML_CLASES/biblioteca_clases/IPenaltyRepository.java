import java.util.List;
public interface IPenaltyRepository {
    List<Penalty> findPenaltiesByUser(String userId);
    Penalty findPenaltyById(String id);
    void update(Penalty p);
}