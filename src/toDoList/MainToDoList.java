package toDoList;

import java.time.LocalDate;
import java.util.Scanner;

public class MainToDoList {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        LocalDate dateNow = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n \n \nToDoList, " + dateNow);
        System.out.println("Your task list is currently empty! \n \nAdd news task! \n");

        boolean program = true;
        while (program){
            System.out.println("Choose the option: \n 1 - Create Task \n 2 - Get Task List \n 3 - Search Task \n 4 - Delete Task");
            char act = scanner.nextLine().charAt(0);

            switch (act){

                case '1':
                    System.out.println("Write the title of task:");
                    String title = scanner.nextLine();
                    System.out.println("Write the description of task:");
                    String description = scanner.nextLine();
                    System.out.println("Choose the importance of task: (t) - true (f) - false");
                    boolean importance = (scanner.nextLine().charAt(0) == 't') ? true : false;
                    taskList.createTask(title, description, dateNow, importance);
                    break;

                case '2':
                    taskList.getAllTask();
                    break;

                case '3':
                    try{
                        System.out.println("What's id of Task?");
                        int idSearch = Integer.parseInt(scanner.nextLine());
                        System.out.println(taskList.getTask(idSearch));
                    }catch (Exception e){
                        System.out.println("Value ID invalid! Try again!");
                    }
                    break;

                case '4':
                    System.out.println("Write id of Task that you will delete:");
                    int idSearch = Integer.parseInt((scanner.nextLine()));
                    System.out.println("Confirm that is this Task: "+ taskList.getTask(idSearch) +" (y) - yes (n) - no");
                    if(scanner.nextLine().charAt(0) == 'y')
                        System.out.println(taskList.deleteTask(idSearch));
                    else
                        System.out.println(("Not deleted"));

                    break;
                default:
                    System.out.println("Invalid Value, try again!");
                    break;
            }

            System.out.println("\n\n\nWant to continue? (y) - yes (n) - no");
            program = (scanner.nextLine().charAt(0) == 'y') ? true : false;
            System.out.println("\n\n\n");

        }



    }
}
