package HW6;

public class ManualTestEngineer extends Employee {
    final String LastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        LastName = lastName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public String Position() {
        return "Manual Test Engineer";
    }

    @Override
    public String Seniority() {
        return "Junior";
    }
}