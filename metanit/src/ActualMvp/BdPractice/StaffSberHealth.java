package ActualMvp.BdPractice;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;

public class StaffSberHealth {

    private String name;
    private String surname;
    private String department;
    private int year_of_birth;
    private int age;
    private int year_of_employment;
    private int experience;

    public StaffSberHealth(String name, String surname, String department, int year_of_birth, int year_of_employment) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.year_of_employment = year_of_employment;
        this.year_of_birth = year_of_birth;
        age_calculation();
        experience_calculation();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear_of_employment() {
        return year_of_employment;
    }

    public void setYear_of_employment(int year_of_employment) {
        this.year_of_employment = year_of_employment;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void age_calculation() {
        Calendar current_year = Calendar.getInstance();
        NumberFormat format = new DecimalFormat("0");
        String age = format.format(current_year.get(Calendar.YEAR) - year_of_birth);
        int age_calculation = Integer.parseInt(age);
        setAge(age_calculation);
    }


    public void experience_calculation() {
        Calendar current_year = Calendar.getInstance();
        NumberFormat format = new DecimalFormat("0");
        String experience = format.format(current_year.get(Calendar.YEAR) - year_of_employment);
        int experience_calculation = Integer.parseInt(experience);
        setExperience(experience_calculation);
    }

    @Override
    public String toString() {

        return ": " +
                "Имя='" + name + '\'' +
                ", Фамилия=' " + surname + '\'' +
                ", Должность=' " + department + '\'' +
                ", Год рождения= " + year_of_birth +
                ", Возраст= " + age +
                ", Год начала работы= " + year_of_employment +
                ", Стаж= " + experience +
                ',';
    }

}
