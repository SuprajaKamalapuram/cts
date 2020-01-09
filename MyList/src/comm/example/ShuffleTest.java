package comm.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
	public static void main(String[] args) {
		String name[] = { new String("Sang"), new String("Shin"), new String("Boston"), new String("Passion"),
				new String("Shin"), };
		

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(100);
		l.add(-30);
		System.out.println(l);
		int index=Collections.binarySearch(l, -1);
		if(index>=0)
		{
			System.out.println("found "+l.get(index));
		}
		else
		{
			System.out.println("not found "+index);
		}
		

}
}