package generic.ex4;

import generic.animal.Animal;

public class GenericMethod {
    public static Object objMethod(Object obj){
        System.out.println("object Print :" + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("generic Print T : " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("numberGeneric Method : " + t);
        return t;
    }
}
