package podkategoriya.computer;

import podkategoriya.Podkategoriya;

public class Computer extends Podkategoriya {
    protected String colour;
    protected String madeIn;



    public Computer(String name, String brand, int memory, String colour, String madeIn) {
        super(name, brand, memory);
        this.colour = colour;
        this.madeIn = madeIn;
    }

    public Computer(String name, String brand, int memory) {
        super(name, brand, memory);
    }

    public  void turnOn(){
       System.out.println("turning on...");
   }
   public void turnOf(){
       System.out.println("turning of");
   }

    @Override
    public String toString() {
        return "Computer{" +
                "colour='" + colour + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
