package game;

import java.util.ArrayList;

public class Room {
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;

    private String name;
    private String description;
    private ArrayList<Item> items;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    // Convenience methods for creating and adding Item
    public void addItem(String description) {
        this.addItem(new Item(description));
    }

    // Convenience methods for creating and adding Item with custom short name
    public void addItem(String description, String name) {
        this.addItem(new Item(description, name));
    }

    public Room getNorthRoom() {
        return null; //TODO
    }

    public void setNorthRoom(Room northRoom) {
       

        //TODO
       //When setNorthRoom is set, call setSouthRoom on the other room here, so that it automatically sets both rooms together.
    }

    public Room getEastRoom() {
        return null; //TODO
    }

    public void setEastRoom(Room eastRoom) {
        //TODO
    }

    public Room getSouthRoom() {
        return null; //TODO
    }

    public void setSouthRoom(Room southRoom) {
       //TODO
    }

    public Room getWestRoom() {
        return null; //TODO
    }

    public void setWestRoom(Room westRoom) {
        //TODO
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Item removeItem(String itemName) {
        Item itemToBeRemoved = findItem(itemName);
        if (itemToBeRemoved != null) {
            //TODO
        }
        return itemToBeRemoved;
    }

    public Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                //TODO
            }
        }
        return null;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
