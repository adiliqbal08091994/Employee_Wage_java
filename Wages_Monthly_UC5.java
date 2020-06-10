public class Wages_Monthly_UC5 
{
    public static void main(String[] args) 
    {
        int day_count=0;
        double wage = 0;
        while (day_count < 20 )
        {
            if (Math.floor(Math.random()*10 %2) == 1 )
                wage = wage + 20 * (Math.random()*10 %9);
            else
                wage+= 20*8;
            //System.out.println(wage);
            day_count+=1;

        }
        System.out.println(wage);
        

        
    }
    
}