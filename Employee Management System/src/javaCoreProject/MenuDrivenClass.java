package javaCoreProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class MenuDrivenClass 
{
   
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        List<EmployeeDetails> obj1 = new ArrayList<EmployeeDetails>();
       // MyException ex = new MyException();
        int num;
        do 
        {
            System.out.println("----------------------------------------");
            System.out.println("1-->For Entering the Employee Details");
            System.out.println("2-->For Display the Employee Details");
            System.out.println("3-->For Search the Employee Details");
            System.out.println("4-->For Remove the Employee Details");
            System.out.println("5-->For Update the Employee Details");
            System.out.println("0-->For Exit");
            System.out.println("----------------------------------------");
            System.out.println("select the above option ");
            num = in.nextInt();
//            try {
//                if(num<0 && num <4) 
//                {
//                    throw new MyException();
//                    
//                }
//            
//            }
//            catch(MyException e) 
//            {
//                System.out.println("error! please check the input and try again");
//            }
            
            switch(num)
            {
            //for create employee details
            case 1:
            {
                
                System.out.print("Enter your EmployerId:");
                int empId = in.nextInt();
                
                System.out.print("Enter your Name:");
                String empName = scan.nextLine();
                
                System.out.print("Enter your Mobile Number:");
                long MobileNumber = in.nextLong();
                
                System.out.print("Enter your Address:");
                String empAddress = scan.nextLine();
                
                System.out.print("Enter your Salary:");
                int  empSalary = in.nextInt();
                
                System.out.print("Enter your Job Type:");
                String  empJobType = scan.nextLine();
                
                
                
                obj1.add(new EmployeeDetails(empId,empName,MobileNumber,empAddress,empSalary,empJobType));
                System.out.println("your details are added succesfully!");
                
                break;
             }
            //for display employee details
            case 2:
            {
                Iterator<EmployeeDetails> itr = obj1.iterator();

                while(itr.hasNext())
                {
                    EmployeeDetails emp = itr.next();
                    System.out.println(emp);
                }
                break;
            }
            //for searching employee details
            case 3:
            {
                boolean flag = false;
                System.out.println("enter employee id to search");
                int num1 = in.nextInt();
                
                Iterator<EmployeeDetails> itr = obj1.iterator();

                while(itr.hasNext())
                {
                    EmployeeDetails emp = itr.next();
                    if(emp.getEmpId() == num1) 
                    {
                        System.out.println(emp);
                        flag =true;
                        //break;
                    }
                }
                if(!flag)
                {
                    System.out.println("the entered employee id is not found");
                    System.out.println("Type 1 to add! (OR) search again with existing employee id!");
                 }
              break;
        }
            //For Remove the Employee Details
            case 4:
            {
                boolean flag = false;
                System.out.println("enter the employee id to remove");
                int num1 = in.nextInt();
                
                Iterator<EmployeeDetails> itr = obj1.iterator();
                
                while(itr.hasNext())
                {
                    EmployeeDetails emp = itr.next();
                    if(emp.getEmpId() == num1)
                    {
                        itr.remove();
                        flag =true;
                    }
                }
                if(!flag)
                {
                    System.out.println("the entered employee id is not found");
                    System.out.println("please enter valid employee id!");
                 }else
                 {
                    System.out.println("Employee details deleted successfully");
                 }
                
              break;  
            }
            //for update employee details
            case 5:
            {
                boolean flag = false;
                System.out.println("enter your employee id to update");
                int num1 = in.nextInt();
                
                ListIterator<EmployeeDetails> itr =  obj1.listIterator();
                
                while(itr.hasNext())
                {
                    EmployeeDetails emp = itr.next();
                    if(emp.empId == num1)
                    {
                        System.out.print("enter your new Employee ID:");
                        int empId = in.nextInt();
                        
                        System.out.print("Enter your new Name:");
                        String empName = scan.nextLine();
                        
                        System.out.print("Enter your new Mobile Number:");
                        long MobileNumber = in.nextLong();
                        
                        System.out.print("Enter your new Address:");
                        String empAddress = scan.nextLine();
                        
                        System.out.print("Enter your new Salary:");
                        int  empSalary = in.nextInt();
                        
                        System.out.print("Enter your new Job Type:");
                        String  empJobType = scan.nextLine();
                        
                        itr.add(new EmployeeDetails(empId, empName, MobileNumber, empAddress, empSalary, empJobType));
                        flag = true;
                        
                    }
                }
                if(!flag)
                {
                    System.out.println("the entered employee id is not found");
                    System.out.println("please enter valid employee id!");
                 }else
                 {
                    System.out.println("your details are Updated Successfully...!");
                 }
                break;
            }
            default:
            {
                System.err.println("please enter correct input as mentioned above");
            }
                
            }
            }
        while(num !=0);
        if(num ==0)
        {
            System.out.println("thanks for using");
        }
       
        }
    
    }

