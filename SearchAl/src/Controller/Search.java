/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Search extends Menu<String> {

    static String[] mc = {"Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public Search(Element element) {
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSizeArray();
        array = element.getArray();
    }

    public void execute(int s) {
        switch (s) {
            case 1:
                search();
                break;
            case 2:
                System.exit(0);
        }
    }

    public void search() {
        final String[] mcSearch = {"Binary search", "Linear search", "Exit"};
        class SearchMenu extends Menu<String> {

            public SearchMenu() {
                super("Search Option", mcSearch);
            }

            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        Scanner sc = new Scanner(System.in);
                        library.display(array);
                        System.out.println("Enter number to find:");
                        System.out.println("\nBinary Search: ");
                        library.display(array);
                        algorithm.buddleSort(array);
                        System.out.println("\nSorted array by Buddle Sort: ");
                        library.display(array);
                        int x = sc.nextInt();
                        System.out.println("Index number to find:");
                        System.out.println(algorithm.binarySearch(array, x, 0, array.length));
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println(" List array:");
                        library.display(array);
                        Scanner s = new Scanner(System.in);
                        int y = s.nextInt();
                        System.out.println("\nFind index by linearSearch: " + algorithm.linearSearch(array, y));
                        break;
                    case 3:
                        System.out.println("Exitting");
                        System.exit(0);
                        break;
                }
            }
        }
    }
}
