import java.util.*;

public class Question3{
	public static void main(String[] args){
		Thread b1 = new Thread();
		b1.start();

	}

	class ThreadB extends Thread
	{
		public void run()
		{
    			for(int i = 1; i <= 1000; i++)
			{
    				System.out.println("ThreadB");
    				try
				{
      					sleep(1000);
      				}
				catch (InterruptedException e)
				{
      					return;
     				}
    			 }
   		}
	}

}

