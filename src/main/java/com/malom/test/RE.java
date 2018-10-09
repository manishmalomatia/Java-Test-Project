package com.malom.test;

import java.util.*;  
class RE{  
 public static void main(String args[]){  

  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(101,"rakesh");
  hm.put(103,"Rahul");  
  System.out.println(SingletonEnum.INSTANCE.values());  
  for (SingletonEnum en:SingletonEnum.values()){
	  System.out.println("Rakesh "+en.getValue());
	  
  }
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  
  }  
 }  
} 