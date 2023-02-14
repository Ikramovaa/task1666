package podkategoriya.smartwatch.model;

import podkategoriya.smartwatch.SmartWatch;

public class AppleWatch extends SmartWatch {


    public AppleWatch(String name, String brand, int memory, String colour, String madeIn) {
        super(name, brand, memory, colour, madeIn);
    }

    public AppleWatch(String name, String brand, int memory) {
        super(name, brand, memory);
    }

    @Override
    public void vibrate(){
        System.out.println("Apple watch is vibrating...");
    }
    @Override
    public void roll(){
        System.out.println("Apple watch is rolling...");
    }

    @Override
    public String toString() {
        return "AppleWatch{" +
                "colour='" + colour + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
