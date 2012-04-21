package Player.BLL;

import java.util.regex.*;
import java.util.Scanner;

public class UserAccount {

    static Scanner input = new Scanner(System.in);
    static String inputString = input.next();

    public static void emailValidation() {

        //Checks for email addresses starting with inappropriate symbols like dots or @ signs.
        Pattern p = Pattern.compile("^\\.|^\\@");
        Matcher m = p.matcher(inputString);

        if (m.find()) {
            System.err.println("Email address cannot start" + " with dots or @ signs.");
        }

        //Checks for email addresses that start with www. and prints a message if it does.
        p = Pattern.compile("^www\\.");
        m = p.matcher(inputString);

        if (m.find()) {
            System.out.println("Email address cannot start" + " with \"www.\", only web pages do.");
        }

        //Checks for appropriate format of email address
        p = Pattern.compile("[^A-Za-z0-9\\.\\@_\\-~#]+");
        m = p.matcher(inputString);

        StringBuffer sb = new StringBuffer();
        boolean result = m.find();
        boolean deletedIllegalChars = false;
        while (result) {
            deletedIllegalChars = true;
            m.appendReplacement(sb, "");
            result = m.find();
        }

        // Add the last segment of input to the new String
        m.appendTail(sb);
        inputString = sb.toString();
        if (deletedIllegalChars) {
            System.out.println("It contained incorrect characters" + " , such as spaces or commas.");
        }
    }

    public static void passwordValidation() {

        //Checks to make sure password is not blank
        Pattern p = Pattern.compile(null);
        Matcher m = p.matcher(inputString);

        if (m.find()) {
            System.out.println("Password must be entered");
        }

        //Checks to make sure password contains as least one letter
        p = Pattern.compile("a-zA-Z*");
        m = p.matcher(inputString);

        if (!m.find()) {
            System.out.println("Password must contain at least one letter");
        }


        //Checks to make sure password contains as least one number
        p = Pattern.compile("\\d*");
        m = p.matcher(inputString);

        if (!m.find()) {
            System.out.println("Password must contain at least one number");
        }


        //Checks to make sure password contains as least one special character
        p = Pattern.compile("^\\W*");
        m = p.matcher(inputString);

        if (!m.find()) {
            System.out.println("Password must contain at least special character");
        }
    }
}
