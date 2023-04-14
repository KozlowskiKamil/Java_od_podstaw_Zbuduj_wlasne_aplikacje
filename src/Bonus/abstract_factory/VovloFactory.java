package Bonus.abstract_factory;

public class VovloFactory extends AbstractCarFactory {
    @Override
    CarInterface makeCar(String model) {
        if (model == null) return null;
        return new Volvo(model);
    }
}
