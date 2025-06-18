package toDoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskList {

    private int numberTasks;
    private int numberOkTasks;
    private int numberNotTasks;

    private List<Task> listTasks = new ArrayList<>();

    public String CreateTask(String title, String description, String deliveryDate, int importance){
        try{
            Task task = new Task(title, description, deliveryDate,importance);
            listTasks = Collections.singletonList(task);
        }catch (Exception e){
            return "Invalid information";
        }

        return "Task added successfully";

    }

    public String CompleteTask(int id){
        Task taskRemoved = null;
        try{
            for (Task task: listTasks){
                if(task.getId() == id){
                    taskRemoved =task;
                    break;
                }
                if (taskRemoved != null){
                    listTasks.remove(taskRemoved);
                    return "Task "+ taskRemoved.getTitle()+" removed successfully";
                }
            }
        }catch (Exception e){
            return "Action failed";
        }

        return "";
    }

}
