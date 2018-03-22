import java.util.*;
public class Test {
	public static void main(String[] args) {
		int[] A = {3, 7, 2, 11, 3, 4, 9, 2, 18, 0};
		System.out.println("Input: " + Arrays.toString(A));
		insertionSort(A);
		System.out.println("Output: " + Arrays.toString(A));
	}
	public static void insertionSort(int[] A){
		for(int i = 1; i < A.length; i++){
			int cur = A[i];
			int j = i - 1;
			while(j >= 0 && cur < A[j]){
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = cur;
		}
	}
}
