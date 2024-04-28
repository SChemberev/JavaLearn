import javax.annotation.processing.SupportedSourceVersion;

public class Main {
    public static void main(String[] args) {
        Students Vova = new Students();
        Vova.setFirstName("Vladimir");
        Vova.setLastName("Ivanov");
        Vova.setGroup("742");
        Vova.setAvgMark(5.0);

        Students Misha = new Students();
        Misha.setFirstName("Michail");
        Misha.setLastName("Petrov");
        Misha.setGroup("741");
        Misha.setAvgMark(3.84);

        Aspirants Sasha = new Aspirants();
        Sasha.setFirstName("Alexandr");
        Sasha.setLastName("Sidorov");
        Sasha.setAvgMark(4.99);

        System.out.println(Vova.getScholarship());
        System.out.println(Misha.getScholarship());
        System.out.println(Sasha.getScholarship());
    }
}
