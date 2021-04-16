/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author user
 */
public class E_quicksort {
    private static int partition(int []A,int p,int r){
        int i,j;
        double pivot;
        pivot=A[p];
        i=p-1;
        j=r+1;
        for(;;){
            do{
                i++;
            }while(A[i]<pivot);
            do{
                j--;
            }while(A[j]>pivot);
           
            if(i<j){
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }else{
                return j;
            }
        }
    }
    public static void quicksort(int[]A ,int p,int r){
        int q;
        if(p<r){
            q=partition(A,p,r);
            quicksort(A,p,q);
            quicksort(A,q+1,r);
        }
    }
    public static void tampil(int data[]){
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[]A={25,7,9,13,3};
        E_quicksort.tampil(A);
        E_quicksort.quicksort(A,0,A.length-1);
        E_quicksort.tampil(A);
    }
}
