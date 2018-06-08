package com.in28minutes.springboot.springbootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// A spring boot application automatically scans the package and the sub packages
// of the package where this is in.

//The annotation @SpringBootApplication 
//=> this is a spring context file 
//=> auto configuration
//=> component scan

@SpringBootApplication 
public class MySpringBootApplication {
	
	// What are the beans? --> @component
	// What are the dependencies of a bean? --> @Autowired
	// Where to search for beans? --> by using SpringApplicationContext

	// Dependency management
	// Spring manages the dependencies, injects the dependencies where ever they are neede
	// and it manages the entire lifecycle of these beans.
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = 
		//		new BinarySearchImpl(new QuickSortAlgorithm());
		
		//Spring Application context is the one with would maintain all the beans
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(MySpringBootApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		
		System.out.println(result);
		//com.in28minutes.springboot.springbootApp.BubbleSortAlgorithm@3a7b503d
		//3
	}
}
