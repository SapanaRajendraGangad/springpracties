package org.techhub.map;
import java.util.*;
public class company {
private Map<Integer,String> map;
public void setNames(Map<Integer,String> map) {
	this.map=map;
}
public void listshow() {
	Set <Map.Entry<Integer, String>>set=map.entrySet();
	for(Map.Entry<Integer, String> e:set) {
	System.out.println(e.getValue()+"  "+e.getKey());	
	}
}
}
