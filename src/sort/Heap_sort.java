package sort;
/**
 * 堆排序
 * @author ypf
 *
 */
public class Heap_sort {
		public static void main(String[] args) {
			int[] array = SortUtil.getRanDomIntegersArrays(50, 50);

			System.out.println("Before heap:");
			printArray(array);
			sort(array);
			System.out.println("After heap sort:");
			printArray(array);
		}

		public static void sort(int[] array) {
			if (array == null || array.length <= 1) {
				return;
			}

			buildMaxHeap(array);

			for (int i = array.length - 1; i >= 1; i--) {
				exchangeElements(array, 0, i);

				maxHeap(array, i, 0);
			}
		}

		private static void buildMaxHeap(int[] array) {
			if (array == null || array.length <= 1) {
				return;
			}

			int half = array.length / 2;
			for (int i = half; i >= 0; i--) {
				maxHeap(array, array.length, i);
			}
		}

		private static void maxHeap(int[] array, int heapSize, int index) {
			int left = index * 2 + 1;
			int right = index * 2 + 2;

			int largest = index;
			if (left < heapSize && array[left] > array[index]) {
				largest = left;
			}

			if (right < heapSize && array[right] > array[largest]) {
				largest = right;
			}

			if (index != largest) {
				exchangeElements(array, index, largest);

				maxHeap(array, heapSize, largest);
			}
		}
		
	    public static void printArray(int[] array) {
		    System.out.print("{");
		    for (int i = 0; i < array.length; i++) {
			    System.out.print(array[i]);
			    if (i < array.length - 1) {
				    System.out.print(", ");
			    }
		    }
		    System.out.println("}");
	    }

	    public static void exchangeElements(int[] array, int index1, int index2) {
		    int temp = array[index1];
		    array[index1] = array[index2];
		    array[index2] = temp;
	    }
	}