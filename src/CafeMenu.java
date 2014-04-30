/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author pieter.mels
 */
public class CafeMenu implements Menu {
    
    Hashtable menuItems = new Hashtable();
    
    public CafeMenu() {
        addItem("Veggie burger en vetloze friet", "Veggie burger op een volkoren broodje, sla, tomaat en friet", true, 3.99);
        addItem("Soep van de dag", "Eeen kop soep van de dag met een salade", false, 3.69);
        addItem("Burrito", "Een grote burrito met hele pintobonen, salsa, gucamole", true, 4.29);
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }
    
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
    
}
