package com.stack.usingPredefined;

import java.util.Objects;
import java.util.Stack;

/**
 * java util stack
 * *****************
 * Serializable: It is a marker interface that classes must implement if they are to be serialized and deserialized.
 * Cloneable: This is an interface in Java which needs to be implemented by a class to allow its objects to be cloned.
 * Iterable<E>: This interface represents a collection of objects which is iterable — meaning which can be iterated.
 * Collection<E>: A Collection represents a group of objects known as its elements. The Collection interface is used to pass around collections of objects where maximum generality is desired.
 * List<E>: The List interface provides a way to store the ordered collection. It is a child interface of Collection.
 * RandomAccess: This is a marker interface used by List implementations to indicate that they support fast (generally constant time) random access.
 *
 *
 * NOTE
 * *****************
 * Search always return position
 * position for top is 1
 *
 */
public class Predefined {

    public static void main(String[] args) {
        //test1Integer();
        //test2String()
        //test3Student();
        //test4SortedInsert();
        //test5SortingAscNDesc();
        //test6BottomInsert();
        test7Reverse();
    }






    public static void test1Integer(){
        Stack<Integer> st = new Stack<Integer>();
        System.out.println(st.empty());
        System.out.println(st);
        st.push(111);
        st.push(222);
        st.push(333);
        st.push(444);
        st.push(555);
        System.out.println(st);
        System.out.println("Peek :" +st.peek());
        System.out.println("Pop :" +st.pop());
        System.out.println(st); //[111,222,333,444] [....top]
        System.out.println("Search 111:" +st.search(111));  //4
        System.out.println("Search 222:" +st.search(222));  //3
        System.out.println("Search 333:" +st.search(333));  //2
        System.out.println("Search 444:" +st.search(444));  //1
        System.out.println("Search 555:" +st.search(555));  //-1
    }



    public static void test2String(){
        Stack<String> st = new Stack<String>();
        System.out.println(st.empty());
        System.out.println(st);
        st.push("AAA");
        st.push("BBB");
        st.push("CCC");
        st.push("DDD");
        st.push("EEE");
        System.out.println(st);
        System.out.println("Peek :" +st.peek());
        System.out.println("Pop :" +st.pop());
        System.out.println(st); //[111,222,333,444] [....top]
        System.out.println("Search AAA:" +st.search("AAA"));  //4
        System.out.println("Search BBB:" +st.search("BBB"));  //3
        System.out.println("Search CCC:" +st.search("CCC"));  //2
        System.out.println("Search DDD:" +st.search("DDD"));  //1
        System.out.println("Search EEE:" +st.search("EEE"));  //-1
    }



    public static void test3Student(){
        Stack<Student> st = new Stack<Student>();
        System.out.println(st.empty());
        System.out.println(st);
        Student s1 = new Student(1, "Ann");
        Student s2 = new Student(2, "John");
        Student s3 = new Student(3, "Sam");
        Student s4 = new Student(4, "Alice");
        Student s5 = new Student(5, "Mark");


        st.push(s1);
        st.push(s2);
        st.push(s3);
        st.push(s4);
        st.push(s5);
        System.out.println(st);
        System.out.println("Peek :" +st.peek());
        System.out.println("Pop :" +st.pop());
        System.out.println(st); //[555,444,333,222] ....top
        System.out.println("Search Sam:" +st.search(new Student(3, "Sam")));  //4
        System.out.println("Search Peter:" +st.search(new Student( 4, "Peter")));  //-1
    }

    private static void test4SortedInsert() {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println(st.empty());
        System.out.println(st);
        st.push(111);
        st.push(222);
        st.push(444);
        st.push(555);
        System.out.println(st);
        StackUtils.sortedInsertAsc(st, 333);
        System.out.println(st);
    }


    private static void test5SortingAscNDesc() {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println(st.empty());
        System.out.println(st);
        st.push(1);
        st.push(7);
        st.push(3);
        st.push(4);
        st.push(2);
        st.push(5);
        st.push(6);
        System.out.println(st);
        StackUtils.sortingStackAsc(st);
        System.out.println(st);
        StackUtils.sortingStackDesc(st);
        System.out.println(st);
    }


    private static void test6BottomInsert() {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println(st.empty());
        System.out.println(st);
        st.push(1);
        st.push(7);
        st.push(3);
        st.push(4);
        st.push(2);
        st.push(5);
        st.push(6);
        System.out.println(st);
        StackUtils.insertAtBottom(st, 9);
        System.out.println(st);
    }


    private static void test7Reverse() {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println(st.empty());
        System.out.println(st);
        st.push(1);
        st.push(7);
        st.push(3);
        st.push(4);
        st.push(2);
        st.push(5);
        st.push(6);
        System.out.println(st);
        StackUtils.reverse(st);
        System.out.println(st);
    }



    static class Student{
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
