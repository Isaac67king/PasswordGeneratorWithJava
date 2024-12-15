import java.util.Random;

public class PasswordGenerator {
    public boolean isOverLap(String password, String required) {
        for(char c : password.toCharArray()){
            if(required.contains(String.valueOf(c))){
                return true;
            }
        }
        return false;
    }
  
    String generatePassword(int length, boolean upperCase, boolean lowercase, boolean digits, boolean specialChars) {
        Random rand = new Random();//create random object
        StringBuilder password = new StringBuilder();
      
        String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
        String upperLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialCharacter = "@#$!^&*()?";


        boolean allFulfilled = false;


       while(true){
           StringBuilder allChars = new StringBuilder();

           if (upperCase) {
               allChars.append(upperLetter);
           }

           if (lowercase) {
               allChars.append(lowerLetter);
           }

           if (specialChars) {
               allChars.append(specialCharacter);
           }

           if(digits) {
               allChars.append(numbers);
           }

           String allCharsString = allChars.toString();

           allFulfilled = true;

           for(int i = 0; i < length; i++){
               int index = rand.nextInt(allCharsString.length());
               char nextChar = allCharsString.charAt(index);
               password.append(nextChar);

           }
           String pass = String.valueOf(password);


           if(upperCase && !isOverLap(pass, upperLetter)) {
               allFulfilled = false;
           }

           if(lowercase && !isOverLap(pass, lowerLetter)) {
               allFulfilled = false;
           }

           if(digits && !isOverLap(pass, numbers)) {
               allFulfilled = false;
           }

           if(specialChars && !isOverLap(pass, specialCharacter)) {
               allFulfilled = false;
           }
           if(allFulfilled && password.length() == length){
               return pass;
           }
           System.out.println("failed passwords......  "+pass);//display the invalid passwords 
           password.delete(0, password.length()); // if the password doesn't satisfy the requirements, empty the password string.
       }
    }
}
