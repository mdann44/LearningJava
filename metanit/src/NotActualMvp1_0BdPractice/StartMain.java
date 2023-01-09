package NotActualMvp1_0BdPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StartMain {
    public static void main(String[] args) {
        List<DepartmentQa> listQa = new ArrayList<>();

        DepartmentQa q1 = new DepartmentQa("Петя", "Иванов", "Тестировщик", 1992, 2020, 10, 2);
        q1.age_calculation();
        q1.experience_calculation();

        DepartmentQa q2 = new DepartmentQa("Коля", "Петров", "Тестировщик1", 1991, 2021, 11, 3);
        q2.age_calculation();
        q2.experience_calculation();

        listQa.add(q1);
        listQa.add(q2);


        //Метод создания Тестировщика
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Чтобы создать тестировщика, напишите 'qa'");
            String answer_user = in.next();
            if (answer_user.equalsIgnoreCase("qa")) {
                System.out.println("Введите имя: ");
                String name_qa = in.next();
                System.out.println("Введите фамилию: ");
                String surname_qa = in.next();
                System.out.println("Введите должность: ");
                String department_qa = in.next();
                System.out.println("Введите год рождения: ");
                int year_of_birth_qa = in.nextInt();
                System.out.println("Введите год начала работы: ");
                int year_of_employment_qa = in.nextInt();
                System.out.println("Сколько нашел багов: ");
                int bugs_found_qa = in.nextInt();
                System.out.println("Сколько пропустил багов: ");
                int missed_bugs_qa = in.nextInt();
                DepartmentQa qa = new DepartmentQa(name_qa, surname_qa, department_qa, year_of_birth_qa, year_of_employment_qa, bugs_found_qa, missed_bugs_qa);
                qa.age_calculation();
                qa.experience_calculation();
                listQa.add(qa);
                for (DepartmentQa departmentQa : listQa) {
                    System.out.println(departmentQa);
                }
            }
            else break;
        }


    }
}
