import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
   public static void main(String[] args) {
        // Prints "Hello, World" in the terminal window.
        System.out.println("Hello, World");

        Date date = new Date();

        System.out.println((date));

        // I also want to write some text to file
        try{
            write();
        }

        catch (Exception e){
            System.out.println("Error: ");
            System.out.println(e);
        }

   }

      public static void write() throws Exception {
	// The FileWriter constructor throws IOException, which must be caught.
    //    PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
     //   File file = new File("/workspace/1tester/results.txt");
    // FileWriter fw = new FileWriter("/workspace/1tester/results.txt", true);
        FileWriter fw = new FileWriter("Out.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        Date date = new Date();

        out.printf("Hello %s! The program has run successfully. ", "Mantas");
        out.printf("The time is %s", date);
        out.println();
        out.close();

    }
}

//try(FileWriter fw = new FileWriter("myfile.txt", true);
//    BufferedWriter bw = new BufferedWriter(fw);
 //   PrintWriter out = new PrintWriter(bw))