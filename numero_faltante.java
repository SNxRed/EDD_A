import java.util.*;

public class Numero_F{

     public static void main(String[] args) {

          Scanner n = new Scanner(System.in);
          int N = n.nextInt();
        
          
          int[] arr = new int[N-1];
        
        for(int i = 0; i< arr.length; i++){
            int output = n.nextInt();
            arr[i] = output;
        }

         int[] aux = new int[N];
         int num = 0;

        for(int j = 0; j<arr.length; j++){
          num = arr[j];  
          aux[num-1] = num;
          
        }
        num = 0;
        for(int w = 0; w < aux.length; w++){
            if (aux[w] == 0){
                num = w + 1;
            }
        }

        System.out.println(num);
       n.close();
    }
    
}