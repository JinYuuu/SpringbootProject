package com.in28minutes.springboot.springbootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	/* whether you're creqting a setter or not, 
	 * the way Spring the autowiring is the same
	 * 
		public void setSortAlgoirthm(SortAlgorithm sortAlgoirthm) {
			this.sortAlgoirthm = sortAlgoirthm;
		}
	*/

	// if a bean of @autowired is not found, the context will not launch at all
	@Autowired
	private SortAlgorithm sortAlgoirthm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgoirthm) {
		super();
		this.sortAlgoirthm = sortAlgoirthm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
				
		int[] sortedNumbers = sortAlgoirthm.sort(numbers);
		System.out.println(sortAlgoirthm);
		//Search the array
		
		return 3;
	}

}
