/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.*;

/**
 *
 * @author gunasegarran
 */
public class Comparators implements Comparator<Student> {
    
	public int compare(Student o1, Student o2) {
		int gpaResult = Double.compare(o2.getGpa(), o1.getGpa());
		if(gpaResult == 0) {
			int nameResult = o1.getName().compareToIgnoreCase(o2.getName());
			if(nameResult == 0) {
				return o1.getId() - o2.getId();
			} else {
				return nameResult;
			}
		} else { 
			return gpaResult;
		}
	}
}
