public class Employee extends Person {

    private String company;

    public Employee(String name_, int age_, String company_){

        super(name_, age_);
        this.company = company_;

    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        String s = "(" + super.getName() + ", " + super.getAge() + ", " + this.company + ")";
        return s;
    }

    @Override
    public String work() {
        return "Manager";
    }
}
