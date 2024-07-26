package Task4;

import java.util.Map;
import java.util.TreeMap;

public class Hashmap {

    Map<String,Integer> map= new TreeMap<>();

    public void addStudent(String name, int grade){
        map.put(name,grade);
    }

    public void removeStudent(String name){
        map.remove(name);
    }

    public void displayStudent(){

        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey() + "--"+ m.getValue());
        }
    }

    public static void main(String[] args) {

        Hashmap hm=new Hashmap();
        hm.addStudent("Sabarirajan",44);
        hm.addStudent("Dravid",55);
        hm.addStudent("Thomas",78);
        hm.addStudent("Guru",87);
        hm.addStudent("Billa",34);
        hm.displayStudent();
        System.out.println("***************POST REMOVE*******************");
        hm.removeStudent("Dravid");
        hm.displayStudent();

    }
}
