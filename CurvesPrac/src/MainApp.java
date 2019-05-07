import processing.core.PApplet;

public class MainApp extends PApplet {
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }
    float bgColor;
    Curve c = new Curve(this);
    public void settings(){
        size(500, 500);

    }

    public void setup(){
        bgColor = 100;
        c.setup(30, 30, 100, 100, 200, 200, 60, 60);


    }

    public void draw(){
        background(bgColor);
        c.show();
        c.update();
        c.move();
    }
}
