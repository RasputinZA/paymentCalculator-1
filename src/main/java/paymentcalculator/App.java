package paymentcalculator;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    static Scanner input = new Scanner(System.in);
    public static void main( String[] args )

    {
        employee emp = new employee();
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        emp.setName(name);


        System.out.print("Please enter your employee number: ");
        String empNumber = input.next();
        emp.setEmpNum(empNumber);

        System.out.print("What is your rate per hour: ");
        double rt = input.nextDouble();
        emp.setRate(rt);

        System.out.print("How many hours did you work this month: ");
        int hrs = input.nextInt();
        emp.setHours(hrs);

        System.out.print("Do you earn 1. A salary or 2. A wage: ");
        int choice = input.nextInt();
        if(choice == 1)
        {
            emp.calculateSalary();
        }
        else
        {
            emp.calculateWage();
        }

    }
}
