package com.media.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {
	
	public static void main(String[] args) {
		
        List<Integer> list = Arrays.asList(1,4,6,8,9,12,14,4);
        List<Integer> list1 = Arrays.asList(3,5,7,8,12,6,9,8,1);
        
//        for(int i : list) {
//        	for(int j : list1) {
//        		if(i == j) {
//        			System.out.println(i);
//        		}
//        	}
//        }
        
        System.out.println(list.stream().filter(list1::contains).collect(Collectors.toList()));
        //System.out.println(c);
	}

}
