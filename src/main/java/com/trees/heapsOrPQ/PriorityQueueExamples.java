package com.trees.heapsOrPQ;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExamples {
    public static void main(String[] args) {
        //PQ_Integers();
        //PQ_Strings();
        //PQ_Students();
    }

    public static void PQ_Integers() {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        /**
         * default is increasing
         * to make it decreasing
         * PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
         */
        pq1.add(30);
        pq1.add(10);
        pq1.add(20);
        pq1.add(50);
        pq1.add(40);
        System.out.println(pq1);
        while(!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }




    public static void PQ_Strings() {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        /**
         * default is increasing
         * to make it decreasing
         * PriorityQueue<String> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
         */
        pq1.add("CSK");
        pq1.add("DC");
        pq1.add("GT");
        pq1.add("MI");
        pq1.add("SRH");
        pq1.add("PK11");
        pq1.add("RCB");
        System.out.println(pq1);
        while(!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }



    public static void PQ_Students() {
        Comparator comparatorBasedOnHallTicketInc= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               return  o1.htno- o2.htno;
            }
        };

        Comparator comparatorBasedOnHallTicketDesc= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o1.htno- o2.htno;
            }
        };

        Comparator comparatorBasedOnRankInc= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o1.rank- o2.rank;
            }
        };
        Comparator comparatorBasedOnRankDesc= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o2.rank- o1.rank;
            }
        };


        Comparator comparatorBasedOnNameInc= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o1.name.compareTo(o2.name);
            }
        };


        Comparator comparatorBasedOnNameDesc= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o2.name.compareTo(o1.name);
            }
        };

        Comparator comparatorBasedOnPercentInc= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double val = (o1.percent-o2.percent);
                return (int) val;
            }
        };

        Comparator comparatorBasedOnPercentDesc= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double val = (o2.percent-o1.percent);
                return (int) val;
            }
        };
        PriorityQueue<Student> pq1 = new PriorityQueue<>(comparatorBasedOnPercentDesc);
        /**
         * default is increasing
         * to make it decreasing
         * PriorityQueue<String> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
         */
        pq1.add(new Student(101, 3, "ABC1" , 70.05));
        pq1.add(new Student(110, 5, "ABC2" , 80.05));
        pq1.add(new Student(100, 1, "ABC3" , 65.05));
        pq1.add(new Student(120, 4, "ABC4" , 55.05));
        pq1.add(new Student(123, 7, "ABC5" , 67.05));

        System.out.println(pq1);
        while(!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }


    private static class Student{
        int htno;
        int rank;
        String name;
        double percent;

        public Student(int htno, int rank, String name, double percent) {
            this.htno = htno;
            this.rank = rank;
            this.name = name;
            this.percent = percent;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "htno=" + htno +
                    ", rank=" + rank +
                    ", name='" + name + '\'' +
                    ", percent=" + percent +
                    '}';
        }
    }
}
