/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkmylist;

/**
 *
 * @author Edgaras
 */
public class HomeworkMyList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList m = new MyList();
        System.out.println(m);

        Object o = new Object();
        m.add("Hello");
        System.out.println(m);
        m.add("it's");
        m.add("myList");
        m.add(1);
        m.set(3, 2020);
        m.add("years");
        m.remove(2);
        m.insert(2, "My List");
        m.insert(0, "Aloha");
        System.out.println(m);
    }

}
