package podkategoriya.telephone.model;

import podkategoriya.telephone.Telephone;

public class Iphone extends Telephone {

    public Iphone(String name, String brand, int memory, String colour, String madeIn) {
        super(name, brand, memory, colour, madeIn);
    }

    public Iphone(String name, String brand, int memory) {
        super(name, brand, memory);
    }

    @Override
    public  void call(){
        System.out.println("Iphone is calling...");
    }
    @Override
    public void respond(){
        System.out.println("Iphone is responding...");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "colour='" + colour + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
