package week3.day2;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		int len = data.length;
		System.out.println(data[len - 2]);

	}

}
