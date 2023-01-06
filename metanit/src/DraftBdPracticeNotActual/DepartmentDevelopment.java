package DraftBdPracticeNotActual;

public class DepartmentDevelopment extends StaffSberHealth  {
    private int fix_bugs;
    private int realisation_new_func;

    public DepartmentDevelopment(String name, String surname, String department, int year_of_birth, int year_of_employment, int fix_bugs, int realisation_new_func) {
        super(name, surname, department, year_of_birth, year_of_employment);
        this.fix_bugs = fix_bugs;
        this.realisation_new_func = realisation_new_func;
    }

    public int getFix_bugs() {
        return fix_bugs;
    }

    public void setFix_bugs(int fix_bugs) {
        this.fix_bugs = fix_bugs;
    }

    public int getRealisation_new_func() {
        return realisation_new_func;
    }

    public void setRealisation_new_func(int realisation_new_func) {
        this.realisation_new_func = realisation_new_func;
    }

    @Override
    public String toString() {
        return "Отдел разработки" + super.toString()+
                "Исправил багов = " + fix_bugs +
                ", Реализовал фич = " + realisation_new_func;
    }

}
