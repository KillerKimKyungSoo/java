package june17day.ex1;

public class Task {
    private final String name;

    public Task(String name) {
        this.name = name;
    }
    public void execute(){
        System.out.println("작업 수행중 : " + name);
    }
    public String getName(){
        return name;
    }
}
