package Challenge.studentChallenge;

class Student {
    String name;
    String surname;
    String city;
    int age;

    public Student() {
        this.name = "Jan";
        this.surname = "Kowalski";
        this.city = "Warszawa";
        this.age = 22;
    }

    public Student(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public void printBasicData() {
        System.out.println("name = " + name + " surname = " + surname + " city = " + city + " age = " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printBasicData();

        Student student2 = new Student("Kamil", "Kowalski", "Kwidzyn", 33);
        student2.printBasicData();
    }
}
