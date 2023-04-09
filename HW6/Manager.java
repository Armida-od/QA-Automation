package HW6;

public class Manager extends Employee{
    final String LastName;
    Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        LastName = lastName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    public Employee[] getTeam() {
        return team;
    }

    public void setTeam(Employee[] team) {
        this.team = team;
    }

    @Override
    public String Position() {
        return "Manager";
    }

    @Override
    public String Seniority() {
        return "Senior";
    }

    public void setTeamMembers(JavaDeveloper javaDev, AngularDeveloper angularDev, AutomationEngineer autoTester, ManualTestEngineer manualTester) {
    }

//    public static void getInfo(){
//        System.out.println("and has a team of 4 members: [Tom, Bill, Misha, John]");
//    }
}
