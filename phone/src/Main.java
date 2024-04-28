public class Main {
    public static void main(String[] args) {
        Phone myPhone = new Phone("IPhone 12", "9612647702", 150.2);
        Phone dadPhone = new Phone("IPhone 8", "9065342234", 132.7);
        Phone momPhone = new Phone("IPhone 11", "9065342224", 144.3);

        System.out.println("Модель телефона: " + myPhone.model + ", номер телефона: " + myPhone.number + ", вес телефона: " + myPhone.weight);
        System.out.println("Модель телефона: " + dadPhone.model + ", номер телефона: " + dadPhone.number + ", вес телефона: " + dadPhone.weight);
        System.out.println("Модель телефона: " + momPhone.model + ", номер телефона: " + momPhone.number + ", вес телефона: " + momPhone.weight);

        myPhone.receiveCall("Кто-то");
        System.out.println(myPhone.getNumber());

        Phone somePhone = new Phone();
        somePhone.setNumber("9066308964");
        System.out.println(somePhone.number);
    }
}