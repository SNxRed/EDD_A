import java.util.Scanner;
//sebastian_quint1
public class Promedio {
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
    
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];
    
        for (int i = 0; i < n1; i++) {
          leftArray[i] = arr[i + left];
        }
    
        for (int j = 0; j < n2; j++) {
          rightArray[j] = arr[j + (mid + 1)];
        }
    
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
          if (leftArray[i] <= rightArray[j]) {
            arr[k] = leftArray[i];
            i++;
          } else {
            arr[k] = rightArray[j];
            j++;
          }
          k++;
        }
    
        while (i < n1) {
          arr[k] = leftArray[i];
          i++;
          k++;
        }
    
        while (j < n2) {
          arr[k] = rightArray[j];
          j++;
          k++;
        }
    
      }
    
      public static void MergeSort(int[] arr, int left, int right) {
        if (left < right) {
          int mid = (left + right) / 2;
    
          MergeSort(arr, left, mid);
          MergeSort(arr, mid + 1, right);
    
          merge(arr, left, mid, right);
    
        }
      }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int T = input.nextInt();

            for(int l = 0; l < T; l++){

            int cont = 1; // notas diferentes

            int N = input.nextInt(),  K = input.nextInt(); // diferentes valores en el arreglo
            
            int prom[] = new int[N];

            for(int i = 0; i < N; i++){
                prom[i] = input.nextInt();
            }

            MergeSort(prom, 0, N - 1);

            for(int j = 1; j < N; j++){
                if(prom[j - 1] != prom[j]){
                    cont++;
                }
               //System.out.println(cont);
            }
            

           if(cont == K){
               System.out.println("Bueno");
           }else if(cont > K){
               System.out.println("Promedio");
           }else{
               System.out.println("Malo");
           }
            }


        input.close();
    }
}