package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
         int d=arr.length -1;
          int n=arr.length;
          int temp[] = new int[d];
 
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
 
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
 
  
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + ",");
    
  }

}
