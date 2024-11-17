package emailapp;
import java.util.*;

public class Email {
    Scanner sc=new Scanner(System.in);   //Scanner class

  //Setting private variables not to access directly  
    private String fname;
    private String lname;
    private String dept;
    private String email;
    private String password;
    private int mailCapacity = 500;
    private String alter_email;

  //Constructor to receive first name and last name
    Email(String fname, String lname)
        {
            this.fname = fname;
            this.lname = lname;
            System.out.println("******\nNew Employee : "+this.fname+" "+this.lname);
          //Calling methods
            this.dept=this.setDept(); //Department
            this.password=this.generate_password(8); //Password
            this.email=this.generate_email();

    } 
    
  // Generate mail method   
    private String generate_email()
    {
        return this.fname.toLowerCase()+""+this.lname.toLowerCase()+"@"+this.dept.toLowerCase()+".company.com";
    }

  //Asking for dept
    private String setDept()
    {
        System.out.println("\n******\nDEPARTMENT CODES \n1. for sales \n2. for Development \n3. for Accounting \n0. for None");
        boolean flag=false;
        do{
            System.out.println("\nEnter Department code : ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                  return "Sales";
                case 2:
                  return "Development";
                case 3:
                  return "Accounting";
                case 0:
                  return "None";     
                default:
                  System.out.println("Invalid choice please choose it again");  
            }

        }while(!flag);
        return null;
    }

  //Generate Random Password method  
    private String generate_password(int length)
    {
        Random r=new Random();
        String Capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbols="!@#$&?|";
        String values=Capital_chars+Small_chars+numbers+symbols;
        String password="";
        for(int i=0;i<length;i++){
        password =password+values.charAt(r.nextInt(values.length()));
    }
    return password;

    }

  //Change password method
    public void set_password()
    {
        boolean flag = false;
        do { 
            System.out.println("Do you want to change your password (Y/N)");
            char choice = sc.next().charAt(0);
            if(choice=='Y'||choice=='y') {
                flag=true;
                System.out.println("Enter current password : ");
                String temp=sc.next();
                if(temp.equals(this.password))
                {
                     System.out.println("Enter new password : ");
                     this.password=sc.next();
                     System.out.println("Password changed successfully");               
                }
            else{
                System.out.println("Incorrect password");
            }
          }
          else if(choice=='N'||choice=='n')
        {
            flag=true;
            System.out.println("Password changed option cancelled");
        }
        else{
            System.out.println("Enter valid choice");
        }
        }
        while(!flag);
    }

  //set mailbox capacity method  
    public void set_mailCap()
    {
        System.out.println("Current capacity = "+this.mailCapacity+"mb");
        System.out.println("Enter new mailbox capacity:");
        this.mailCapacity=sc.nextInt();
        System.out.println("Mailbox capacity is successfully changed");
    }

  //set alternate mail  
    public void alternate_email()
    {
       System.out.println("Enter the alternate email:");
       this.alter_email=sc.next();
       System.out.println("Alternate email is set");
    }
   
  //Display user information method 
    public void getInfo()
    {
        System.out.println("New : "+this.fname+" "+this.lname);
        System.out.println("Department : "+this.dept);
        System.out.println("Email : "+this.email);
        System.out.println("Password : "+this.password);
        System.out.println("Mailbox capacity : "+this.mailCapacity+"mb");
        System.out.println("Alternate email : "+this.alter_email);

    } 
  } 
   
