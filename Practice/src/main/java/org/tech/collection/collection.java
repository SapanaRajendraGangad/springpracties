package org.tech.collection;
import java.util.*;
public class collection {
	List<String>list;
public void setNames(List<String>list) {
	this.list=list;
}
public void show() {
	  for(String name:list) {
		  System.out.println(name);
	  }

}
}
