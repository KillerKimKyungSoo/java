package generic.test.ex3;

public class Shuttle <T extends BioUnit>{
    private T unit;
    public void in(T t){
        this.unit = t;
    }

    public T out(){
        return unit;
    }
    public void showInfo(){
        System.out.println(unit.getName() + unit.getHP());
    }
}
