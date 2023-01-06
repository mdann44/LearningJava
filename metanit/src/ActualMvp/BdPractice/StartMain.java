package ActualMvp.BdPractice;

import java.util.*;


public class StartMain {


    public static void main(String[] args) {
        TreeMap<Integer, DepartmentQa> qa = new TreeMap<Integer, DepartmentQa>();
        TreeMap<Integer, DepartmentDevelopment> dev = new TreeMap<Integer, DepartmentDevelopment>();

        DepartmentQa q1 = new DepartmentQa("Петя", "Иванов", "Тестировщик", 1992, 2020, 10, 2);
        q1.age_calculation();
        q1.experience_calculation();

        DepartmentQa q2 = new DepartmentQa("Коля", "Петров", "Тестировщик1", 1991, 2021, 11, 3);
        q2.age_calculation();
        q2.experience_calculation();

        qa.put(1, q1);
        qa.put(2, q2);
        int count_qa = 3;
        int count_dev = 3;


        //Входной цикл в программу
        while (true) {

            Scanner in = new Scanner(System.in);
            System.out.println("С какими данными будем работать?\nТестировщики(qa) или Разработчики (dev)?");
            String answer_input = in.next();
            //Тестировщики
            if (answer_input.equalsIgnoreCase("qa")) {
                while (true) {
                    System.out.println("Чтобы создать тестировщика, напишите 'new_qa'");
                    System.out.println("Чтобы просмотреть данные тестировщиков, напишите 'view_qa'");
                    System.out.println("Чтобы изменить данные тестировщиков, напишите 'update_qa'");
                    System.out.println("Чтобы удалить данные конкретного тестировщика, напишите 'delete_qa'");
                    System.out.println("Чтобы вернуться, напишите 'back'");
                    String answer_user = in.next();
                    if (answer_user.equalsIgnoreCase("new_qa")) {

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
                        qa.put(count_qa, new DepartmentQa(name_qa, surname_qa, department_qa, year_of_birth_qa, year_of_employment_qa, bugs_found_qa, missed_bugs_qa));
                        count_qa++;
                        for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }

                    } else if (answer_user.equalsIgnoreCase("view_qa")) {
                        for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }
                    } else if (answer_user.equalsIgnoreCase("update_qa")) {
                        for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }
                        System.out.println("Укажите значение Key объекта, который хотите изменить");
                        int key_update = in.nextInt();
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
                        qa.replace(key_update, new DepartmentQa(name_qa, surname_qa, department_qa, year_of_birth_qa, year_of_employment_qa, bugs_found_qa, missed_bugs_qa));
                        System.out.println("Отредактированная таблицы: ");
                        for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }
                    } else if (answer_user.equalsIgnoreCase("delete_qa")) {
                        for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }
                        System.out.println("Укажите значение Key объекта, который хотите удалить");
                        int key_update = in.nextInt();
                        qa.remove(key_update);
                        if (qa.size() == 0) {
                            System.out.println("!!!!Таблица тестировщиков пустая!!!!");
                        } else {
                            System.out.println("Обновленная таблица тестировщиков");
                            for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                                System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());

                            }
                        }
                    } else break;
                }
                //Разработчики
            } else if (answer_input.equalsIgnoreCase("dev")) {
                while (true) {
                    System.out.println("Чтобы создать разработчика, напишите 'new_dev'");
                    System.out.println("Чтобы просмотреть данные тестировщиков, напишите 'view_qa'");
                    System.out.println("Чтобы изменить данные тестировщиков, напишите 'update_qa'");
                    System.out.println("Чтобы удалить данные конкретного тестировщика, напишите 'delete_qa'");
                    System.out.println("Чтобы вернуться, напишите 'back'");
                    String answer_user = in.next();
                    if (answer_user.equalsIgnoreCase("new_dev")) {

                        System.out.println("Введите имя: ");
                        String name_dev = in.next();
                        System.out.println("Введите фамилию: ");
                        String surname_dev = in.next();
                        System.out.println("Введите должность: ");
                        String department_dev = in.next();
                        System.out.println("Введите год рождения: ");
                        int year_of_birth_dev = in.nextInt();
                        System.out.println("Введите год начала работы: ");
                        int year_of_employment_dev = in.nextInt();
                        System.out.println("Сколько исправил багов: ");
                        int fix_bugs = in.nextInt();
                        System.out.println("Сколько реализовал фич: ");
                        int realisation_new_func = in.nextInt();
                        dev.put(count_dev, new DepartmentDevelopment(name_dev, surname_dev, department_dev, year_of_birth_dev, year_of_employment_dev, fix_bugs, realisation_new_func));
                        count_dev++;


                        for (Map.Entry<Integer, DepartmentDevelopment> item : dev.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }

                    } else if (answer_user.equalsIgnoreCase("view_qa")) {
                        for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }
                    } else if (answer_user.equalsIgnoreCase("update_qa")) {
                        for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }
                        System.out.println("Укажите значение Key объекта, который хотите изменить");
                        int key_update = in.nextInt();
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
                        qa.replace(key_update, new DepartmentQa(name_qa, surname_qa, department_qa, year_of_birth_qa, year_of_employment_qa, bugs_found_qa, missed_bugs_qa));
                        System.out.println("Отредактированная таблицы: ");
                        for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }
                    } else if (answer_user.equalsIgnoreCase("delete_qa")) {
                        for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                        }
                        System.out.println("Укажите значение Key объекта, который хотите удалить");
                        int key_update = in.nextInt();
                        qa.remove(key_update);
                        if (qa.size() == 0) {
                            System.out.println("!!!!Таблица тестировщиков пустая!!!!");
                        } else {
                            System.out.println("Обновленная таблица тестировщиков");
                            for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {

                                System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());

                            }
                        }
                    } else break;
                }
            } else break;
        }
    }

}

