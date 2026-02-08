package Heaps;
import java.util.*;
public class ComparisonOfObjects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return  this.rank - s2.rank;
        }
    }
    public static void main(String [] args){
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Mukesh", 1));
        pq.add(new Student("Dinesh", 5));
        pq.add(new Student("Kamlesh", 2));
        pq.add(new Student("Nilesh", 8));
        pq.add(new Student("Suresh", 3));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" " + pq.peek().rank);
            pq.remove();
        }
    }
}
