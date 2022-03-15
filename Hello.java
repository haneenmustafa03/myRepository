import java.util.Scanner;
public class Hello {
    public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello. What is your name?");
    String name;
    name = scanner.next();
    System.out.println("It's nice to meet you, " + name + ". How old are you?");
    String age;
    age = scanner.next();
    System.out.println("I see that you are still quite young at only " + age + ".");
    System.out.println("Where do you live?");
    String residence;
    residence = scanner.next();
    System.out.println("Wow! I've always wanted to go to " + residence + ". Thanks for chatting with me. Bye!");



    }
}
