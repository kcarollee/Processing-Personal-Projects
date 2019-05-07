import processing.core.PApplet;

public class MainApp extends PApplet {
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }
    Circle[] c = new Circle[5];

    public void settings(){
        size(1000, 800);
        c = new Circle[5];
        for (int i = 0; i < 5; i++){
            c[i] = new Circle(this);
        }
    }

    public void setup(){

        for (int i = 0; i < 5; i++){
            c[i].setup(random(5, width), random(5, height), random(6, 50));
        }
    }

    public void draw(){
        background(100); // leaves trailing circles if omitted.
        for (int i = 0; i < 5; i++){
            c[i].show();
            c[i].move();
            c[i].collisionCheck();
        }
    }
}
