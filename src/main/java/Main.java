
import controller.PersonController;
import repository.UserRepository;
import service.UserService;
import java.util.*;
public class Main {
    private final static PersonController PERSON_CONTROLLER =new PersonController();
    private static final UserService USER_SERVICE =new UserService(new UserRepository());
    public void run()
    {
        Scanner input = new Scanner(System.in);
        USER_SERVICE.check(input);
        PERSON_CONTROLLER.MainMenu();
    }
  public static void main(String[] args) {

        new Main().run();
    }
}
