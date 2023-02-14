package podkategoriya.telephone;

import podkategoriya.Podkategoriya;

public class Telephone extends Podkategoriya {
   protected String colour;
  protected String madeIn;

    public Telephone(String name, String brand, int memory, String colour, String madeIn) {
        super(name, brand, memory);
        this.colour = colour;
        this.madeIn = madeIn;
    }

    public Telephone(String name, String brand, int memory) {
        super(name, brand, memory);
    }

    public  void call(){
        System.out.println("calling...");
    }
    public void respond(){
        System.out.println("responding...");
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "colour='" + colour + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
