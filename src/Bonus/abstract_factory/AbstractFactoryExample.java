package Bonus.abstract_factory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractCarFactory factory1 = FactoryBuilder.getFactory("Merc");
        MercFaktory mercFaktory = (MercFaktory) factory1;
        Merc merc1 = (Merc) mercFaktory.makeCar("Sport amg");
        merc1.printInfo();

        Merc merc2 = (Merc) factory1.makeCar("W240");
        merc2.printInfo();

        VovloFactory vovloFactory = (VovloFactory) FactoryBuilder.getFactory("Volvo");
        Volvo volvo = (Volvo) vovloFactory.makeCar("333");
        volvo.printInfo();

    }
}
