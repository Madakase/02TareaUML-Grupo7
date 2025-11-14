public interface INotificationService {
    void notifyCannotRenovate(String userId);
    void notifyOptionWhenAvailable(String userId, String itemId);
    void notifyCannotCancel(String userId);
    void notifyUserNoHistory(String userId);
}