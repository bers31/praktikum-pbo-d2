/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylisttest;

/**
 *
 * @author ACER Aspire5
 */

import java.util.ArrayList;
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> Strings = new ArrayList<String>();
        Strings.add("praktikum");
        Strings.add("collection");
        Strings.add("dan generic");
        Strings.remove("praktikum");
        for (String s : Strings){
            System.out.print(s+" ");
        }
    }
}
