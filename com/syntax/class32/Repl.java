package com.syntax.class32;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class Repl {
  Map<String, Integer> map = new HashMap<>();
  public void display(Map<String,Integer> map){
    this.map = map;
    if(!map.isEmpty()){
      Set<Entry<String, Integer>> entMap = map.entrySet();
      for(Entry<String, Integer> ent:entMap){
        String key = ent.getKey();
        Integer value = ent.getValue();
        System.out.println(key + " " + value);
      }
      
    }else{
      System.out.println("map is empty");
    }
  }
  
  
}