public class StatsCalculator {

    public static void main(String[] args) {
        // 1. Initialize the 2D array with the sample data (you may copy and paste it from sample_data.txt)
        double[][]scores = {
          {85.5, 90.0, 78.5, 92.0},
          {76.0, 88.5, 90.0, 85.0},
          {95.0, 92.0, 94.5, 98.0},
          {60.0, 70.5, 65.0, 72.0},
          {82.0, 84.0, 80.0, 88.0}

        };
        // 2. Call methods
        System.out.println("--- GradeBook Statistics ---\n");
        calculateStudentAverages(scores);
        System.out.println();
        calculateAssignmentAverages(scores);
        System.out.println();
        findHighestScore(scores);
    }

    // TODO: Implement this method
    public static void calculateStudentAverages(double[][] data) {
        System.out.println("Student Averages:");
        for (int i = 0; i < data.length; i++ ){
          double sum = 0;
          for (int j = 0; j < data[i].length; j++){
            sum += data [i][j];
          }
        double avg = sum / data[i].length;
        System.out.println("Student " + (i + 1)  + ": " + avg);
        }
    }

    // TODO: Implement this method
    public static void calculateAssignmentAverages(double[][] data) {
        System.out.println("Assignment Averages:");

        for (int i = 0; i < data[0].length; i++ ){
          double sum = 0;
          for (int j = 0; j < data.length; j++){
            sum += data [j][i];
          }
          double avg = sum / data.length;
          System.out.println("Assignment " + (i + 1) + ": " + avg);
        }


        // Your logic here (Column-major traversal)
    }

    // TODO: Implement this method
    public static void findHighestScore(double[][] data) {
      double highestScore = 0;
      int studentIndex = 0;
      int assignmentIndex = 0;
      for (int i = 0; i < data.length; i++){
      for (int j = 0; j < data[i].length; j++){
        if (data[i][j] > highestScore){
          highestScore = data [i][j];
          studentIndex = i + 1;
          assignmentIndex = j + 1;

        }
      }
    }
        System.out.println("Highest score in class: " + highestScore + " (Student " + studentIndex + ", Assignment " + assignmentIndex + ")");
      }
         // Your logic here
    }