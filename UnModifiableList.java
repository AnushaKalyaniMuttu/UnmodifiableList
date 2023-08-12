package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableList{
		     public static void main(String[] args) {
		    	 
		    	  ArrayList<String> originalList = new ArrayList<>();
		          originalList.add("Item 1");
		          originalList.add("Item 2");
		          originalList.add("Item 3");

		          List<String> readOnlyList = Collections.unmodifiableList(originalList);
		          for (String item : readOnlyList) {
		              System.out.println(item);
		          }
		          readOnlyList.add("anusha");//UnsupportedOperationException
		          System.out.println(readOnlyList);
		     }
		     }
