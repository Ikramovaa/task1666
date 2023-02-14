package podkategoriya.computer.model;

import podkategoriya.computer.Computer;

public class MAC extends Computer {


    public MAC(String name, String brand, int memory, String colour, String madeIn) {
        super(name, brand, memory, colour, madeIn);
    }



    @Override
    public  void turnOn(){
        System.out.println("MAC is turning on...");
    }
    @Override
    public void turnOf(){
        System.out.println("MAC is turning of");
    }

    @Override
    public String toString() {
        return "MAC{" +
                "colour='" + colour + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
