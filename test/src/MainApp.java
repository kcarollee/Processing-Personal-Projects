import processing.core.PApplet;

public class MainApp extends PApplet {
    public static void main (String[] args){
        PApplet.main("MainApp", args);
    }

    Thing myThing;

    public void settings(){
        size(800, 600);

    }

    public void setup(){
        background(255);
        myThing = new Thing(this);
    }

    public void draw(){
        myThing.doSomething();
    }
}
