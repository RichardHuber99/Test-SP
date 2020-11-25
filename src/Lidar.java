public class Lidar implements Element{
    private String name;
    private boolean working;
    private boolean protectionMode;

    public Lidar(String name, boolean working, boolean protectionMode) {
        this.name = name;
        this.working = working;
        this.protectionMode = protectionMode;
    }


    @Override
    public void print() {
        System.out.println(this.name);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
