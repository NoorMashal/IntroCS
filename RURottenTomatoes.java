/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings
 * from the command line arguments and displays the index of the movie
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE
    int rows = Integer.parseInt(args[0]);
    int cols = Integer.parseInt(args[1]);
    int[][] arr = new int[rows][cols];

    int index = 2;

    for (int j = 0; j < rows; j++){
      for (int k = 0; k < cols ; k++){
        arr[j][k] = Integer.parseInt(args[index]);
        index++;
      }
    }

    int[] sum = new int[cols];
    int s = 0;
    int largest = 0;
    int largestI = 0;

    for (int i = 0; i < cols; i++){
      for (int j = 0; j < rows; j++){
        s+= arr[j][i];
      }
      sum[i] = s;
      s = 0;
    }

    for (int a = 0; a < cols; a++){
      if (largest < sum[a]){
        largest = sum[a];
        largestI = a;
      }
    }

    System.out.println(largestI);
	}
}
