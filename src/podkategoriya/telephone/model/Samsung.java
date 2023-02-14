package podkategoriya.telephone.model;

import podkategoriya.telephone.Telephone;

public class Samsung extends Telephone {

    public Samsung(String name, String brand, int memory, String colour, String madeIn) {
        super(name, brand, memory, colour, madeIn);
    }

    public Samsung(String name, String brand, int memory) {
        super(name, brand, memory);
    }

    @Override
    public  void call(){
        System.out.println("Samsung is calling...");
    }
    @Override
    public void respond(){
        System.out.println("Samsung is responding...");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "colour='" + colour + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
