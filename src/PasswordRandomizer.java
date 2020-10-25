import java.util.Random;

public class PasswordRandomizer {
    private int passwordLength;

    public PasswordRandomizer(int length) {
        // Format the variable here
        this.passwordLength = length;
    }

    public String createPassword() {
        // Write the code here which returns the new password
        String password = "";
        int i = 0;
        Random randNum = new Random();
        while(i<=passwordLength){
            int num = randNum.nextInt(26);
            char symbols = "abcdefghijklmnopqrstuvwxyz".charAt(num);
            password += String.valueOf(symbols);
            i++;
        }
        return password;
    }
}
