package podkategoriya.smartwatch;

import podkategoriya.Podkategoriya;

public class SmartWatch extends Podkategoriya {
   protected String colour;
    protected String madeIn;

    public SmartWatch(String name, String brand, int memory, String colour, String madeIn) {
        super(name, brand, memory);
        this.colour = colour;
        this.madeIn = madeIn;
    }

    public SmartWatch(String name, String brand, int memory) {
        super(name, brand, memory);
    }


    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void roll(){
        System.out.println("rolling...");
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "colour='" + colour + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
