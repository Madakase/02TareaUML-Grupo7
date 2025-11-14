public interface IUserRepository {
    User findUserByCredentials(String username, String password);
}