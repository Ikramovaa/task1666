package podkategoriya;

import podkategoriya.computer.model.Lenovo;
import podkategoriya.computer.model.MAC;
import podkategoriya.smartwatch.model.AppleWatch;
import podkategoriya.smartwatch.model.Miband;
import podkategoriya.telephone.model.Iphone;
import podkategoriya.telephone.model.Samsung;

public class Main {
    public static void main(String[] args) {
        Lenovo lenovo=new Lenovo("Computer","Lenovo",76,"Silver","China");
        MAC mac=new MAC("Computer","Aplle",512,"White","USA");
        AppleWatch appleWatch=new AppleWatch("Smartwatch","Aplle",64,"Orange","America");
        Miband miband=new Miband("Smartwatch","Miband",28,"Yellow","China");
        Samsung samsung =new Samsung("Phone","Samsung",128,"Blue","Europe");
        Iphone iphone=new Iphone("Phone","Aplle",256,"Deep purple","Korea");
        lenovo.turnOf();
        lenovo.turnOf();
        mac.turnOf();
        mac.turnOf();
        appleWatch.roll();
        appleWatch.vibrate();
        miband.roll();
        miband.vibrate();
        samsung.call();
        samsung.respond();
        iphone.call();
        iphone.respond();
        System.out.println(lenovo.toString());
        System.out.println(mac.toString());
        System.out.println(appleWatch.toString());
        System.out.println(miband.toString());
        System.out.println(samsung.toString());
        System.out.println(iphone.toString());


    }
}