package com.Lesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskHashMap {
    public static void main(String[] args) {

        //1
        HashMap <Integer, String> hash_map = new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Black");
        hash_map.put(3, "Pink");

        for(Map.Entry i : hash_map.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }

        //2
        System.out.println(hash_map.size());

        //3
        HashMap <Integer, String> hash_map1 = new HashMap<>();
        hash_map1.put(4, "Grey");
        hash_map1.put(5, "White");
        hash_map1.putAll(hash_map);
        System.out.println(hash_map1);

        //4
        hash_map.clear();

        //5
        System.out.println(hash_map.isEmpty());

        //6
        HashMap<Integer, String> hash_map2 = new HashMap<>();
        hash_map2 = (HashMap<Integer, String>) hash_map1.clone();
        System.out.println(hash_map2);

        //7
        if(hash_map2.containsKey(1)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //8
        if(hash_map2.containsValue("Red")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //9
        Set set = hash_map2.entrySet();
        System.out.println(set);

        //10
        System.out.println(hash_map2.get(2));

        //11
        Set keyset = hash_map2.keySet();
        System.out.println(keyset);

        //12
        System.out.println(hash_map2.values());

    }
}
