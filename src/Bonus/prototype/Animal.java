package Bonus.prototype;

public class Animal implements AnimalInterface {
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                "class='" + this.getClass() + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
}
