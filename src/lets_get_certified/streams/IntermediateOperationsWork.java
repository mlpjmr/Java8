package lets_get_certified.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class PersonOp {
	private String name;
	private int age;

	public PersonOp(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" + "name=" + name + ", age=" + age + '}';
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class IntermediateOperationsWork {
	public static void main(String[] args) {
		// doSorted2();
		// doLimit();
		// doSortedOther();
		// dofilter();
		//doDistinct();
		doLimit1();
	}

	public static void dofilter() {
		Stream.of("madhavi", "latha", "yeduguri", "sandinti").filter(countyname -> countyname.length() > 5)
				.forEach(System.out::println);
	}

	public static void doDistinct() {
		
		  Stream.of("madhavi", "madhavi","yeduguri", "sandinti","yeduguri") 
		 // .peek(countyname -> System.out.println("1."+countyname))
		  .distinct()
		  .forEach(countyname -> System.out.println("2."+countyname));
		 
		//Stream.of("eagle", "eagle", "EAGLE").peek(s -> System.out.print(" 1." + s));
		/*
		 * .distinct() .forEach(s -> System.out.print(" 2."+s));
		 */
	}
	
	public static void doLimit() {
		
		  Stream.of(11,22,33,44,55,66,77) 
		  .filter(countyname -> countyname>40)
		  .limit(3)
		  .forEach(countyname -> System.out.println(countyname));
		 
		//Stream.of("eagle", "eagle", "EAGLE").peek(s -> System.out.print(" 1." + s));
		/*
		 * .distinct() .forEach(s -> System.out.print(" 2."+s));
		 */
	}
	
    public static void doLimit1() {
        
        // Stream<T> limit(long maxSize)
        // limit is a short-circuiting stateful 
        // intermediate operation. Lazy evaluation - 66, 77, 88 and 99
        // are not streamed as they are not needed (limit of 2 i.e. 44 and 55).
        // Output: 
        //  A - 11 A - 22 A - 33 A - 44 B - 44 C - 44 A - 55 B - 55 C - 55
        Stream.of(11,22,33,44,55,66,77,88,99)
                .peek(n -> System.out.print(" A - "+n))
                .filter(n -> n > 40)
                .peek(n -> System.out.print(" B - "+n))
                .limit(4)
                .forEach(n -> System.out.print(" C - "+n));
    }

}
