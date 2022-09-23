import java.util.Scanner;
//sebastian_quint1
public class Montaña {


    private static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
    
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];
    
        for (int i = 0; i < n1; i++) {
          leftArray[i] = arr[i + l];
        }
    
        for (int j = 0; j < n2; j++) {
          rightArray[j] = arr[j + m + 1];
        }
    
        int i = 0, j = 0;
        int k = l;
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
    
      public static void MergeSort(int arr[], int l, int r) {
        if (l < r) {
          int m = (l + r) / 2;
    
          MergeSort(arr, l, m);
          MergeSort(arr, m + 1, r);
    
          merge(arr, l, m, r);
        }
      }

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); 
      // Scanner input = new Scanner(System.in);

       int N = entrada.nextInt(); 
       int[] montañas = new int[N];
       for(int i = 0; i < N; i++){
           int tamño = entrada.nextInt();
           montañas[i] = tamño;
       }
       MergeSort(montañas, 0, montañas.length-1);
       System.out.println(montañas[N-1]);
       entrada.close();
       //input.close();

    }
}
