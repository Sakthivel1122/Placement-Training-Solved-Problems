import java.util.Arrays;

public class othermeth {

    public static void main(String[] args) 
	{
        int[] numbers = {1,2,3,4,5};
        
        Thread avgThread = new Thread(() -> 
		{
            double sum = 0;
            for (int number : numbers) 
			{
                sum += number;
            }
            double avg = sum / numbers.length;
            System.out.println("Average: " + avg);
        }
		);
        
        Thread maxThread = new Thread(() -> 
		{
            int max = Arrays.stream(numbers).max().getAsInt();
            System.out.println("Maximum: " + max);
        }
		);
        
        Thread minThread = new Thread(() -> 
		{
            int min = Arrays.stream(numbers).min().getAsInt();
            System.out.println("Minimum: " + min);
        }
		);
        
        avgThread.start();
        maxThread.start();
        minThread.start();
    }
}