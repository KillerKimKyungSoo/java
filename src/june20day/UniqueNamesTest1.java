package june20day;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] integers =  {30,20,20,10,10};
        Set<Integer> set= new HashSet<>();
        for(Integer s : integers){
            set.add(s);
        }
        for(Integer s : set){
            System.out.println(s);
        }

    }
}
