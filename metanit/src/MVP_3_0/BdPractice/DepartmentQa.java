package MVP_3_0.BdPractice;


import java.util.Scanner;

public class DepartmentQa extends StaffSberHealth {


    private int bugs_found;
    private int missed_bugs;


    public DepartmentQa(String name, String surname, String department, int year_of_birth, int year_of_employment, int bugs_found, int missed_bugs) {
        super(name, surname, department, year_of_birth, year_of_employment);
        this.bugs_found = bugs_found;
        this.missed_bugs = missed_bugs;
    }
    public DepartmentQa() {
        super();
    }

    public int getBugs_found() {
        return bugs_found;
    }

    public void setBugs_found(int bugs_found) {
        this.bugs_found = bugs_found;
    }

    public int getMissed_bugs() {
        return missed_bugs;
    }

    public void setMissed_bugs(int missed_bugs) {
        this.missed_bugs = missed_bugs;
    }


    @Override
    public String toString() {
        return "Отдел тестирования" + super.toString()+
                " Нашел багов = " + bugs_found +
                ", Пропустил багов = " + missed_bugs;
    }
    //Метод создания нового тестировщика
    public void createQa(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        setName(in.next());
        System.out.println("Введите фамилию: ");
        setSurname(in.next());
        System.out.println("Введите должность: ");
        setDepartment(in.next());
        System.out.println("Введите год рождения: ");
        setYear_of_birth(in.nextInt());
        System.out.println("Введите год начала работы: ");
        setYear_of_employment(in.nextInt());
        System.out.println("Сколько нашел багов: ");
        setBugs_found(in.nextInt());
        System.out.println("Сколько пропустил багов: ");
        setMissed_bugs(in.nextInt());

    }


}
