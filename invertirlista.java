import java.util.ArrayList;
import java.util.Scanner;
 
class Lista{

   public ArrayList contenido;

   Lista(){
    contenido = new ArrayList();
  } 
   
  public void push(int valor){
        contenido.add(valor);
  }

  public Object popTop(){
      Object out = null;
     if(!isEmpty()){
        out = contenido.get(0);
      contenido.remove(0);
     }
     return out;
    }

    public Object popBack(){
        Object out = null;
        if(!isEmpty()){
            out = contenido.get((contenido.size()-1));
            contenido.remove((contenido.size()-1));
        }
        return out;
    }

    public Boolean isEmpty(){
        return(contenido.size() ==0);
    }

    public int getSize(){
        return contenido.size();
    }

    public void invest(){
        if(isEmpty()){
            return;
        }
        int tamaño = contenido.size() - 1;
        for(int i = tamaño ; i >= 0; i--){
           contenido.add(contenido.get(i));
        }

        int aux = 0;
        final int creo = 0;
        while(aux <= tamaño +1  /2  ){
            contenido.remove(creo);   
            aux++;   
        }

    }

    public ArrayList mostrar(){
      return contenido;
    }

}

public class Invertir {
  public static void main(String[] args) {
   
     Scanner entrada = new Scanner(System.in);
     int N = entrada.nextInt();
     Lista list = new Lista();


     while(N > 0){
           int numero = entrada.nextInt();
           list.push(numero);
           N--;
     }
      list.invest();
     // System.out.println(list.mostrar());
      while(!list.isEmpty()){
          System.out.print(list.popTop()+" ");
      }
  }  
}