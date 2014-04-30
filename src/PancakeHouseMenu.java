/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author pieter.mels
 */
public class PancakeHouseMenu implements Menu {
    
    ArrayList menuItems;
    
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's pannenkoekenontbijt", "Pannenkoek met roerei en toast", true, 2.99);
        addItem("Normaal pannenkoekenontbijt", "Pannenkoek met gebakken ei, worstje", false, 2.99);
        addItem("Pannenkoek met bosbessen", "Pannenkoek met verse bosbessen", true, 3.49);
        addItem("Wafels", "Wafels met naar keuze bosbessen of aardbeien", true, 3.59);
        
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    
    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
    
}
