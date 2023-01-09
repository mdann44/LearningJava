package ActualMvp3_0BdPractice;

import java.util.Scanner;

public class DepartmentDevelopment extends StaffSberHealth {
    Scanner in = new Scanner(System.in);
    private int fix_bugs;
    private int realisation_new_func;

    public DepartmentDevelopment(String name, String surname, String department, int year_of_birth, int year_of_employment, int fix_bugs, int realisation_new_func) {
        super(name, surname, department, year_of_birth, year_of_employment);
        this.fix_bugs = fix_bugs;
        this.realisation_new_func = realisation_new_func;
    }

    public DepartmentDevelopment() {
        super();
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
    public void createDev(){
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
        System.out.println("Сколько исправил багов: ");
        valid_int.validationInt();
        setFix_bugs(in.nextInt());
        System.out.println("Сколько Реализовал фич: ");
        valid_int.validationInt();
        setRealisation_new_func(in.nextInt());
    }

}
