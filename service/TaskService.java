package service;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskService {
    public static void handleTask(String choice, Scanner sc, ArrayList<String> list) {
        switch (choice) {
            case "a":
                service.TaskService.addTask(sc, list);
                break;
            case "v":
                service.TaskService.viewTask(sc, list);
                break;
            case " u":
                service.TaskService.updateTask(sc, list);
                break;
            case " d":
                service.TaskService.deleteTask(sc, list);
                break;
            case " dall":
                service.TaskService.deleteAllTask(sc, list);
                break;
            case " e":
                service.TaskService.exit(sc, list);

            default:
                System.out.println("...INVALID CHOICE SELECTED.....");
                break;
        }
    }

    public static void addTask(Scanner sc, ArrayList<String> list) {

        String s;
        int idx = 0;

        while (true) {
            idx++;
            System.out.print("ENTER TASK " + idx + " : ");
            String task = sc.next();
            list.add(task);

            boolean isContinue = true;
            while (isContinue) {
                System.out.print("ENTER C  TO CONTINUE ADDING TASK AND  E TO EXIT ADDING.");
                s = sc.next();

                if (s.equalsIgnoreCase("C")) {
                    isContinue = false;
                    continue;
                } else if (s.equalsIgnoreCase("E")) {
                    System.out.println("... EXITING ADD TASK....");
                    isContinue = false;
                    return;
                } else {
                    System.out.println("......WRONG OPTION SELECTED.....");
                    continue;
                }
            }

        }
    }

    public static void viewTask(Scanner sc, ArrayList<String> list) {

        if (list.isEmpty()) {
            System.out.println("----NO TASK ADDED----");
            return;
        } else {
            System.out.println(".....SHOWING TODO LIST.......");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + "." + list.get(i));
            }

        }
    }

    public static void updateTask(Scanner sc, ArrayList<String> list) {
        int idx = 1;
        System.out.println("ENTER INDEX OF TASK TO UPDATE:");
        idx = sc.nextInt();

        if (idx > list.size() - 1) {
            System.out.println(" ....THIS INDEX DOES NOT EXIST......");
            return;
        }

        System.out.println("ENTER UPDATED TASK:");
        String updatedTask = sc.next();

        list.set(idx, updatedTask);
        System.out.println("TO DO LIST UPDATED.");

    }

    public static void deleteTask(Scanner sc, ArrayList<String> list) {
        System.out.println("ENTER INDEX TO DELETE TASK");
        int idx = 0;
        idx = sc.nextInt();
        list.remove(idx);
        idx--;
        System.out.println("TASK AT INDEX " + idx + " IS DELETED.");
    }

    public static void deleteAllTask(Scanner sc, ArrayList<String> list) {
        list.removeAll(list);
        System.out.println("ALL TASK DELETED>");
    }

    public static void exit(Scanner sc, ArrayList<String> list) {
        System.out.println("....EXITING PROGRAM.......");
        return;
    }

}
