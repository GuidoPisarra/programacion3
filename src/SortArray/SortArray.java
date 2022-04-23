package SortArray;

public class SortArray {
    private int [] numeros;
    private int [] helper;
    private int size;


    public void sort(int[] values){
        this.size=values.length;
        this.numeros=values;
        this.helper = new int[size];
        mergeSort(0,size-1);
    }

    private void mergeSort(int low, int high){


        if(low<high){
            int middle=(low+high)/2;
            mergeSort(low,middle);
            mergeSort(middle+1,high);
            merge(low,middle,high);
        }

    }

    private void merge(int low,int middle, int high){

        for (int i =low; i<=high;i++){
            this.helper[i]=this.numeros[i];
        }
        int i=low;
        int j=middle+1;
        int k=low;

        while(i<= middle && j<=high){

            if(helper[i]<=helper[j]){
               numeros[k]=helper[i];
               i++;
            }else{
                numeros[k]=helper[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            numeros[k]=helper[i];
            k++;
            i++;
        }
        while(j<=high){
            numeros[k]=numeros[j];
            k++;
            j++;
        }
    }
}
