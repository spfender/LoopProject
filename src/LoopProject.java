import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopProject
{

    public static void main(String[] args)
    {
    	List<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        	for(int i=0; i<5; ++ i)
        	{
        		System .out.println (" Input number ?");
        		Integer value = Integer.parseInt(scan.nextLine());
        		numbers.add(value);
        	}
        		System.out.println("Your array is:" + numbers);
        
            int highestFoundValue = numbers.get(0);
            for(Integer value:numbers)
            {
                highestFoundValue = Math.max(highestFoundValue, value);
            }
            System.out.println("The highest number in your array is: " + highestFoundValue);
            
            
            int minValue = numbers.get(0);
            for(Integer value:numbers)
            {
            	minValue = Math.min(minValue, value);
            }
            System.out.println("The lowest number in your array is: " + minValue);
            
            int sum = 0;
            for(int value:numbers)
            {
            	sum += value;
            }
         System.out.println("The numbers add up to:" + sum);
         	
         	int product = 1;
         	for(int value:numbers)
         	{
         		product *= value;
         	}
         System.out.println("The product of the numbers are:" + product);
            
    }

}
