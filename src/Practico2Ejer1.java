// OJO RECURSION solo en busquedas o en arboles

import SortArray.SortArray;

public class Practico2Ejer1 {

    public static int ordenado(int[] arreglo, int n) {

        if ((n<arreglo.length-1)&&(arreglo[n]<arreglo[n+1])){
            return  ordenado(arreglo,n+1);
        }else{
            if(n == arreglo.length-1){
                return 1;
            }
        }
        return -1;
    }

    public static float convertToBinary(int numero){

        if (numero>0) {
            convertToBinary(numero/2);
            System.out.print(numero % 2);
        }
        return numero;
    }

//arreglo ordenado por seleccion
    public static void sortAr(int []  arreglo){
        for (int i = 0; i < arreglo.length - 1; i++)
        {
            int min = i; //auxiliar para la pos i
            //desde la pos i hasta el fin del arreglo
            for (int j = i + 1; j < arreglo.length; j++)
            {
                //si el valor en la pos j < la pos del auxiliar i (el que divide el arreglo)
                //entonces traslado el auxiliar hasta que encuentra el mayor
                if (arreglo[j] < arreglo[min])
                {
                    min = j;
                }
            }
            //si la i es != de min (pos que divide el arreglo)
            //intercambia los valores
            if (i != min)
            {
                int aux= arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
    }
//idem anterior, pero burbujeo
    public static void sortArr(int []  arreglo){

        for (int i= 0; i<(arreglo.length-1);i++){
            for(int j=0;j<(arreglo.length-1-i);j++){
                if(arreglo[j]>arreglo[j+1]){
                    int aux=arreglo[j+1];
                    arreglo[j+1]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
    }







    public static void main(String[] args) {
       int[] array = {1,9,2,8,3,4,5};
//        int n = 0;
 //      int orden = sortAr(array, n );
//        System.out.println(orden);
//
//        MySimpleLinkedList listaNueva = new MySimpleLinkedList<Integer>();
//        listaNueva.toString();
//
//        listaNueva.insertFront(5);
//        listaNueva.insertFront(6);
//        listaNueva.insertFront(8);
//        System.out.println(listaNueva.isEmpty());
//        System.out.println( listaNueva.get(4));
//listaNueva.toString();

        //sortArr(array);
        //for (int i = 0 ; i<array.length;i++){
        //    System.out.print(array[i]);
        //}
        //convertToBinary(8);
        SortArray m = new SortArray();
        m.sort(array);
        for (int i = 0 ; i<array.length;i++){
            System.out.print(array[i]);
        }
    }






}