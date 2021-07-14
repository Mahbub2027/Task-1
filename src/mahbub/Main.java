package mahbub;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String section;
        System.out.print("Enter your Section: ");
        section = input.next();

        Info objinfo = new Info();
        Hobby objhobby = new Hobby();

        System.out.println("Section: "+section);
        System.out.println("Name: "+objinfo.name);
        System.out.println("Id No: "+objinfo.id);
        System.out.println("Hobby: "+objhobby.hobbyName);


    }
}
/**
 * Name: Md. Mahbub Alam
 * Id No: 2012020127
 * Section: C
 * Email: cse_2012020127@lus.ac.bd
 * Date: 14.07.21
 */