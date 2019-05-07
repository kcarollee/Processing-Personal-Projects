import processing.core.PApplet;

public class Ellipse {
    PApplet p;
    public Ellipse(PApplet p){
        this.p = p;
    }

    float centerX;
    float centerY;
    float radX;
    float radY;

    public void setup(float x, float y, float a, float b){
        centerX = x;
        centerY = y;
        radX = a;
        radY = b;
    }

    public void change(float p, float q){
        radX += p / 1000;
        radY += q / 1000;
    }

    public void draw(){
        p.ellipse(centerX, centerY, radX, radY);
    }

}
