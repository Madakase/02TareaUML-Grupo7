import java.util.List;
public interface IItemRepository {
    List<Copy> getCatalog();
    Copy findCopyById(String copyId);
    void updateCopy(Copy copy);
}