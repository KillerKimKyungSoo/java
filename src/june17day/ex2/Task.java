package june17day.ex2;

public class Task {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    public void execute() throws Exception {
        System.out.println("작업 실행 중: " + name);

        if (Math.random() < 0.2) {
            throw new Exception("작업 실패: " + name);
        }

        System.out.println("작업 완료: " + name);
    }

    public String getName() {
        return name;
    }
}
