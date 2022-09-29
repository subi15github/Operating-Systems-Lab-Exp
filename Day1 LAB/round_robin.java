import java.util.Scanner;
public class round_robin{
    public static void main(String[] args){
        int i, NOP, sum=0,count=0, y, quant, wt=0, tat=0, at[], bt[], temp[];  
        float avg_wt, avg_tat;
        Scanner s=new Scanner(System.in);
        at=new int[10];
        bt=new int[10];
        temp=new int[10];
        System.out.println(" Total number of process in the system: ");  
        NOP=s.nextInt();
        y = NOP;
        // Use for loop to enter the details of the process like Arrival time and the Burst Time
       
       for(i=0; i<NOP; i++)  
       {
       System.out.format("\n Enter the Arrival and Burst time of the Process[%d]\n", +(i+1));
       System.out.println(" Arrival time is: \t");  // Accept arrival time  
       at[i]=s.nextInt();  
       System.out.println(" \nBurst time is: \t"); // Accept the Burst time  
       bt[i]=s.nextInt();  
       temp[i] = bt[i]; // store the burst time in temp array  
       }  
// Accept the Time qunat  
       System.out.println("Enter the Time Quantum for the process: \t");  
       quant=s.nextInt();  
// Display the process No, burst time, Turn Around Time and the waiting time  
       System.out.println("\n Process No \t\t Burst Time \t\t\tTAT \t\t\tWaiting Time ");  
       for(sum=0, i = 0; y!=0; )  
      {  
        if(temp[i] <= quant && temp[i] > 0) // define the conditions   
         {  
            sum = sum + temp[i];  
            temp[i] = 0;  
            count=1;  
         }     
        else if(temp[i] > 0)  
         {  
            temp[i] = temp[i] - quant;  
            sum = sum + quant;    
         }  
        if(temp[i]==0 && count==1)  
        {  
            y--; //decrement the process no.  
            System.out.format("\nProcess No[%d] \t\t %d\t\t\t\t %d\t\t\t %d", +(i+1), +bt[i], +(sum-at[i]), +(sum-at[i]-bt[i]));  
            wt = wt+sum-at[i]-bt[i];  
            tat = tat+sum-at[i];  
            count =0;     
        }  
        if(i==NOP-1)  
        {  
            i=0;  
        }  
        else if(at[i+1]<=sum)  
        {  
            i++;  
        }  
        else  
        {  
            i=0;  
        }  
    }  
// represents the average waiting time and Turn Around time  
avg_wt = wt * 1/NOP;  
avg_tat = tat * 1/NOP;  
System.out.format("\n Average Turn Around Time: \t%f", +avg_wt);  
System.out.format("\n Average Waiting Time: \t%f", +avg_tat);   
}  
}
