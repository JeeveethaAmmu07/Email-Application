package emailapp;
import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args)  {
       Scanner sc=new Scanner(System.in);
     //User info  
       System.out.println("Enter first name:");
       String f_name=sc.next();
       System.out.println("Enter last name:");
       String l_name=sc.next();

     //creating object for email class
     Email em=new Email(f_name,l_name);
     int choice =-1;
     do{
         System.out.println("\n******\nEnter your choice\n1.Show Info\n2.Change password\n3.Change mailbox capacity\n4.Set Alternate mail\n5.Exit");
         choice = sc.nextInt();
         switch(choice){
            case 1:
               em.getInfo();
               break;
            case 2:
               em.set_password();
               break;
            case 3:
               em.set_mailCap();
               break;
            case 4:
               em.alternate_email();
               break;
            case 5:
               System.out.println("Thank you for using application!");
               break;
            default:
               System.out.println("Invalid choice!!\n Enter proper choice again..");                  
         }
     } 
     while(choice!=5); 
}
}
