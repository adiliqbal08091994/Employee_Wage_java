public class Employee_wage_Builder_SwitchCaseUC4 
{
    public static void main(String[] args) 
    {
        double val = Math.floor(Math.random()*10 %2);
        double emp_hrs=0;
        int choice = (int)val;
        //System.out.println(choice);
        switch (choice)
        {
            case 1 :emp_hrs = 8;
            System.out.println("emp is full time");
            break;
            case 0 :emp_hrs =  Math.floor(Math.random()*10 %9);
            System.out.println("emp is part time ");
            System.out.println(emp_hrs);
            break;
        }        
        System.out.println(emp_hrs*20);
    }
    
}