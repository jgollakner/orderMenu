package edu.wctc.distjava.ch3.model;

import java.util.*;

/**
 *
 * @author JoeGollakner
 */
public class menuItems {

    public List getItems(String menuItems) {
        List items = new ArrayList();

        if (menuItems.equals("Steak")) {
            items.add("Porter House");
            items.add("New York Strip");

        } else if (menuItems.equals("Chicken")) {
            items.add("Chicken Marsala");
            items.add("Chicken Fajitas");

        } else if (menuItems.equals("Alcohol")) {
            items.add("Beer");
            items.add("Whiskey");
            items.add("Wine");
            items.add("Gin");

        } else {
            items.add("Chocolate Lava Cake");
            items.add("Ice Cream");
        }

        return items;
    }
}
