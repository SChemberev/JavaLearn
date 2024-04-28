public class Aspirants extends Students{
    private String typeSciWork;

    public void setTypeSciWork(String typeSciWork){
        this.typeSciWork = typeSciWork;
    }

    public String getTypeSciWork(){
        return typeSciWork;
    }

    @Override
    public String getScholarship() {
        int maxScholarship = 8000;
        int minScholarship = 6000;
        if(getAvgMark() == 5.0){
            return ("Стипендия аспиранта " + getLastName() + " " + getFirstName() + " равна " +maxScholarship);
        }
        else {
            return ("Стипендия аспиранта " + getLastName() + " " + getFirstName() + " равна " +minScholarship);
        }
    }
}
