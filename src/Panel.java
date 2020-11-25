//import java.util.ArrayList;
//
//public class Panel implements Sensors{
//    private String name;
//    private ArrayList<Sensors> sensors = new ArrayList<>();
//
//    public Panel(String name) {
//        this.name = name;
//    }
//
//    public String getNume() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//   public void add(Sensors sensors){
//        sensors.add(sensors);
//   }
//
//
//    @Override
//    public void print() {
//        System.out.println(getNume());
//        for(Element e : elements){
//            e.print();
//        }
//    }
//
//    @Override
//    public void accept(Visitor v) {
//        v.visit(this);
//
//        for(Element e : elements){
//            e.accept(v);
//        }
//    }
//}
