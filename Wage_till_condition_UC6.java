public class Wage_till_condition_UC6 
{
    public static void main(String[] args) 
    {
        double wage = 0;
        int days = 0;
        double hours = 0;
        double daily_hour=0;
        while ( days <20 && hours < 100)
        {
            daily_hour = Math.random()*10 %9;
            if (Math.floor(Math.random()*10 %2)==0)
                hours+=daily_hour;
            else 
                hours+=8;
            
            wage+=(hours*20);
            days+=1;
        }
        System.out.println(wage);
    }
    
}