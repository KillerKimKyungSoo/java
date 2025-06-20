package june20day;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();
        studentMap.put("studentA" ,90);
        studentMap.put("studentB" ,80);
        studentMap.put("studentC" ,70);
        studentMap.put("studentD" ,100);
        System.out.println(studentMap);

        Integer result = studentMap.get("studentC");
        System.out.println("result " + result);
        System.out.println("===KeySet 활용 ====");
        Set<String> keySet = studentMap.keySet();
        for(String  key : keySet){
            Integer value = studentMap.get(key);
            System.out.println("Key : " + key + "  value : " + value);
        }
        System.out.println("=====entry Set 활용 =====");
        Set<Map.Entry<String , Integer>> entries = studentMap.entrySet();
        for(Map.Entry<String , Integer> entry : entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key = : " + key + " Value : " + value);
        }

        System.out.println( "value 활용");
        Collection<Integer> value = studentMap.values();
        for(Integer v : value){
            System.out.println("value = " + v);
        }
    }
}
