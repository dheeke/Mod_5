
import java.util.*;

public class fibonacci
{

public static int RecursiveFib(int n)
{
	if (n == 0)
			{
		return 0;
			}
	else if (n == 1)
	{
		return 1;
	}
	
	return RecursiveFib(n-1) + RecursiveFib(n-2);
}

public static int IterativeFib(int n)
{
    int x = 0, y = 1, z = 1;
    for (int i = 0; i < n; i++)
    {
        x = y;
        y = z;
        z = x + y;
    }
    return x;
}


	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);

	System.out.println("Enter the nth number of the Fibonacci sequence to be displayed");
	int input = in.nextInt();
	long startTime = System.nanoTime();
	System.out.println("Recursive Fibonacci function started at:" + startTime + " nanoseconds");
	RecursiveFib(input);
	long stopTime = System.nanoTime();
	System.out.println("Recursive Fibonacci function ended at:" + stopTime + " nanoseconds");
	long totalTime = stopTime - startTime;
	System.out.println("For a total time of:" + totalTime + " nanoseconds");
	
	startTime = System.nanoTime();
	System.out.println("\nIterative Fibonacci function started at:" + startTime + " nanoseconds");
	IterativeFib(input);
	stopTime = System.nanoTime();
	System.out.println("Iterative Fibonacci function ended at:" + stopTime + " nanoseconds");
	totalTime = stopTime - startTime;
	System.out.println("For a total time of:" + totalTime + " nanoseconds");
	
	in.close();
	
	}
}
