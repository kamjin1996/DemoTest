package com.collection;

import java.util.*;

/**
 * @Auther: Kam
 * @Date: 下午 1:23 2018-09-27
 * @Description: 排序HashMap的实现：利用hashmap的子类linkedlist来装排序后的entry
 * @Version: 1.0
 */
public class HashMapTest {
    public static void main(String[] args) {

        HashMap<Integer,User> h = new HashMap<Integer,User>();
        h.put(1,new User(16,"张三",19));
        h.put(2,new User(22,"李四",12));
        h.put(3,new User(4,"王五",28));
        h.put(4,new User(29,"小六",14));
        HashMap<Integer, User> hashMap = sortHashMap(h);
        System.out.println(hashMap);

    }
    public static HashMap<Integer,User> sortHashMap(HashMap<Integer,User> hashMap){
        //排序以上
        Set<Map.Entry<Integer, User>> set = hashMap.entrySet();
        //将set集合转为list是为了排序
        List<Map.Entry<Integer, User>> entryList =new ArrayList<>(set);
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                //定义排序规则：
                return o1.getValue().getAge() - o2.getValue().getAge();
            }
        });
        //创建一个新的hashmap子类：linkedhashmap来装排序后的entry
        LinkedHashMap<Integer,User> map = new LinkedHashMap<>();
        for(Map.Entry<Integer,User> entry : entryList){
            map.put(entry.getKey(),entry.getValue());
        }

        return map;
    }

}
