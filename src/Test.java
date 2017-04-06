import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		List<Integer> intList = list;
		for(int i = 0; i < list.size(); i++){
			System.out.println(intList.get(i));
		}
	}
}
