/*A
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author user
 */
public class C_SlectionSort {
    public static void SelectionSort(int[]A){
        int Index;//index=pointer
        int pass,j,n=A.length;
        int temp;
        
        for(pass=0;pass<n-1;pass++){//pass=0;0<4-T
            Index=pass;//0
            for(j=pass+1;j<n;j++){//mementukan data terkecil
                if(A[j]<A[Index]){//ketika data yang paling kecil kurang dari data pointer
                    Index=j;
                }
            }
            temp=A[pass];//3
            A[pass]=A[Index];//apas=index terkecil//25
            A[Index]=temp;//3
        }
    }
    public static void tampil (int data[]){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[]A={25,7,9,13,3};
        C_SlectionSort.tampil(A);
        C_SlectionSort.SelectionSort(A);
        C_SlectionSort.tampil(A);
    }
}
