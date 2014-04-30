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
public class DinerMenuIterator implements Iterator {
    
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }
    
    @Override
    public Object next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }
    
    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    
    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Je kunt geen item verwijderen. Ten minste eenmaal next() aanroepen.");
        }
        if (list[position-1] != null) {
            for (int i = position - 1; i < (list.length-1); i++) {
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
        }
    }
    
}
