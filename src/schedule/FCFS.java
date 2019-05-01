package schedule;

import java.util.Scanner;

public class FCFS {

	public void compute(){
		
		
	     float avgWt,totalWt=0;
	     Scanner scan = new Scanner(System.in);
	     System.out.print("Enter total number of processes\t");
	     int n = scan.nextInt();
	     int bt[]= new int[n];
	     int wt[]= new int[n];
	     
	     for(int i=0;i<n;i++)
	     {
	      System.out.print("Enter burst time for job "+(i+1)+" :\t");
	      bt[i] = scan.nextInt();
	     }
	     scan.close();
	     System.out.print("\n\nWaiting time for Job 1 : 0 units\t");
	         wt[0]=0;
	         for(int i=0;i<n;i++) {
	         System.out.println("\nturnaround time=" +bt[i]);
	         }
	     for(int i=1;i<n;i++)
	     {
	         wt[i]=bt[i-1]+wt[i-1];
	         System.out.print("\nWaiting time for Job"+(i+1)+" : "+wt[i]+" units \t");
	         totalWt = totalWt + wt[i];
	         
	     }
	     System.out.print("\n\nThe total waiting time : "+totalWt);
	     avgWt= totalWt/n;
	     System.out.println("\n\nAverage waiting time : "+avgWt);
	     System.out.println("\n\nAverage turnaround time : "+avgWt);

	
	}

}
