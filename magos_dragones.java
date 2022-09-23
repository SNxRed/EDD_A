import java.util.*;

class Dragon{
    private int ps = 0;
    private int dps = 0;
    
    public Dragon(int ps , int dps){
        this.ps = ps;
        this.dps = dps;
    }

    public int ps_dragon(){
        return this.ps;
    }
    public int dps_dragon(){
        return this.dps;
    }

}
public class Pelea {
    
    public static Dragon[] ordenar_dragon(Dragon[] a){ // ordena 
         
        int n = a.length;
        for(int i = 0; i < n - 1; i++){
              for(int j = 0; j < n - i - 1; j++){
                  if(a[j].ps_dragon() > a[j + 1].ps_dragon()){
                      Dragon temp = a[j];
                      a[j] = a[j+1];
                      a[j+1] = temp;

                  }
              }
        }
        return a;
        
    }

   public static int dano_recibido(Dragon[] d){ //daño
          
         int aux = 0;
         int aux2 = 0;
         int aux3 = 0;

         for(int i = 0; i < d.length; i++){
             aux = aux + d[i].dps_dragon();
         }
  
         for(int j = 0; j < d.length; j++){
         aux2 = aux2 + d[j].ps_dragon()*(aux - aux3);
         aux3 = aux3 + d[j].dps_dragon();
         }
        return aux2;
    }
    public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in);
       int X = entrada.nextInt();

       int[] PS = new int[X];
       int[] DPS = new int[X];

      
       for(int j = 0; j < DPS.length; j++){
        int dano = entrada.nextInt();
        DPS[j] = dano;
    }
     
      for(int i = 0; i < PS.length; i++){
           int vida = entrada.nextInt();
           PS[i] = vida;
       
    }
     Dragon[] dragon = new Dragon[X];
    for(int w = 0; w < dragon.length; w++ ){
        dragon[w] = new Dragon(PS[w],DPS[w]);
    }
     
    
     System.out.println(dano_recibido(dragon));
      entrada.close();
    }
}