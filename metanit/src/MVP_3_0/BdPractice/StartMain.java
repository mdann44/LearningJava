package MVP_3_0.BdPractice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class StartMain {
    /*Создал интерфейсы локально, внутри стартового класса,
    чтобы реализовать методы просмотра в методе main*/
    interface myInterfaceViewQa {
        void viewQa();
    }

    interface myInterfaceViewDev {
        void viewDev();
    }

    public static void main(String[] args) {
        TreeMap<Integer, DepartmentQa> qa = new TreeMap<>();//Создал карту для хранения тестеров
        TreeMap<Integer, DepartmentDevelopment> dev = new TreeMap<>();//Создал карту для хранения разрабов
        DepartmentQa qa_obj = new DepartmentQa();//Пустой объект(выделение памяти) для вызова методов класса
        DepartmentDevelopment dev_obj = new DepartmentDevelopment();//Пустой объект(выделение памяти) для вызова методов класса

        //Реализовал интерфейс, чтобы вызвать метод в методе (Просмотр таблицы)
        myInterfaceViewQa qa_view_inter = new myInterfaceViewQa() {
            @Override
            public void viewQa() {
                for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {
                    System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                }
            }
        };

        //Реализовал интерфейс, чтобы вызвать метод в методе (Просмотр таблицы)
        myInterfaceViewDev dev_view_inter = new myInterfaceViewDev() {
            @Override
            public void viewDev() {
                for (Map.Entry<Integer, DepartmentDevelopment> item : dev.entrySet()) {
                    System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                }
            }
        };
        //Создал пару тестировщиков, для наполнения БД
        DepartmentQa q1 = new DepartmentQa("Петя", "Иванов", "Тестировщик", 1992, 2020, 10, 2);
        q1.age_calculation();//Вызвал метод калькуляции возраста от даты рождения
        q1.experience_calculation(); //Вызвал метод калькуляции стажа, от даты трудоустройства

        DepartmentQa q2 = new DepartmentQa("Коля", "Петров", "Тестировщик1", 1991, 2021, 11, 3);
        q2.age_calculation();//Вызвал метод калькуляции возраста от даты рождения
        q2.experience_calculation();//Вызвал метод калькуляции стажа, от даты трудоустройства

        //Создал пару разработчиков, для наполнения БД
        DepartmentDevelopment d1 = new DepartmentDevelopment("Коля", "Петров", "Разработчик", 1991, 2021, 11, 3);
        d1.age_calculation();//Вызвал метод калькуляции возраста от даты рождения
        d1.experience_calculation();//Вызвал метод калькуляции стажа, от даты трудоустройства

        DepartmentDevelopment d2 = new DepartmentDevelopment("Аркадий", "Сидоров", "Разработчик", 1985, 2016, 1121, 32);
        d2.age_calculation();//Вызвал метод калькуляции возраста от даты рождения
        d2.experience_calculation();//Вызвал метод калькуляции стажа, от даты трудоустройства

        qa.put(1, q1);//Внес в карту(TreeMap) данные тестовых тестеров
        qa.put(2, q2);

        dev.put(1, d1);//Внес в карту(TreeMap) данные тестовых разрабов
        dev.put(2, d2);

        int count_qa = 3;//Инициализировал счетчик ключей для тестеров/разрабов (присвоение ключей в TreeMap)
        int count_dev = 3;


        //Входной цикл в программу
        while (true) {

            Scanner in = new Scanner(System.in);//Запустил сканер, который будет читать консоль
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
                    //Сценарий создания нового тестера
                    if (answer_user.equalsIgnoreCase("new_qa")) {
                        qa_obj.createQa();
                        qa_obj.age_calculation();
                        qa_obj.experience_calculation();
                        qa.put(count_qa, new DepartmentQa(qa_obj.getName(), qa_obj.getSurname(), qa_obj.getDepartment(), qa_obj.getYear_of_birth(), qa_obj.getYear_of_employment(), qa_obj.getBugs_found(), qa_obj.getMissed_bugs()));
                        count_qa++;
                        qa_view_inter.viewQa();
                        //Сценарий просмотра таблицы тестеров
                    } else if (answer_user.equalsIgnoreCase("view_qa")) {
                        qa_view_inter.viewQa();
                        //Сценарий обновления данных конкретного тестера
                    } else if (answer_user.equalsIgnoreCase("update_qa")) {
                        qa_view_inter.viewQa();
                        System.out.println("Укажите значение Key объекта, который хотите изменить");
                        int key_update = in.nextInt();
                        System.out.println("Заполните новые значения");
                        qa_obj.createQa();
                        qa_obj.age_calculation();
                        qa_obj.experience_calculation();
                        qa.replace(key_update, qa_obj);
                        System.out.println("Отредактированная таблица: ");
                        qa_view_inter.viewQa();
                        //Сценарий удаления конкретного тестера
                    } else if (answer_user.equalsIgnoreCase("delete_qa")) {
                        qa_view_inter.viewQa();
                        System.out.println("Укажите значение Key объекта, который хотите удалить");
                        int key_update = in.nextInt();
                        qa.remove(key_update);
                        if (qa.size() == 0) {
                            System.out.println("!!!!Таблица тестировщиков пустая!!!!");
                        } else {
                            System.out.println("Обновленная таблица тестировщиков");
                            qa_view_inter.viewQa();
                        }
                    } else break;
                }
                //Разработчики
            } else if (answer_input.equalsIgnoreCase("dev")) {
                while (true) {
                    System.out.println("Чтобы создать разработчика, напишите 'new_dev'");
                    System.out.println("Чтобы просмотреть данные разработчиков, напишите 'view_dev'");
                    System.out.println("Чтобы изменить данные разработчиков, напишите 'update_dev'");
                    System.out.println("Чтобы удалить данные конкретного разработчика, напишите 'delete_dev'");
                    System.out.println("Чтобы вернуться, напишите 'back'");
                    String answer_user = in.next();
                    //Сценарий создания нового разработчика
                    if (answer_user.equalsIgnoreCase("new_dev")) {
                        dev_obj.createDev();
                        dev_obj.age_calculation();
                        dev_obj.experience_calculation();
                        dev.put(count_dev, dev_obj);
                        count_dev++;
                        dev_view_inter.viewDev();
                        //Сценарий просмотра таблицы разработчиков
                    } else if (answer_user.equalsIgnoreCase("view_dev")) {
                        dev_view_inter.viewDev();
                        //Сценарий редактирования конкретного разработчика
                    } else if (answer_user.equalsIgnoreCase("update_dev")) {
                        dev_view_inter.viewDev();
                        System.out.println("Укажите значение Key объекта, который хотите изменить");
                        int key_update = in.nextInt();
                        dev_obj.create_dev();
                        dev_obj.age_calculation();
                        dev_obj.experience_calculation();
                        dev.replace(key_update, dev_obj);
                        System.out.println("Отредактированная таблица: ");
                        dev_view_inter.viewDev();
                        //Сценарий удаления конкретного разработчика
                    } else if (answer_user.equalsIgnoreCase("delete_dev")) {
                        dev_view_inter.viewDev();
                        System.out.println("Укажите значение Key объекта, который хотите удалить");
                        int key_update = in.nextInt();
                        qa.remove(key_update);
                        if (qa.size() == 0) {
                            System.out.println("!!!!Таблица разработчиков пустая!!!!");
                        } else {
                            System.out.println("Обновленная таблица разработчиков");
                            dev_view_inter.viewDev();
                        }
                    } else break;
                }
            } else break;
        }
    }
}

