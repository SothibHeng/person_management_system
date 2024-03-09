package service;
import model.User;
import repository.UserRepository;
import java.util.Scanner;
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository)
    {
        this.userRepository =new UserRepository();
    }
    public void check(Scanner scanner)
    {
        System.out.println("~".repeat(90));
        userRepository.Login(new User().input(scanner));
        System.out.println("~".repeat(90));
    }
}
