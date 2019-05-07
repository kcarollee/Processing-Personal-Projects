import processing.core.PApplet;

public class MainApp extends PApplet {
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }

    Ellipse e = new Ellipse(this);

    public void settings(){
        size(1000, 700);
    }

    public void setup(){
        e.setup(width / 2, height / 2, 3, 3);
    }

    public void draw(){
        if(mousePressed){
            fill(0);
        }
        else
            fill(255);
        e.draw();
        e.change(mouseX, mouseY);
    }
}
