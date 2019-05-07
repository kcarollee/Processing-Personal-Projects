import processing.core.PApplet;
import processing.core.PImage;

public class MainApp extends PApplet{
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }
    PImage img;
    public void settings(){
        size(500, 500);
    }

    public void setup(){
        img = loadImage("test2.png");
        background(img);
    }

    public void draw(){

        tint(255);
        image(img, 0, 0);
    }
}
