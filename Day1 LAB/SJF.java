import java.util.Arrays;
import java.util.Scanner;
public class SJF {
    public static void main(String[] args){
        int i,no_p,bt[],tt[],wt[];
        float avg_tt=0,avg_wt=0;

        bt=new int[20];
        tt=new int[20];
        wt=new int[20];
        wt[0]=0;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of processes:");
        no_p=s.nextInt();

        System.out.println("Enter Burst Time for processes:");
        for(i=0;i<no_p;i++){
            System.out.print("\tP"+(i+1)+": ");
             bt[i]=s.nextInt();
             }
        
        for(i=0;i<no_p;i++){
            for(int j=i+1;j<no_p;j++){
                int temp=0;
                if(bt[i]>bt[j]){
                    temp=bt[i];
                    bt[i]=bt[j];
                    bt[j]=temp;
                }

            }
        }
        

        for(i=1;i<no_p;i++){
            wt[i]=wt[i-1]+bt[i-1];
            avg_wt+=wt[i];
        }
        avg_wt/=no_p;

        for(i=0;i<no_p;i++){
            tt[i]=wt[i]+bt[i];
            avg_tt+=tt[i];
        }
        avg_tt/=no_p;

        System.out.println("\n******************************************************************");
        System.out.println("\tProcesses:");
        System.out.println("********************************************************************");
        System.out.println("  Process\tBurst Time\tWaiting Time\tTurn Around Time");
        for(i=0;i<no_p;i++){
            System.out.println("\tP"+(i+1)+"\t "+bt[i]+"\t\t "+wt[i]+"\t\t "+tt[i]);
        }
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("\nAverage Waiting Time : "+avg_wt);
        System.out.println("\nAverage Turn Around Time : "+avg_tt);

    }

}