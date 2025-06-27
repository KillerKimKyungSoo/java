package june24day;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> listIter = list.iterator();
        printAll(listIter);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> setIter = set.iterator();
        printAll(setIter);

    }

    private static void printAll(Iterator<Integer> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
