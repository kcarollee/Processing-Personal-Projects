import processing.core.PApplet;

public class Circle {
    PApplet p;
    float xpos;
    float ypos;
    float radius;
    float velx;
    float vely;

    public Circle(PApplet p){
        this.p = p;

        velx = p.random(-30, 30);
        vely = p.random(-30, -30);
    }

    public void setup(float x, float y, float r){
        xpos = x;
        ypos = y;
        radius = r;
    }

    public void move(){
        xpos += velx;
        ypos += vely;
    }

    public void show(){
        p.stroke(255);
        p.fill(p.random(255), p.random(255), p.random(255));
        p.circle(xpos, ypos, radius);

    }

    public void collisionCheck(){
        if (xpos - radius < 0 || xpos + radius > p.width){
            velx *= -1;
        }

        if (ypos - radius < 0 || ypos + radius > p.height){
            vely *= -1;
        }
    }
}
