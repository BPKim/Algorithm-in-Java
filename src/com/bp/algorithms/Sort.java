 package com.bp.algorithms;

import java.security.AllPermission;

public class Sort {
	
	public int [] swap(int arr[] , int to, int from){
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to]= temp ; 
				
		return arr;
	}

	/**
	 * Quick Sort 
	 * �ð����⵵ nlogn2n ���� ������.
	 * @param arr
	 * @param left
	 * @param right
	 * @return
	 */
	public int [] QuickSort(int arr[], int left, int right){
		if(left == right) return arr ;
		
		int pivot = arr[left];
		int h_left = left;
		int h_right = right;
		
		while(left<right){
			while((arr[right]>= pivot)&&(left < right))
				right --;
			
			if(left!=right){
				arr[left] = arr[right];
				left++;
			}
			while((arr[left]<= pivot)&&(left<right))
				left++;
			
			if(left!=right){
				arr[right]=arr[left];
				right--;
			}
		}// while ����
		
		arr[left] = pivot;
		pivot = left;
		
		if(h_left<pivot)
			QuickSort(arr, h_left, pivot-1);
		if(pivot<h_right)
			QuickSort(arr, pivot+1, h_right);
				
		return arr;
	}
	/**
	 * Bubble Sort 
	 * �ð����⵵ n^2
	 * @param arr
	 * @return
	 */
	public int[] BubbleSort(int arr[]){
		
		for(int i = 0 ; i < arr.length -1 ; i ++){
			for( int j= 0 ; j < arr.length -i-1 ; j++){
				if(arr[j]>arr[j+1]){
					arr= swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}
	/**
	 * SelectSort
	 * �ð����⵵ n
	 * @param arr
	 * @return
	 */
	public int[] SelectSort(int arr[]){
		
		int minIdx;
		for( int i = 0 ; i< arr.length -1 ; i++)
		{
			minIdx = i;
			
			for( int j = i ; j < arr.length ; j++)
			{
				if(arr[j]<arr[minIdx])
					minIdx = j;
			}
			
			arr = swap(arr, i, minIdx);
		}
		return arr;
	}
	/**
	 * InsertSort 
	 * �ð����⵵ n^2
	 * ���� �����ȿ��� ��� �����ϴ°� 
	 * ���� ��� ù�����ε����� 1 �̴ϱ� 0 ~ 1 �ȿ��� ����
	 * �״����� 0 ~2 �̷��� ���� ������ �������鼭  ���Ӱ� ���� �� ���� ��ġ�� �����ذ��鼭 
	 * �����Ѵ�. 
	 * @param arr
	 * @return
	 */
	public int [] InsertSort(int arr[]){
		int temp ;
		int j ;
		
		for( int i = 1 ; i < arr.length; i++){
			temp = arr[i];
			j = i-1;
			while((j>=0)&&(arr[j]>temp)){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
			
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5, 3, 7, 9, 8, 3, 4};
		Sort sort = new Sort();
		//sort.QuickSort(arr, 0, arr.length-1);
		//sort.BubbleSort(arr);
		sort.SelectSort(arr);
		
		for(int i = 0 ; i < arr.length ;i ++){
			System.out.print(arr[i]+" ");
		}
	}

}
