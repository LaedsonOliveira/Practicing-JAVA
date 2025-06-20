package toDoList;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TaskList {

    private int numberTasks;
    private int numberOkTasks;
    private int numberNotTasks;
    private int contadorId;

    private List<Task> listTasks = new ArrayList<>();
    private List<Task> listCompletTask = new ArrayList<>();
    LocalDate dateNow = LocalDate.now();

    public void getAllTask(){
        System.out.println("         TASKS");
        System.out.println("+-----------------------------------------------");
        if (listTasks != null) {
            for (Task task : listTasks) {
                System.out.println("| id: " + task.getId() + " Title: " + task.getTitle() + " Delivery: " + task.getDeliveryDate() + " Finish: "+ ((task.getActive() == false)? "yes": "no"));
                System.out.println("+-----------------------------------------------");
            }
        }
    }

    public String getTask(int id){
        Task getTask = null;
        for (Task task : listTasks){
            if( task.getId() == id){
                getTask = task;
            }
            if (getTask != null){
                Period diference = Period.between( dateNow , getTask.getDeliveryDate());
                String response = (getTask.getActive() != true)? "Task Conclued": "Time: " + diference.getDays() + " days";

                return ("\n+-------------------------------------------------" +
                        "\n| Title: "+ getTask.getTitle() +
                        "\n| " + response +
                        "\n| ID: "+ getTask.getId()+
                        "\n+-------------------------------------------------" +
                        "\n| Description: " + getTask.getDescription()+
                        "\n+-------------------------------------------------");
            } else{
                return "Invalid ID, try again";
            }
        }
        return "";
    }

    public String createTask(String title, String description, LocalDate deliveryDate, int term){
        try{
            contadorId++;
            LocalDate dateDeliveryTask = deliveryDate.plusDays(term);
            Task task = new Task(title, description, dateDeliveryTask, contadorId);
            listTasks.add(task);
        }catch (Exception e){
            return "Invalid information";
        }

        return "Task added successfully";

    }

    public String completeTask(int id){
        Task taskCompleted = null;
        try{
            for (Task task: listTasks){
                if(task.getId() == id){
                    taskCompleted = task;
                }
                if (taskCompleted != null){
                    task.setActive(false);
                    return "Task "+ taskCompleted.getTitle()+" completed successfully";
                } else{
                    return "Invalid ID, try again";
                }
            }
        }catch (Exception e){
            return "Action failed";
        }

        return "";
    }

    public String deleteTask(int id){
        Task taskRemoved = null;
        try{
            for (Task task: listTasks){
                if(task.getId() == id){
                    taskRemoved = task;
                }
                if (taskRemoved != null){
                    listTasks.remove(taskRemoved);
                    return "Task "+ taskRemoved.getTitle()+" removed successfully";
                } else{
                    return "Invalid ID, try again";
                }
            }
        }catch (Exception e){
            return "Action failed";
        }

        return "";
    }

}
