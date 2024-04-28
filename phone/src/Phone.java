/*
1. Класс Phone.
*Создайте класс Phone, который содержит переменные number, model и weight. *DONE*
*Создайте три экземпляра этого класса. *DONE*
*Выведите на консоль значения их переменных. *DONE*
*Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. *DIONE*
    Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов. *DONE*
*Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight. *DONE*
*Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model. *DONE*
*Добавить конструктор без параметров. *DONE*
*Вызвать из конструктора с тремя параметрами конструктор с двумя.
*Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
*Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
*Изменить класс Phone в соответствии с концепцией JavaBean.
 */
public class Phone {
    String number, model;
    double weight;

    public Phone(String model, String number, double weight){ //конструктор с 3 пар-ми
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public Phone(String model, String number){ //конструктор с 2 пар-ми
        this.model = model;
        this.number = number;
    }

    public Phone(){ //конструктор без пар-ов

    }

    public void receiveCall(String name) { //метод receiveCall
        System.out.println("Звонит " + name);
    }

    public void setNumber(String num){
        this.number = num;
    }

    public String getNumber(){
        return number;
    }
}
