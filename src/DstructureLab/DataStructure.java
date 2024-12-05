/*
What is the purpose of generics in Java: to allow a type or method to operate on objects of various types while providing compile-time safety
How can generics be used in Java programming: So that an operation can take in whatever type of input that was given.
What are the pros and cons of using generics: Pros: The function can take in any variable type input. Cons: Inevitably someone will input a variable value that doesnt work with the function, like trying to divide HAMBURGER by 13.
*/
package DstructureLab;

import java.util.*;

public class DataStructure <T>{

    private ArrayList<T> studentList = new ArrayList<>();

    private  T[] ageList;
    private int ageIndex = 0;
    final private int SIZES =100;

    public  DataStructure(){
        ageList = (T[]) new Object[SIZES];
        ageIndex = 0;
    }

    private HashMap<T, T> majorGpaMap = new HashMap<>();
    private LinkedList<T> nationalityList = new LinkedList<>();
    private Stack<T> hometownStack = new Stack<>();
    private Queue<T> homeStateQueue = new LinkedList<>();

    public void addAge(T age){
        if(ageIndex < ageList.length){
            ageList[ageIndex ++] = age;
        }
    }
    public void removeAge(){
        if(ageIndex > 0){
            ageList[-- ageIndex] = null;
        }
    }

    public void addStudent(T name) {
        studentList.add(name);
    }
    public void removeStudent(T name){
        studentList.remove(name);
    }

    public void addMandG(T major, T gpa){
        majorGpaMap.put(major, gpa);
    }
    public void removeMandG(T major, T gpa){
        majorGpaMap.remove(major, gpa);
    }

    public void addNation(T nat){
        nationalityList.add(nat);
    }
    public void removeNation(T nat){
        nationalityList.remove(nat);
    }

    public void addHometown(T town){
        hometownStack.push(town);
    }
    public void removeHometown(){
        hometownStack.pop();
    }

    public void addHomeState(T state){
        homeStateQueue.add(state);
    }
    public void removeHomeState(T state){
        homeStateQueue.remove(state);
    }

    public void printArrayItems(){
        System.out.println("Ages:");
        for (int i = 0; i < ageList.length; i++){
            if (ageList[i] != null) {
                System.out.println(ageList[i]);
            }
        }
        System.out.println("Students:");
        System.out.println(studentList);
        System.out.println("Majors and GPAs:");
        System.out.println(majorGpaMap);
        System.out.println("Nationalities:");
        System.out.println(nationalityList);
        System.out.println("Hometowns: ");
        System.out.println(hometownStack);
        System.out.println("Home States: ");
        System.out.println(homeStateQueue);

    }
}