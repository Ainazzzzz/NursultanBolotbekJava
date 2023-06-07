package oop.List;

public interface ItemInterface {
    String addItem(Item item);
    String remove(Item item);
   Item updateQuantityByName(String name,int newQuantity);
    long sumOfAllItems();

}
