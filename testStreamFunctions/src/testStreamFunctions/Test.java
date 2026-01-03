package testStreamFunctions;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		List<Integer> lst=List.of(3,2,4,15,26,33,7,4,5);
		Predicate<Integer> pre = e->e%2==0;
		lst.stream().filter(pre).forEach(System.out::println);
		Supplier<String> supp =()->{String [] arr= {"avc","happy","ght","trt"};
		int i = (int) (Math.random()*2+1);
		return arr[i];
		};
		System.out.println(supp.get());
		System.out.println(supp.get());
		}		
	}
