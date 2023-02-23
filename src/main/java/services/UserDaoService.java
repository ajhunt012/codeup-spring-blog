package services;

import org.springframework.security.crypto.password.PasswordEncoder;
import repositories.UserRepository;

public class UserDaoService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserDaoService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(User user) {

        String hash = passwordEncoder
    }


}
