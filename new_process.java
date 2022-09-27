//Create a new process by invoking the appropriate system call. Get the process identifier of the currently running process and its respective parent using system calls and display the same using a C program
import java.util.Scanner;
public class new_process{
    public static void main(String[] args){
        try{
            System.out.println("Creating Process");
            ProcessBuilder builder=new ProcessBuilder("notepad.exe");
            Process pro=builder.start();

            System.out.println("Waiting");
            Thread.sleep(10000);

            pro.destroyForcibly();
            System.out.println("Process destroyed");


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
