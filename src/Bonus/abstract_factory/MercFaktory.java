package Bonus.abstract_factory;

public class MercFaktory extends AbstractCarFactory {
    @Override
    CarInterface makeCar(String model) {
        if (model == null) return null;
        boolean amgVersion = false;
        if (model.toLowerCase().indexOf("amg") >= 0) amgVersion = true;
        return new Merc(model, amgVersion);
    }
}
