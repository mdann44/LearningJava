package MVP_3_0.BdPractice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StartMain {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        TreeMap<Integer, DepartmentQa> qa = new TreeMap<>();//Создал карту для хранения тестеров
        TreeMap<Integer, DepartmentDevelopment> dev = new TreeMap<>();//Создал карту для хранения разрабов
        DepartmentQa qa_obj = new DepartmentQa();//Пустой объект(выделение памяти) для вызова методов класса
        DepartmentDevelopment dev_obj = new DepartmentDevelopment();//Пустой объект(выделение памяти) для вызова методов класса

        //Реализовал интерфейс, чтобы вызвать метод просмотра в методе main
        myInterfaceViewQa qa_view_inter = new myInterfaceViewQa() {
            @Override
            public void viewQa() {
                for (Map.Entry<Integer, DepartmentQa> item : qa.entrySet()) {
                    System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                }
            }
        };

        //Реализовал интерфейс, чтобы вызвать метод просмотра в методе main
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
            System.out.println(ANSI_GREEN + "С какими данными будем работать?" + ANSI_RESET + "\nС тестировщиками - напишите " + ANSI_YELLOW + "qa" + ANSI_RESET + "\nС разработчиками - напишите " + ANSI_YELLOW + "dev" + ANSI_RESET + "\nДля завершения - напишите " + ANSI_YELLOW + "exit" + ANSI_RESET);
            String answer_input = in.next();

            //Тестировщики
            if (answer_input.equalsIgnoreCase("qa")) {
                while (true) {

                    System.out.println("Чтобы создать тестировщика, напишите " + ANSI_YELLOW + "new_qa" + ANSI_RESET);
                    System.out.println("Чтобы просмотреть данные тестировщиков, напишите " + ANSI_YELLOW + "view_qa" + ANSI_RESET);
                    System.out.println("Чтобы изменить данные тестировщиков, напишите " + ANSI_YELLOW + "update_qa" + ANSI_RESET);
                    System.out.println("Чтобы удалить данные конкретного тестировщика, напишите " + ANSI_YELLOW + "delete_qa" + ANSI_RESET);
                    System.out.println("Чтобы вернуться, напишите " + ANSI_YELLOW + "back" + ANSI_RESET);
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
                        if (qa.size() == 0) {
                            System.out.println(ANSI_RED + "!!!!Таблица тестировщиков пустая!!!!" + ANSI_RESET);
                        } else {
                            qa_view_inter.viewQa();
                        }
                        //Сценарий обновления данных конкретного тестера
                    } else if (answer_user.equalsIgnoreCase("update_qa")) {
                        if (qa.size() == 0) {
                            System.out.println(ANSI_RED + "!!!!Таблица тестировщиков пустая!!!!" + ANSI_RESET);
                        } else {
                            qa_view_inter.viewQa();
                            System.out.println("Укажите значение " + ANSI_YELLOW + "Key" + ANSI_RESET + " объекта, который хотите изменить");
                            int key_update = in.nextInt();
                            System.out.println(ANSI_GREEN + "Заполните новые значения" + ANSI_RESET);
                            qa_obj.createQa();
                            qa_obj.age_calculation();
                            qa_obj.experience_calculation();
                            qa.replace(key_update, qa_obj);
                            System.out.println(ANSI_GREEN + "Отредактированная таблица: " + ANSI_RESET);
                            qa_view_inter.viewQa();
                        }
                        //Сценарий удаления конкретного тестера
                    } else if (answer_user.equalsIgnoreCase("delete_qa")) {
                        if (qa.size() == 0) {
                            System.out.println(ANSI_RED + "!!!!Таблица тестировщиков пустая!!!!" + ANSI_RESET);
                        } else {
                            qa_view_inter.viewQa();
                            System.out.println("Укажите значение " + ANSI_YELLOW + "Key" + ANSI_RESET + " объекта, который хотите удалить");
                            int key_update = in.nextInt();
                            qa.remove(key_update);
                        }
                        if (qa.size() == 0) {
                            System.out.println(ANSI_RED + "!!!!Таблица тестировщиков пустая!!!!" + ANSI_RESET);
                        } else {
                            System.out.println(ANSI_GREEN + "Обновленная таблица тестировщиков" + ANSI_RESET);
                            qa_view_inter.viewQa();
                        }
                    } else if (answer_user.equalsIgnoreCase("back")) {
                        break;
                    } else {
                        System.out.println(ANSI_RED + "Укажите один из вариантов:" + ANSI_RESET);
                    }
                }
                //Разработчики
            } else if (answer_input.equalsIgnoreCase("dev")) {
                while (true) {
                    System.out.println("Чтобы создать разработчика, напишите " + ANSI_YELLOW + "new_dev" + ANSI_RESET);
                    System.out.println("Чтобы просмотреть данные разработчиков, напишите " + ANSI_YELLOW + "view_dev" + ANSI_RESET);
                    System.out.println("Чтобы изменить данные разработчиков, напишите " + ANSI_YELLOW + "update_dev" + ANSI_RESET);
                    System.out.println("Чтобы удалить данные конкретного разработчика, напишите " + ANSI_YELLOW + "delete_dev" + ANSI_RESET);
                    System.out.println("Чтобы вернуться, напишите " + ANSI_YELLOW + "back" + ANSI_RESET);
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
                        if (dev.size() == 0) {
                            System.out.println(ANSI_RED + "!!!!Таблица разработчиков пустая!!!!" + ANSI_RESET);
                        } else {
                            dev_view_inter.viewDev();
                        }
                        //Сценарий редактирования конкретного разработчика
                    } else if (answer_user.equalsIgnoreCase("update_dev")) {
                        if (dev.size() == 0) {
                            System.out.println(ANSI_RED + "!!!!Таблица разработчиков пустая!!!!" + ANSI_RESET);
                        } else {
                            dev_view_inter.viewDev();
                            System.out.println("Укажите значение " + ANSI_YELLOW + "Key" + ANSI_RESET + " объекта, который хотите изменить");
                            int key_update = in.nextInt();
                            dev_obj.create_dev();
                            dev_obj.age_calculation();
                            dev_obj.experience_calculation();
                            dev.replace(key_update, dev_obj);
                            System.out.println(ANSI_GREEN + "Отредактированная таблица: " + ANSI_RESET);
                            dev_view_inter.viewDev();
                        }
                        //Сценарий удаления конкретного разработчика
                    } else if (answer_user.equalsIgnoreCase("delete_dev")) {
                        if (dev.size() == 0) {
                            System.out.println(ANSI_RED + "!!!!Таблица разработчиков пустая!!!!" + ANSI_RESET);
                        } else {
                            dev_view_inter.viewDev();
                            System.out.println("Укажите значение " + ANSI_YELLOW + "Key" + ANSI_RESET + " объекта, который хотите удалить");
                            int key_update = in.nextInt();
                            dev.remove(key_update);
                            if (dev.size() == 0) {
                                System.out.println(ANSI_RED + "!!!!Таблица разработчиков пустая!!!!" + ANSI_RESET);
                            } else {
                                System.out.println(ANSI_GREEN + "Обновленная таблица разработчиков" + ANSI_RESET);
                                dev_view_inter.viewDev();
                            }
                        }
                    } else if (answer_user.equalsIgnoreCase("back")) {
                        break;
                    } else {
                        System.out.println(ANSI_RED + "Укажите один из вариантов:" + ANSI_RESET);
                    }
                }
            } else if (answer_input.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println(ANSI_RED + "Укажите один из вариантов:" + ANSI_RESET);
            }
        }
    }
}

