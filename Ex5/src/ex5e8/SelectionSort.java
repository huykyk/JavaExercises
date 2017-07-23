package ex5e8;

public class SelectionSort {
	public static void selectionSort(int[] array) {		//注意大小写，此处是小写的selectionSort，若为大写，会报构造器warning
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] scores = {78,65,80,67,92,84};
		selectionSort(scores);
		for (int i : scores) {
			System.out.println(i + "  ");
		}
	}
}
