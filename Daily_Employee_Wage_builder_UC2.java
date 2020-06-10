public class Daily_Employee_Wage_builder_UC2 
{
    public static void main(String[] args) 
    {
        int wage_rate=20;
        int duration=8;
        double total_daily_wage=(20*8);
        if ((Math.floor(Math.random()*10)%2) == 0 )
            System.out.println(total_daily_wage);
        else 
            System.out.println("emp is part time");
        
        
    }
    
}