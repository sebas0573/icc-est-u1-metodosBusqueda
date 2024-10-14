
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        
        int[] arreglo = {10,20,30,40,50,60,70,80,90,100};
        metodosBusqueda.printArreglo(arreglo);

        int posicion = metodosBusqueda.busquedaSecuencial(arreglo, 50);
        if(posicion != -1){
        System.out.println("\nEl valor se encuentra en la posicion: " + posicion);
        }else{
        System.out.println("\nValor no encontrado");
        }

        System.out.println();

        /*for(int i=1; i<=100000; i++){
            System.out.print(i+" ");
        }*/

        int[] arr = new int[100000];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        metodosBusqueda.printArreglo(arr);

        long starTimeSecuencial = System.nanoTime();
        int posi = metodosBusqueda.busquedaSecuencial(arr, 50108);
        long endTimeSecuencial  = System.nanoTime();
        System.out.println("\nTiempo de ejecucion de la busqueda Secuencial "+ (endTimeSecuencial-starTimeSecuencial) + " nanosegundos.");
        if(posi != -1){
        System.out.println("\nEl valor se encuentra en la posicion: " + posi);
        }else{
        System.out.println("\nValor no encontrado");
        }
        System.out.println();
        
        long starTimeBinaria = System.nanoTime();
        int pos = metodosBusqueda.busquedaBinaria(arr, 50108);
        long endTimeBinaria  = System.nanoTime();
        System.out.println("Tiempo de ejecucion de la busqueda binaria "+ (endTimeBinaria-starTimeBinaria) + " nanosegundos.");
        if(pos!= -1){
            System.out.println("\nEl valor se encuentra en la posicion: " + pos);
        }else{
            System.out.println("\nValor no encontrado");
        }



        
        
        

    }
}
