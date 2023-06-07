package oop.List;

import java.util.List;

public class ItemService implements ItemInterface {
    private List<Item> shoppingCart;

    public ItemService(List<Item> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String addItem(Item item) {
        boolean exist= shoppingCart.stream().anyMatch(x->x.equals(item));
        if(exist){
            return "Already exists!";
        }else {
            shoppingCart.add(item);
            System.out.println(shoppingCart);
        }

        return "Successfully added!";
    }

    @Override
    public String remove(Item item) {
        for (Item i : shoppingCart) {
            if (i.equals(item)) {
                shoppingCart.remove(i);
                return "Successfully deleted!";
            }
        }
        return "There is no such an employee!";
}

    @Override
    public Item updateQuantityByName(String name, int newQuantity) {
        for (Item item: shoppingCart) {
            if(item.getName().equalsIgnoreCase(name)){
                item.setQuantity(newQuantity);
                System.out.println("Updated!");
                return item;
            }
        }
        return null;
    }

    @Override
    public long sumOfAllItems() {
        long sum=0;
        int c;
        for (Item item: shoppingCart) {
           c= item.getQuantity();
           sum+= (long) c *item.getPrice();
        }
        System.out.println("Sum of All Items: ");
        return sum;
    }
}
