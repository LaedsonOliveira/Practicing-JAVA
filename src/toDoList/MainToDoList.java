package toDoList;

import java.time.LocalDate;
import java.util.Scanner;

public class MainToDoList {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        LocalDate dateNow = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n \n \nToDoList, " + dateNow);
        System.out.println("Your task list is currently empty! \n \nAdd news task!");

        boolean program = true;
        while (program){

                System.out.println("\n\n\nChoose the option: \n 1 - Create Task \n 2 - Get Task List \n 3 - Search Task \n 4 - Complete Task \n 5 - Delete Task \n 6 - Out");
                char act = scanner.nextLine().charAt(0);

                switch (act){

                    case '1':
                        try {
                            System.out.println("Write the title of task:");
                            String title = scanner.nextLine();
                            System.out.println("Write the description of task:");
                            String description = scanner.nextLine();
                            System.out.println("How many days of deadline?");
                            int term = Integer.parseInt(scanner.nextLine());
                            taskList.createTask(title, description, dateNow, term);
                            break;
                        } catch (Exception e){
                            System.out.println("Value error");
                        }


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
                        try{
                            System.out.println("Write id of Task that you will Complete:");
                            int idSearch = Integer.parseInt((scanner.nextLine()));
                            String valueTask = (taskList.getTask(idSearch) != null) ? taskList.getTask(idSearch) : "Task don't find";
                            System.out.println("Confirm that is this Task: \n "+  valueTask +"\n (y) - yes (n) - no");
                            if(scanner.nextLine().charAt(0) == 'y')
                                System.out.println(taskList.completeTask(idSearch));
                            else
                                System.out.println(("Not Completed"));

                            break;
                        } catch (Exception e){
                            System.out.println("Value error!");
                        }


                    case '5':
                        try{
                            System.out.println("Write id of Task that you will delete:");
                            int idSearch = Integer.parseInt((scanner.nextLine()));
                            System.out.println("Confirm that is this Task: "+ taskList.getTask(idSearch) +" (y) - yes (n) - no");
                            if(scanner.nextLine().charAt(0) == 'y')
                                System.out.println(taskList.deleteTask(idSearch));
                            else
                                System.out.println(("Not deleted"));

                            break;
                        } catch (Exception e){
                            System.out.println("Value error!");
                        }

                    case '6':
                        System.out.println("Program closed!");
                        program = false;

                    default:
                        System.out.println("Invalid Value, try again!");
                        break;
                }

        }

    }

}
