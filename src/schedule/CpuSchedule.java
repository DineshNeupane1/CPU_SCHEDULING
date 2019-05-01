package schedule;

import java.io.IOException;
import java.util.Scanner;

public class CpuSchedule {

	public static void main(String[] args)throws IOException {
		
		CpuSchedule schedule= new CpuSchedule();
				
		System.out.println("CPU scheduling algorithm");
		System.out.println();
		System.out.println("1. FCFS");
		System.out.println("2. SJF");
		System.out.println("3. Priority");
		System.out.println("4. Round Robin");
		System.out.println("5. Weighted Round Robin");
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select algorithm :");
		System.out.println();

		int id=sc.nextInt();
		schedule.checkId(sc, id);
		

	}
	
//	public void getdata() {
//		
//		Scanner scan= new Scanner(System.in);
//		int n = scan.nextInt();
//		int bt[]= new int[n];
//	   // int wt[]= new int[n];
//		
//	    for(int i=0;i<n;i++)
//		     {
//		      System.out.print("Enter burst time for job "+(i+1)+" :\t");
//		      bt[i] = scan.nextInt();
//		      scan.close();
//		     
//		}
//		
//	}
	
	public void checkId(Scanner sc,int id)
	{
		if(id<1 || id>5)
		{
			System.out.println("You have entered incorrect ID,Please select valid algorithm ");
			System.out.println();

			 id=sc.nextInt();
			 checkId(sc,id);

		}
		else
		{
			switch(id)
			{
			case 1:
			{
				
             FCFS f=new FCFS();
             f.compute();
    		   

			}
			case 2:
			{
			SJF f= new SJF();
			f.compute_SJF();
			}
			case 3:
			{
				Priority p= new Priority();
				p.compute_priority();
			}
			case 4:
			{
				Round__Robin rr= new Round__Robin();
				rr.compute_Round_robin();
				
				
			}
			case 5:
			{
				weighted_RR wrr= new weighted_RR();
				wrr.compute_weighted_RR();
				
			}
			default:
				//
			
			}
			
		}
				
	}

}
