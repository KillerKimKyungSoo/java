package collection.array;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private  int size = 0;
    public MyArrayListV1(){
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV1(int initialCapacity){
        elementData=new Object[initialCapacity];
    }
    public int size(){
        return size;
    }
    public void add(Object e){
        elementData[size]= e;
        size ++;
    }
}

