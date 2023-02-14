package podkategoriya.smartwatch.model;

import podkategoriya.smartwatch.SmartWatch;

public class Miband extends SmartWatch {

    public Miband(String name, String brand, int memory, String colour, String madeIn) {
        super(name, brand, memory, colour, madeIn);
    }

    public Miband(String name, String brand, int memory) {
        super(name, brand, memory);
    }

    @Override
    public void vibrate(){
        System.out.println("Mibrand is vibrating...");
    }
    @Override
    public void roll(){
        System.out.println("Mibrand is rolling...");
    }

    @Override
    public String toString() {
        return "Miband{" +
                "colour='" + colour + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
