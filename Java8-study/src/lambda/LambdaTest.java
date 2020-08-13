package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaTest {

	public static void main(String[] args) {
		
		/* 기존 방식 */
		Comparator<Apple> sortByWeight = new Comparator<Apple>() {
			
			@Override
			public int compare(Apple o1, Apple o2) {
				return Integer.compare(o1.getWeight(), o2.getWeight());
			}
		};
		
		/* lambda함수를 사용한 방식 */
		Comparator<Apple> sortByWeightAndLambda =  
				(Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
		
		
		ArrayList<Apple> appleList = new ArrayList<>();
		
		appleList.add(new Apple(200, 1500));
		appleList.add(new Apple(210, 3200));
		appleList.add(new Apple(280, 4300));
		appleList.add(new Apple(230, 2500));
		appleList.add(new Apple(190, 2200));
		
		Collections.sort(appleList, sortByWeightAndLambda);
		
		for(Apple a : appleList) {
			System.out.println(a.toString());
		}
	}	

}
