public interface Visitor {

    void visit(Proximity proximity);
    void visit(Lidar lidar);
    void visit(Sensors sensors);
    void visit(Camera camera);
    void visit(Temperature temperature);
    void visit(Panel panel);
}
