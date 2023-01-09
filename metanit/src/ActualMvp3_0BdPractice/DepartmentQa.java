package ActualMvp3_0BdPractice;


import java.util.Calendar;
import java.util.Scanner;

public class DepartmentQa extends StaffSberHealth {
    Scanner in = new Scanner(System.in);


    private int bugs_found;
    private int missed_bugs;
    int year_min;

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
        return "Отдел тестирования" + super.toString() +
                " Нашел багов = " + bugs_found +
                ", Пропустил багов = " + missed_bugs;
    }

    //Метод создания нового тестировщика
    public void createQa() {
//Реализовал методы валидации строк и чисел
        myInterfaceValidationString valid_String = new myInterfaceValidationString() {
            @Override
            public void validationString() {
                while (!in.hasNext("[а-яА-ЯёЁa-zA-Z]{1,20}$")) {
                    System.out.println("Можно ввести только буквы");
                    in.next();
                }
            }
        };
        myInterfaceValidationInt valid_int = new myInterfaceValidationInt() {
            @Override
            public void validationInt() {
                while (!in.hasNextInt()) {
                    System.out.println("Можно ввести только цифры");
                    in.next();
                }
            }
        };
        System.out.println("Введите имя: ");
        valid_String.validationString();

        setName(in.next());
        System.out.println("Введите фамилию: ");
        valid_String.validationString();

        setSurname(in.next());
        System.out.println("Введите должность: ");
        valid_String.validationString();
        setDepartment(in.next());

        System.out.println("Введите год рождения: ");
        valid_int.validationInt();
        setYear_of_birth(in.nextInt());
        System.out.println("Введите год начала работы: ");
        valid_int.validationInt();

        setYear_of_employment(in.nextInt());
        System.out.println("Сколько нашел багов: ");
        valid_int.validationInt();

        setBugs_found(in.nextInt());
        System.out.println("Сколько пропустил багов: ");
        valid_int.validationInt();

        setMissed_bugs(in.nextInt());

    }


}
