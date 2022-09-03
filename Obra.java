# java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alejo
 */
public class Obra {
  // public static void main(String[] args){
        //punto1
        //Obra.Clases(args);
        //punto3
        //Obra.noTengo(args);
        //punto4
        //Obra.puedoCambiar(args);
   // } 
    //punto1
    private static void Clases(String[] args) {
        int arr[] = {11,11,8,7,2,2,7,8,8,8,3,11}; 
            Arrays.sort(arr); 
            int length = arr.length;  
            length = eliminarclases(arr, length);   
            for (int i=0; i<length; i++)  
               System.out.print(arr[i]+" ");
    }
    public static int eliminarclases(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] tempA = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                tempA[j++] = arr[i];  
            }  
         }  
        tempA[j++] = arr[n-1];      
        for (int i=0; i<j; i++){  
            arr[i] = tempA[i];  
        }  
        return j;  
    }  
    //Punto2

    //punto3
        public static void noTengo (String[] args) {
            // Comparando dos array de enteros
            // Obtenemos los elementos distintos del array a y lo comparamos con el array b
            int[] a = {3,5,7,10,15,16};
            int[] b = {4,10,5,8};
            // Covertimos el array (a) a una lista
            List<Integer> listaA = Arrays.stream(a).boxed().collect(Collectors.toList());
            // Covertimos el array (b) a una lista
            List<Integer> listaB = Arrays.stream(b).boxed().collect(Collectors.toList());
            List<Integer> listaC = listaA.stream().filter(item -> !listaB.contains(item)).collect(Collectors.toList());
            // Se imprime el resultado de elementos distintos
            System.out.println(listaC);
        }
        //punto4
          public static void puedoCambiar(String[] args) {
            System.out.println();
            int[] array1 = {4,5,51,52,53,53,53};
            Arrays.sort(array1);
            int[] array2 = {4,5,88,89,90,91,91};
            Arrays.sort(array2);
            int count = 0;
            int sum1 = 0;
            int sum2 = 0;
            int total = 0;
            int tamanio1 = array1.length;
            tamanio1 = eliminarRepetidos(array1, tamanio1);
            int tamanio2 = array2.length;
            tamanio2 = eliminarRepetidos(array2, tamanio2);

            for(int i=0;i<array1.length;i++){//recorrer el primer array
                for(int j=0;j<array2.length;j++){//recorriendo el segundo array
                    if(array1[i] == array2[j]){//identificando si hay un igual 
                        count += 1; // contamos los campos iguales
                        sum1 = tamanio1 - count;
                        sum2 = tamanio2 - count;  
                        
                    }
                }
            }
            if (sum1 >= sum2) {
                total = sum2;  
            }
            else{
                total = sum1;
            }
            System.out.println(total);//imprimir la cuenta de iguales
        }
}
