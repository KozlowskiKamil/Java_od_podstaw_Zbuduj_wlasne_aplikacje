package Bonus.abstract_factory;

public class FactoryBuilder {
    public static AbstractCarFactory getFactory(String name) {
        if (name == null) return null;
        if (name.equalsIgnoreCase("Merc")) {
            return new MercFaktory();
        } else if (name.equalsIgnoreCase("Volvo")) {
            return new VovloFactory();
        } else return null;
    }
}
