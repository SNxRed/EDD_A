import java.util.*;
//sebastian_quint1
public class matriz {

    public static void BFS(int start, int V, int[][] matrix, int[] influencia){ // Se utiliza una Queue (cola)
        boolean visited[] = new boolean[V];
        LinkedList<Integer> list = new LinkedList<Integer>();

        visited[start] = true;
        list.addLast(start);
        int cont = 0;
        while(list.size() != 0){
            int current = list.removeFirst();
            //System.out.println(current);
            cont += influencia[current]; 

            for(int neighor = 0; neighor < V ; neighor++){
                if(!visited[neighor] && matrix[current][neighor] != 0) {
                       list.addLast(neighor);
                       visited[neighor] = true;
                }
                
            }
        }
        System.out.println(cont);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // cantidad de usuarios
        int X = input.nextInt(); // id del usuario de comienzo

        int influencia[] = new int[N];
        int matr[][] = new int[N][N];

        for(int i = 0; i < N; i++){
            influencia[i] = input.nextInt();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matr[i][j] = input.nextInt();
            }
        }
         BFS(X, N, matr, influencia);
        

        

        input.close();
    }
    
}