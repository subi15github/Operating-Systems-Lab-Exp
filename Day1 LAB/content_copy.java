import java.io.*;
import java.util.*;
public class content_copy {
    public static void copyData(File A,File B) throws Exception
    {
        FileInputStream in = new FileInputStream(A);
        FileOutputStream out = new FileOutputStream(B);

        int n;
        while((n=in.read()) !=-1)
        {
            out.write(n);
        }
        if(in !=null)
        {
            in.close();
        }
        if(out !=null)
        {
            out.close();
        }
        System.out.println("Files Copied.");
    }
    public static void main(String[] args) throws Exception{
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Source File Name : ");
        String file_a=sc.nextLine();
        File source = new File(file_a);
        
        System.out.println("Enter source file name :");
        String file_b=sc.nextLine();
        File destination=new File(file_b);

        copyData(source,destination);

    }
    
}
