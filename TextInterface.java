import java.util.Scanner;

public class TextInterface implements UserInterface {

    private Scanner scanner;

    public TextInterface() {
        this.scanner = new Scanner(System.in);
    }
    @Override
    public int getPassordLength() {
        System.out.print("Enter Password Length: ");
        return scanner.nextInt();
    }

    @Override
    public boolean addUpperCase() {

        System.out.print("Should the password contain Uppercase letters? (y/n): ");
        return ((scanner.next()).equalsIgnoreCase("y"));
    }

    @Override
    public boolean addLowerCase() {
        System.out.print("Should the password contain LowerCase letters? (y/n): ");
        return ((scanner.next()).equalsIgnoreCase("y"));
    }

    @Override
    public boolean addNumber() {
        System.out.print("Should the password contain digits? (y/n): ");
        return ((scanner.next()).equalsIgnoreCase("y"));
    }

    @Override
    public boolean addSymbols() {
        System.out.print("Should the password contain symbols? (y/n): ");
        return ((scanner.next()).equalsIgnoreCase("y"));
    }

    @Override
    public void displayPassord(String password) {
        System.out.print("Your password is: "+ password);
    }
}
