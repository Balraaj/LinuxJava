package FileHandling;

import java.io.*;

public class ReadFile
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("myfile.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("myfile1.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String str = br.readLine();
        while(str!=null)
        {
            bw.write(str);
            bw.write("\n");
            str = br.readLine();
        }

        bw.close();
        br.close();

    }

}
