/*Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 5000P,
 иначе 3000. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 8000P, иначе 5000P.*.
 //schemberev 28042024
 */
public class Students {
    private String firstName, lastName, group;
    private double avgMark;

    public String getScholarship(){
        int maxScholarship = 5000;
        int minScholarship = 3000;
        if(avgMark == 5.0){
            return ("Стипендия студента " + lastName +" " + firstName + " равна " +maxScholarship);
        }
        else {
            return ("Стипендия студента " + lastName +" " + firstName + " равна " +minScholarship);
        }
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setGroup(String group){
        this.group = group;
    }

    public String getGroup(){
        return group;
    }

    public void setAvgMark(double avgMark){
        this.avgMark = avgMark;
    }

    public double getAvgMark(){
        return avgMark;
    }
}
