public class Part_Time_employee_wage_Builder_UC3 
{
    public static void main(String[] args) 
    {
        double part_time_duration=Math.floor(Math.random()*10 % 9);
        int wage_rate=20;
        if ( Math.floor(Math.random()*10 %2) == 1)
            System.out.println(wage_rate*part_time_duration);
        else
            System.out.println("he is full time");
    
        
    }
    
}