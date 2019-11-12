import java.util.Scanner;
public class master_class 
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a choice:");
        System.out.println("Choices: \na)*disaster_program1*\nb)*disatser_program2");
        char choice = sc.nextLine().charAt(0);
        switch(choice)
        {
            case 'a' :PD_1 obj = new PD_1();
                        obj.main();
                        break;
            case 'b' :PD_2 obj1 = new PD_2();
                        obj1.printer_d2();
                        break;
            default:System.out.println("Sorry; wrong choice");
        }
    }
}
