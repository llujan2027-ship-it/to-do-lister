/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolister;

/**
 *
 * @author llujan2027
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ToDoLister {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Do laundry", 3, 3));
        tasks.add(new Task("Finish homework", 1, 6));
        tasks.add(new Task("Clean room", 2, 3));
        tasks.add(new Task("Make a DND character", 4, 7));
        tasks.add(new Task("Study lines", 4, 2));
        
        //System.out.println(tasks);
        Collections.sort(tasks);
        System.out.println(tasks);
    }
}

interface Complexity {
public void setComplexity(int complexity);
public int getComplexity();
}

interface Priority {
    public void setPriority(int priority);
    public int getPriority();
}

class Task implements Comparable<Task>, Complexity, Priority {
    private String task;
    private int priority, complexity;
    
    //Priority: 1-10, 1 is highest priority
    //Complexity: 1-10, 10 is highest complexity
    public Task(String task, int priority, int complexity){
        this.task = task;
        this.priority = priority;
        this.complexity = complexity;
    }
    
    
    
    public void setTask(String task){
        this.task = task;
    }
    
    public String getTask(){
        return task;
    }
    
    @Override
    public void setComplexity(int complexity){
        this.complexity = complexity;
    }
    
    @Override
    public int getComplexity(){
        return complexity;
    }
    
    @Override
    public void setPriority(int priority){
        this.priority = priority;
    }
    
    @Override
    public int getPriority(){
        return priority;
    }
    
    @Override
    public int compareTo(Task otherTask) {
        if(this.priority != otherTask.getPriority()){
            return Integer.compare(this.priority, otherTask.getPriority());
        }else{
            return Integer.compare(this.complexity, otherTask.getComplexity());
        }
    }
    
    @Override
    public String toString() {
        String myString = task + " (Priority: " + priority + 
                ", Complexity: " + complexity + ")";
        return myString;
    }
}