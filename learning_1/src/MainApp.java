import processing.core.PApplet;

public class MainApp extends PApplet {
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }

    public void settings(){
        size(1000, 800);
    }

    public void setup(){
        background(255); // set background to white
        stroke(0, 255, 0); // setting outline color
        fill(0, 0, 255); // setting interior color
    }

    public void draw(){
        line(0, 0, width / 2, height / 2);
        rect(width / 2, height / 2, 100, 200);
        rectMode(CENTER);
        rect(width / 2, height / 2, 500, 500);

        ellipseMode(CENTER);
        ellipse(width / 2, height / 2, 600, 600);

        ellipseMode(CORNER);
        ellipse(width / 2, height / 2, 600, 600);
    }
}
