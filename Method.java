/*basic calculator in Java
made by : Carl Dennis Pineda
Small projects regarding OOP
Methods
 */
import java.util.Scanner;//import Scanner class

public class Method
{

    public static void main (String[] args)//main method
    {
        Scanner keyboard = new Scanner(System.in);//keyboard initialization
        System.out.println("Calculator");

        System.out.println("Say what you want to do : ");
        System.out.println("[+] Add");
        System.out.println("[-] Subtract");
        System.out.println("[x] Multiply");
        System.out.println("[/] Divide");
        System.out.println("[Q] Quit");
        System.out.print("Operation : ");

        char operation = keyboard.next().charAt(0);//entering char value

        boolean done = false;//tells if the while loop is done
        while(done == false) //will repeat until user inputs Q as terminator
        {
            if (operation == '+') {//addition
                Enter('+');
                System.out.print("Enter A : ");
                int a = keyboard.nextInt();
                System.out.print("Enter B : ");
                int b = keyboard.nextInt();
                add(a, b);
            }

            else if (operation == '-') {//subtraction
                Enter('-');
                System.out.print("Enter A : ");
                int a = keyboard.nextInt();
                System.out.print("Enter B : ");
                int b = keyboard.nextInt();
                subtract(a, b);
            }

            else if (operation == 'x') {//multiply
                Enter('x');
                System.out.print("Enter A : ");
                int a = keyboard.nextInt();
                System.out.print("Enter B : ");
                int b = keyboard.nextInt();
                multiply(a, b);
            }

            else if (operation == '/') {//divide
                Enter('/');
                System.out.print("Enter A : ");
                int a = keyboard.nextInt();
                System.out.print("Enter B : ");
                int b = keyboard.nextInt();
                divide(a, b);
            }

            else if (operation == 'Q' || operation == 'q')//terminator
            {
                done = true;
            }

            else//error code
            {
                System.out.println("Error.");
                break;//so that it will not run infinitely
            }
        }
    }

    public static void Enter(char operation) //idk why i did this, but its kind of simple
    {
        System.out.println("A " + operation + " B");
    }

    public static void add(int a, int b) //addition
    {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) // subtraction
    {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) //multiply
    {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) // divide
    {
        System.out.println(a / b);
    }
}
