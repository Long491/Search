/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Library;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> mChosse;
    Library l = new Library();

    public Menu() {
        mChosse = new ArrayList<>();
    }

    public Menu(String td, String[] mc) {
        title = td;
        mChosse = new ArrayList<>();
        for (String s : mc) {
            mChosse.add((T) s);
        }
    }

    //-------------------------------------------
    public void display() {
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < mChosse.size(); i++) {
            System.out.println((i + 1) + "." + mChosse.get(i));
        }
        System.out.println("--------------------------------");
    }
//-------------------------------------------

    public int getSelected() {
        display();
        return l.getNumber("Enter your choice", 1, mChosse.size() + 1);
    }
//-------------------------------------------

    public abstract void execute(int n);
//-------------------------------------------

    public void run() {
        while (true) {
            int n = getSelected();
            execute(n);
            if (n > mChosse.size()) {
                break;
            }
        }
    }

}
