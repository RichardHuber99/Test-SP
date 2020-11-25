import java.util.ArrayList;

public class Sensors implements Element {

    private String name;
    private ArrayList<Element> sensors = new ArrayList<>();

    public Sensors(String name) {
        this.name = name;
    }

    public void addSensors(Element elem){
        sensors.add(elem);
    }


    @Override
    public void print() {
        for(Element i : sensors){
            i.print();
        }
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
        for(Element i : sensors){
            i.print();
        }
    }
}


