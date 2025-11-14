public class LoginController {
    private IUserRepository userRepository;
    public User startLogin(String username, String password){
        return userRepository.findUserByCredentials(username, password);
    }
}