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
public class F_mergesort {
  
 private int[] array;
 private int[] tempMergArr;
 private int length;
 
 public F_mergesort(int[] array) {
 this.array = array;
 this.length = array.length;
 this.tempMergArr = new int[length];
 }
 
 public void mergeSort(int lowerIndex, int higherIndex) {
 if (lowerIndex < higherIndex) {
 int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
 // Below step sorts the left side of the array
 mergeSort(lowerIndex, middle);
 // Below step sorts the right side of the array
 mergeSort(middle + 1, higherIndex);
 // Now merge both sides
 mergeParts(lowerIndex, middle, higherIndex);
 }
 }
 
 private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 for (int i = lowerIndex; i <= higherIndex; i++) {
 tempMergArr[i] = array[i];
 }
 int i = lowerIndex;
 int j = middle + 1;
 int k = lowerIndex;
 while (i <= middle && j <= higherIndex) {
 if (tempMergArr[i] <= tempMergArr[j]) {
 array[k] = tempMergArr[i];
i++;
 } 
 else {
 array[k] = tempMergArr[j];
 j++;
 }
 k++;
 }while (i <= middle) {
 array[k] = tempMergArr[i];
 k++;
 i++;
 }
 }
 public void tampil() {
 for (int i = 0; i < array.length; i++) {
 System.out.print(array[i] + " ");
 }
 System.out.println();
 }
 public static void main(String[] args) {
 int[] inputArr = {25, 7, 9, 13, 3};
 F_mergesort mms = new F_mergesort(inputArr);
 mms.tampil();
 mms.mergeSort(0,inputArr.length-1);
 mms.tampil();
 }
}


