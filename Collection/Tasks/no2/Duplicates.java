package collection.tasks.no2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Duplicates {

	public static void main(String[] args) {

		Collection<String> mailIDs = new ArrayList<String>();

		mailIDs.add("munge@hotmail.com");
		mailIDs.add("munge@hotmail.com");
		mailIDs.add("mfburgo@att.net");
		mailIDs.add("jadavis@verizon.net");
		mailIDs.add("brickbat@aol.com");
		mailIDs.add("heine@yahoo.com");
		mailIDs.add("rhialto@yahoo.com");
		mailIDs.add("drjlaw@optonline.net");
		mailIDs.add("sabren@live.com");
		mailIDs.add("mstrout@msn.com");
		mailIDs.add("isaacson@verizon.net");
		mailIDs.add("makarow@gmail.com");
		mailIDs.add("panolex@gmail.com");
		mailIDs.add("dhrakar@verizon.net");
		mailIDs.add("mugwump@icloud.com");
		mailIDs.add("richard@yahoo.com");
		mailIDs.add("skaufman@yahoo.com");
		mailIDs.add("skaufman@yahoo.com");
		mailIDs.add("richard@yahoo.com");
		mailIDs.add("richard@yahoo.com");

		Collection<String> duplicates = new ArrayList<String>();

		Iterator<String> iterator = mailIDs.iterator();

		while (iterator.hasNext()) {
			Object s = iterator.next();
			Iterator<String> iterator2 = mailIDs.iterator();
			int count = 0;
			while (iterator2.hasNext()) {
				Object t = iterator2.next();
				if (s.equals(t)) {
					count++;
				}
			}
			if (count > 1) {
				if (!duplicates.contains(s)) {
					duplicates.add((String) s);
				}
			}
		}

		Iterator<String> iterator3 = duplicates.iterator();

		if (duplicates.isEmpty()) {
			System.out.println("There are no duplicates in the given collection");
		} else {

			while (iterator3.hasNext()) {
				System.out.println(iterator3.next() + " has duplicates");

			}

		}

	}
}