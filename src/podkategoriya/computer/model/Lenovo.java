package podkategoriya.computer.model;

import podkategoriya.computer.Computer;

public class Lenovo extends Computer {
    public Lenovo(String name, String brand, int memory, String colour, String madeIn) {
        super(name, brand, memory, colour, madeIn);
    }



    @Override
    public  void turnOn(){
        System.out.println("Lenovo is turning on...");
    }
    @Override
    public void turnOf(){
        System.out.println("Lenovo is turning of");
    }

    @Override
    public String toString() {
        return "Lenovo{" +
                "colour='" + colour + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
