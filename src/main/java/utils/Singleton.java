package utils;
import model.Person;
import model.User;
import controller.PersonController;
import service.PersonService;

import java.util.*;
public class Singleton {
    private static Scanner scanner;
    private static Person person;
    private static User systemUser;
    private static DatabasePopulationUtils databasePopulationUtils;
    private static PersonService personService;
    private static PersonController personController;
    public static PersonController controller()
    {
        if(personController ==null)
        {
            personController =new PersonController();
        }
        return personController;
    }
    public static DatabasePopulationUtils databasePopulationUtils()
    {
        if(databasePopulationUtils==null)
        {
            databasePopulationUtils=new DatabasePopulationUtils();
        }return databasePopulationUtils;
    }
    public static Scanner scanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    public static User systemUser()
    {
        if(systemUser==null)
        {
            systemUser=new User();
        }return systemUser;
    }
    public static Person person()
    {
        if(person==null)
        {
            person=new Person();
        }
        return person;
    }

}
