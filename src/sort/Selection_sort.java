package sort;

import java.util.Arrays;
/**
 * 选择排序
 * @author ypf
 *
 */
public class Selection_sort {

	public static void main(String[] args) {
		int[] aInteger = {2,4,1,3,1,3,7,9,10,8,12,3,5,6};
		sort(aInteger);
		System.out.println(Arrays.toString(aInteger));

	}

	public static void sort(int[] intArr) {
		int swap_idx = 0;
		for (int i = 0; i < intArr.length; i++) {
			swap_idx = i;
			for (int j = (i + 1); j < intArr.length; j++) {
				if (intArr[j] < intArr[swap_idx]) {
					swap_idx = j;
				}
			}
			swap(intArr, swap_idx, i);
		}
		
	}
	private static void swap(int[] intArr, int i, int j) {
		int k = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = k;
	}
}