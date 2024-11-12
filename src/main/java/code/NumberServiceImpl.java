package code;

import java.util.ArrayList;
import java.util.List;

interface NumberService{
	public int number= 0;
	public int getNumber();
	public default List<Integer> getDefaultNumbers() {
		System.out.println("Came here");
		return new ArrayList<Integer>();
	}
}

public class NumberServiceImpl implements NumberService{
	@Override
	public int getNumber() {
		return number;
	}
	
	public static void main(String args[]) {
		NumberServiceImpl numberServiceImpl = new NumberServiceImpl();
		NumberService numberService = numberServiceImpl;
		numberService.getDefaultNumbers();
	}
}
