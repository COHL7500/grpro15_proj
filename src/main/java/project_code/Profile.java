package project_code;

import javafx.scene.paint.Color;

import java.util.ArrayList;

class Profile {

    private int age;
    private Color color;
    private String name;
    ArrayList<Video> videoList = new ArrayList<>();

    //TODO:
    // - Read all user data from a file
    // - Load color from file path
    // - Add and remove from list

    public Profile(int age, Color color, String name)
    {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    int getAge() {return age;}
    Color getColor() {return color;}
    String getName() {return name;}

}
