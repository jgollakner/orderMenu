package edu.wctc.distjava.ch3.model;

import java.util.*;

/**
 *
 * @author JoeGollakner
 */
public class menuItems {

    public List getItems(String menuItem) {
        List foods = new ArrayList();

        if (menuItem.equals("Steak")) {
            foods.add("Steak");

        } else if (menuItem.equals("Chicken")) {
            foods.add("Chicken");

        } else if (menuItem.equals("Pork")) {
            foods.add("Pork");

        } else if (menuItem.equals("Wine")) {
            foods.add("Wine");

        } else if (menuItem.equals("Whiskey")) {
            foods.add("Whiskey");

        } else if (menuItem.equals("Soda")) {
            foods.add("Soda");

        } else if (menuItem.equals("Cake")) {
            foods.add("Cake");

        } else {
            foods.add("Pie");
        }
        return foods;
    }
}
