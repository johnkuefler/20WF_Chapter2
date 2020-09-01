
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        String personsName = keyboard.nextLine();

        JOptionPane.showMessageDialog(null, "Your name is " + personsName);
        
        String city = JOptionPane.showInputDialog("Enter your city");
        JOptionPane.showMessageDialog(null, "Your city is " + city);

        
        
        String firstNumTemp = JOptionPane.showInputDialog("Enter your first number");
        String secondNumTemp = JOptionPane.showInputDialog("Enter your second number");

        int firstNumAsInt = Integer.parseInt(firstNumTemp);
        int secondNumAsInt = Integer.parseInt(secondNumTemp);

        int result = firstNumAsInt + secondNumAsInt;
        JOptionPane.showMessageDialog(null, "Your sum is " + result);

        
        
        final double SALES_TAX_AMOUNT = 0.095;
        
        double amount1 = (1.55) * (SALES_TAX_AMOUNT);
        double amount2 = (4.55) * (SALES_TAX_AMOUNT);
        double amount3 = (5.05) * (SALES_TAX_AMOUNT);

        int myMathNumber = 5;

        myMathNumber = myMathNumber + 5;
        myMathNumber += 5;

        System.out.println("Hello \"world\"");

        String myHelloWorldString = "Hello again";
        int stringLength = myHelloWorldString.length();
        System.out.println(stringLength);
        
        int myNumberFive = 5;
        int myNumberSix = 6;
        int myNumberSeven = 7;

        System.out.println(myNumberFive);

        double myDouble = 5.4;
        boolean myBool = false;
        char jChar = 'j';
        char JChar = 'J';
        String mChar = "M";

        System.out.println("This is some big"
                + " long string of text"
                + " that will run way"
                + " off the screen");

        System.out.println(55);
    }
}
