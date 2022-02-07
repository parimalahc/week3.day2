package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] textArray = text.split(" ");

		Set<String> set1 = new LinkedHashSet<String>();
		for (String string : textArray) {
			if (!set1.contains(string)) {
				set1.add(string);
			} else {
				count++;
				if (count > 1) {					
					String replacedString = text.replace(string, "");
					System.out.println(replacedString);

				}
			}

		}

	}

}
