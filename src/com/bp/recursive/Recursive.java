package com.bp.recursive;
/**
 * ���α׷��� ��ȸ���� ���� �˰��� �����ذ�����
 * @author BP
 *
 */
public class Recursive {
	/*
	 *  1 + 2 +3 + ... + n
	 *   = (1 + 2 + 3 ... + n/2) + ((n/2 +1) + ... + n)
	 *   = (1 + 2 + 3 ... + n/2) + ((n/2 + 1) + (n/2 + 2) + (n/2 + 3) + ... +(n/2 + n/2))
	 *   = (1 + 2 + 3 ... + n/2) + (1 + 2 + 3 ... + n/2) + (n/2)*(n/2)
	 *   =  (1 + 2 + 3 ... + n/2)*2 + (n/2)*(n/2)
	 *   n �� Ȧ���϶��� 
	 *   =  (1 + 2 + 3 ... + n-1) + n 
	 *   
	 *   =  (1 + 2 + 3 ... + n/2) �� �κ��� recursive
	 */
	int fastSum(int n){
		
		if(n==1)
			return 1;
		if(n%2 ==1)
			return fastSum(n-1)+n;
		
		return 2*fastSum(n/2) + (n/2)*(n/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
