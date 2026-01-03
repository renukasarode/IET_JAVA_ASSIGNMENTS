package testStreamFunctions;

import java.util.List;
import java.util.Optional;

public class TestStreamFunctions {

	public static void main(String[] args) {
      List<Integer> list = List.of(1,4,3,4,5,0);
      Optional<Integer> opt = list.stream().max(Integer::compare);
    	  System.out.println(opt.get());
      //maximum odd number
    	 Optional<Integer> opt1 = list.stream().filter(ele->ele%2!=0).max(Integer::compare);
    	 System.out.println("maximum odd number is: "+opt1.get());
    	 //first number of less than 5
    	 Optional<Integer> li=list.stream().filter(ele->ele<5).findFirst();
    	 if(li.isPresent())
    	 {
    	 System.out.println(li.get());
    	 }
    	 //for all matching
    	 boolean status = list.stream().allMatch(e->e>5);
    	 System.out.println("all match for >5 "+status);
    	 //for any matching ele
    	 boolean status1 = list.stream().anyMatch(e->e>5);
    	 //for none matching element
    	 System.out.println("all match for >5 "+status1);
    	 boolean status2 = list.stream().noneMatch(e->e>5);
    	 System.out.println("all match for >5 "+status2);
	}
}
