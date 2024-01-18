package java10_collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collection_05_Convert {
	public static void main(String[] args) {
		
		List list = Arrays.asList("Apple","Banana","Cherry","Banana","Cherry");
		
		System.out.println(list);
		
		System.out.println("-------------------");
		
		Set set = new HashSet(list);
		System.out.println(set);
		
		System.out.println("-------------------");
		
		List list2 = new LinkedList(set);
		System.out.println(list2);
		
		//String 정렬
		list2.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((String)o1).compareTo((String)o2); // String으로 형변환 후 compareTo로 크기(아스키코드)비교
//				if( o1 > o2 ) return 1; // 왼쪽이 크면 return 1
//				else if(o1 < o2) return-1; //오른쪽이 크면 return -1 
//				else return 0; // 같으면 return 0
			}
		});
		
		System.out.println(list2);
		
		
	}
}
