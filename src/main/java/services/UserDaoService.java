package services;


import models.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

@Service
public class UserDaoService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserDaoService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(User user) {
        // hash the original plain text password
        String hash = passwordEncoder.encode(user.getPassword());
        // set the hashed password to the user password property
        user.setPassword(hash);
        // save the user with the hashed password field
        userRepository.save(user);
    }
}