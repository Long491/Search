/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Library;
import Controller.Search;
import Model.Element;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setSizeArray(library.getNumber("Enter number of array", 1, 100));
        element.setArray(library.createArray(element.getSizeArray()));
        new Search(element).run();
    }
}
