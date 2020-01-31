public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int result = 0; 
      for (int i = 0; i < arr1.length; i++) {
          result += arr1[i];
      }
      
      for (int j = 0; j < arr2.length; j++) {
            result += arr2[j]; 
      }
      
      return result;
    }
}
