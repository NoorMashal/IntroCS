public class FindDuplicate{
  public static void main(String[] args){

    int n = args.length;
    int num;
    int[] arr = new int[n];
    boolean dub = false;

    for(int i = 0; i <n; i++){
      arr[i] = Integer.parseInt(args[i]);
    }


    for (int j = 0; j < n; j++){
      num = arr[j];
      for (int k = j+1; k < n; k++){
        if (num == arr[k])
          dub = true;
      }
    }
    System.out.println(dub);
  }
}
