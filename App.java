public class App {
    public static void main(String[] args) {
        PasswordGenerator pg = new PasswordGenerator();
        TextInterface tI = new TextInterface();
        int passwordLength = tI.getPassordLength();
        boolean upper = tI.addUpperCase();
        boolean lower = tI.addLowerCase();
        boolean digit = tI.addNumber();
        boolean special = tI.addSymbols();


        String password = pg.generatePassword(passwordLength, upper, lower, digit, special);

        tI.displayPassord(password);
    }
}
