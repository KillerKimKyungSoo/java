package generic.test.ex3;

public class UnitUtil {
   // private String name;
   // private int hp;

   public static <T extends  BioUnit> T maxHp(T t1, T t2){
     return t1.getHP() > t2.getHP() ? t1 : t2;
    }
}
