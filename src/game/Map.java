package game;

public class Map {

    private Room startRoom;

    public void buildMap() {

        //create room1
        Room room1 = new Room("Outside", "forrest outside a cave - the cave-entrance splits in two different directions.");
        room1.addItem("an old rusty flashlight");
        room1.addItem("a crinkly paper map with a big X in the middle", "map");

        //Create room2
        Room room2 = new Room("Narrow cave", "narrow cave that seems to bend up and down almost infinitely");

        //Create room3
        Room room3 = new Room("Large grotto", "large grotto with an opening very far above where sunlight shines through.");
        room3.addItem("a wicker bird cage");

        //Create room4
        Room room4 = new Room("Wet cave", "large dark cave - the floor is quite wet and slippery here.");

        Room room5 = new Room("Treasure cave", "small dark cave with apparently only a single opening");

        Room room6 = new Room("Crystal cave","a medium sized cave, filled with sparkling purple crystals");

        Room room7 = new Room("Lush cave", "large lushy cave, filled with glowing mossy stones, with lots of unique fauna and flora ");

        Room room8 = new Room("Mellon cave", "small stony path next to the dark lake. A small door seems to be carved into the rock-face");

        Room room9 = new Room("Skeleton cave","a large, dark cave, filled with skeletons on the ground, somewhere piled up almost as high as the ceiling");

        // Connect rooms
        room1.setEastRoom(room2); //Then this should automatically do a room2.setWestRoom(room1); inside the setEastRoom method.
        room1.setSouthRoom(room4);
        room2.setEastRoom(room3);
        room3.setSouthRoom(room6);
        room4.setSouthRoom(room7);
        room5.setSouthRoom(room8);
        room6.setSouthRoom(room9);
        room7.setEastRoom(room8);
        room8.setEastRoom(room9);

        //Setting the starting room to room1
        this.startRoom = room1;

    }

    public Room getStartRoom() {
        return startRoom;
    }
}
