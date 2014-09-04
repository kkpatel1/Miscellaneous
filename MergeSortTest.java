import java.util.*;
class MergeSort{
	private int[] numbers;
	private int []helper;
	private int number;
	public void sort(int [] values){
		this.numbers=values;
		number=values.length;
		this.helper=new int[number];
		mergeSort(0,number-1);
	}
	private void mergeSort(int low,int high){
		if(low<high){
			int middle=low+(high-low)/2;
			mergeSort(low,middle);
			mergeSort(middle+1,high);
			merge(low,middle,high);
		}
	}
	private void merge(int low,int middle,int high){
		for(int i=low;i<=high;i++){
			helper[i]=numbers[i];
		}
		int i=low;
		int j=middle+1;
		int k=low;
		while(i<=middle && j<=high){
			if(helper[i]<=helper[j]){
				numbers[k]=helper[i];
				i++;
			}
			else{
				numbers[k]=helper[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			numbers[k]=helper[i];
			k++;
			i++;
		}
	}
}
public class MergeSortTest{
	public static void main(String []args){
		int n=10;	//Length of Array
		int array[]=new int[n];
		System.out.println("\nInitial Randomise Array");
		for(int i=0; i<n; i++) {
			array[i] = (int)(Math.random()*50);
			System.out.print(array[i]+" ");
		}
		System.out.println();
		MergeSort a = new MergeSort();
		a.sort(array);
		System.out.println("\nFinal Sorted Array");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}