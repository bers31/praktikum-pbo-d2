/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maptest;

/**
 *
 * @author ACER Aspire5
 */
import java.util.*;
public class MapTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer,String>();
        map.put(1, "satu");
        map.put(2, "dua");
        System.out.println(map.get(1));
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println("Key: " + key);
        }
    }
}
