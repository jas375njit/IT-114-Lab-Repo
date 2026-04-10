import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradeProcessor {

  public static void main(String[] args) {
    // Input and Output file names
    String inputFileName = "student_data.txt";
    String outputFileName = "grade_report.txt";

    // TODO 1: Wrap your code in a try-catch block.
    // The catch block should handle 'FileNotFoundException'.
    try{

      // TODO 2: Create a File object and a Scanner to read the input file.
      File inputFile = new File (inputFileName);
      Scanner s = new Scanner (inputFile);

      // TODO 3: Create a PrintWriter object to write to the output file.
      System.out.println("Processing file...");
      PrintWriter pw = new PrintWriter (outputFileName);

      // Write the header to the output file separated by tab characters (\t);
      pw.println("Name\tAverage\tStatus");

      // Print a dashed line ("--------------------");
      pw.println("--------------------");

      // TODO 4: Create a while loop to process the file line by line.
      while(s.hasNextLine()){

      //   - Read the name (String)
        String name = s.next();

      //   - Read the three scores (int or double)
        int score1 = s.nextInt();
        int score2 = s.nextInt();
        int score3 = s.nextInt();

      //   - Calculate the average
        int sumNumbers = score1 + score2 + score3;
        double avg = sumNumbers / 3.0;

      //   - Determine "Pass" or "Fail" (Pass is >= 70.0)
        String passOrFail = "";
        if (avg >= 70){
          passOrFail = "Pass";
        } else {
          passOrFail = "Fail";
        }

      //   - Write the formatted line to the output file
        pw.println(name + "\t" + Math.round(avg * 10.0)/10.0 + "\t" + passOrFail);
      }

      // TODO 5: Close both the Scanner and the PrintWriter.
      s.close();
      pw.close();
      System.out.println("Done! Check " + outputFileName + " for results.");
    }

    // TODO 6: catch block:
    catch (FileNotFoundException e){
      System.out.println("Error: Input file '" + inputFileName + "' was not found.");
    }
  }
}