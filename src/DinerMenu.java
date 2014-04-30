/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Iterator;
/**
 *
 * @author pieter.mels
 */
public class DinerMenu implements Menu {
    
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarische BLT", "Vegetarische bacon met sla & tomaat op volkoren", true, 2.99);
        addItem("BLT", "Bacon met sla & tomaat op volkoren", false, 2.99);
        addItem("Soep van de dag", "Soep van de dag met aardappelsalade", false, 3.29);
        addItem("Hotdag", "Een hot dog, met zuurkool, saus, uien en bedekt met kaas", false, 3.05);        
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is vol! Kan geen gerechten toevoegen.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    
    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    
}
