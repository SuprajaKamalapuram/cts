package comm.example;

import java.util.Collections;
import java.util.LinkedList;

public class MyList {
	private LinkedList<String> list=null;
	
	{ list=new LinkedList<String>(); }
	
	public void getSortedList() {
		list.add("Sun");
		list.add("moon");
		list.add("stars");
		list.add("planets");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
		public static void main(String[] args)
		{
			MyList myList=new MyList();
			myList.getSortedList();
		}
	}


