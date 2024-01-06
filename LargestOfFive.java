public class LargestOfFive{
  public static void main(String[] args){
    int largest = -999999999;
    for (int i = 0; i < args.length; i++)
      if (Integer.parseInt(args[i]) > largest)
        largest = Integer.parseInt(args[i]);

    System.out.println(largest);
  }
}
