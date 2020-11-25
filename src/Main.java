public class Main {
    public static void main(String[] args){

        Sensors s1 = new Sensors("Sensors1");
        Proximity p1 = new Proximity("proximity1",true,false);
        Lidar l1 = new Lidar("lidar1",true,true);
        Camera c1 = new Camera("camera1",false,false);
        Temperature t1 = new Temperature("temperature1",true,true);
        s1.addSensors(p1);
        s1.addSensors(l1);
        s1.addSensors(c1);
        s1.addSensors(t1);
        s1.print();




    }
}
