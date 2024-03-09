package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private String username;
    private String password;
    public User input(Scanner scanner)
    {
        System.out.print("Enter Your username=");
        username=scanner.nextLine();
        System.out.print("Enter Your Password=");
        password=scanner.nextLine();
        return this;
    }
}
