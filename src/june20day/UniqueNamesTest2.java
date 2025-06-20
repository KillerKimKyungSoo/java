package june20day;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr={  30,20,20,10,10  };
        Set<Integer> s = new LinkedHashSet<>(List.of(inputArr));
        for(Integer ss : inputArr){
            s.add(ss);
        }
        for(Integer sss : s){
            System.out.println(sss);
        }
    }
}
