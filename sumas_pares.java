import java.util.Scanner;
//sebastian_quint1
public class SusmasPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String N = input.next();
        int pares = 0;
        for(int i = 0; i < N.length(); i++){
            if((int)N.charAt(i) % 2 == 0){
                pares++;
            }
        }
        
        for(int j = 0; j < N.length(); j++){
            System.out.print(pares+" ");
            if((int)N.charAt(j) % 2 == 0){
                pares--;
            }
            
        }

        input.close();
        

    }
}