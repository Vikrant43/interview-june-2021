package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
     int binary[] = new int[40];    
     int index = 0;  
     String str="";
     while(decimal > 0){    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       str+=binary[i];    
     }  
    return str;
     
  }
}
