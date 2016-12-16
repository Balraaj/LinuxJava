package FileHandling;

import java.io.*;
import java.util.Scanner;

public class WriteFile
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("myfile.txt");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text : ");
        String str = in.nextLine();

        while(!str.equals("stop"))
        {
            try
            {
                fw.write(str);
                fw.write("\n");
                str = in.nextLine();
            }
            catch(IOException e)
            {

            }
        }

        in.close();
        fw.close();

    }
}
