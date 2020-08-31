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
public class MyList {

    Object[] myList = new Object[0];

    public MyList() {
        super();
    }

    public int size() {
        return myList.length;
    }

    public Object get(int index) {
        if (myList[index] != null) {
            return myList[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void set(int index, Object o) {
        if (myList[index] != null) {
            myList[index] = o;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void add(Object o) {
        Object[] newMyList = new Object[myList.length + 1];
        System.arraycopy(myList, 0, newMyList, 0, myList.length);
        newMyList[newMyList.length - 1] = o;
        myList = newMyList;
    }

    public void remove(int index) {
        if (myList[index] != null) {
            Object[] newMyList = new Object[myList.length - 1];
            for (int i = 0; i < newMyList.length; i++) {
                if (i < index) {
                    newMyList[i] = myList[i];
                } else if (i >= index) {
                    newMyList[i] = myList[i + 1];
                }
            }
            myList = newMyList;

        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void insert(int index, Object o) {
        if (myList[index] != null) {
            Object[] newMyList = new Object[myList.length + 1];
            for (int i = 0; i < newMyList.length; i++) {
                if (i < index) {
                    newMyList[i] = myList[i];
                } else if (i == index) {
                    newMyList[i] = o;
                } else if (i > index) {
                    newMyList[i] = myList[i - 1];
                }
            }
            myList = newMyList;

        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String toString() {
        String s = "";
        if (myList.length == 0) {
            return "{}";
        } else if (myList.length == 1) {
            return "{0: " + myList[0].toString() + "}";
        } else {
            for (int i=0; i<myList.length; i++) {
                if (i == 0) {
                    s += "{"+i+": "+ myList[i].toString()+";";
                } else if (i != myList.length -1) {
                    s += " "+i+": "+ myList[i].toString()+";";
                } else {
                    s += " "+i+": "+ myList[i].toString()+"}";
                }
            } return s;
        }
    }

}
