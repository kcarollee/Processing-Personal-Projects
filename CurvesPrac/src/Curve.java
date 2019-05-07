import processing.core.PApplet;
import processing.core.PVector;

public class Curve  {
    PApplet p;
    PVector pos1, pos2, pos3, pos4;
    PVector vel1, vel2, vel3, vel4;

    public Curve(PApplet p){
        this.p = p;

        pos1 = new PVector(0, 0);
        pos2 = new PVector(0, 0);
        pos3 = new PVector(0, 0);
        pos4 = new PVector(0, 0);
    }

    public void setup(float x1, float y1, float x2, float y2,
                      float x3, float y3, float x4, float y4){
        this.pos1.x = x1;
        this.pos1.y = y1;
        this.pos2.x = x2;
        this.pos2.y = y2;
        this.pos3.x = x3;
        this.pos3.y = y3;
        this.pos4.x = x4;
        this.pos4.y = y4;

        vel1 = new PVector(0, 0);
        vel2 = new PVector(0, 0);
        vel3 = new PVector(0, 0);
        vel4 = new PVector(0, 0);
    }

    public void show(){
        p.noStroke();
        p.fill(255);
        p.circle(pos1.x, pos1.y , 3);

        p.fill(0, 0, 255);
        p.circle(pos2.x, pos2.y,  3);
        p.circle(pos3.x, pos3.y, 3);


        p.fill(255);
        p.circle(pos4.x, pos4.y, 3);

        p.smooth();
        p.stroke(0);
        p.curve(pos1.x, pos1.y, pos2.x, pos2.y, pos3.x, pos3.y, pos4.x, pos4.y);
    }

    public void update(){
        if (inPoint() == 1 && p.mousePressed){
            pos1.set(p.mouseX, p.mouseY);
        }

        else if(inPoint() == 2 && p.mousePressed){
            pos2.set(p.mouseX, p.mouseY);
        }

        else if(inPoint() == 3 && p.mousePressed){
            pos3.set(p.mouseX, p.mouseY);
        }

        else if(inPoint() == 4 && p.mousePressed){
            pos4.set(p.mouseX, p.mouseY);
        }

        if (keyPressed() == 1){
            vel1.set(p.random(0, 30),p.random(0, 30) );
            vel2.set(p.random(0, 30),p.random(0, 30) );
            vel3.set(p.random(0, 30),p.random(0, 30) );
            vel4.set(p.random(0, 30),p.random(0, 30) );

        }

        else if (keyPressed() == 2){
            vel1.set(0, 0);
            vel2.set(0, 0);
            vel3.set(0, 0);
            vel4.set(0, 0);

        }
    }

    public void move(){
        boundaryCheck();
        pos1.add(vel1);
        pos2.add(vel2);
        pos3.add(vel3);
        pos4.add(vel4);
    }

    private void boundaryCheck(){
        if (pos1.x < 3 || pos1.x + 3 > p.width){
            vel1.x *= -1;
        }
        if (pos1.y < 3 || pos1.y + 3 > p.height){
            vel1.y *= -1;
        }
        if (pos2.x < 3 || pos2.x + 3 > p.width){
            vel2.x *= -1;
        }
        if (pos2.y < 3 || pos2.y + 3 > p.height){
            vel2.y *= -1;
        }
        if (pos3.x < 3 || pos3.x + 3 > p.width){
            vel3.x *= -1;
        }
        if (pos3.y < 3 || pos3.y + 3 > p.height){
            vel3.y *= -1;
        }
        if (pos4.x < 3 || pos4.x + 3 > p.width){
            vel4.x *= -1;
        }
        if (pos4.y < 3 || pos4.y + 3 > p.height){
            vel4.y *= -1;
        }
    }
    private int inPoint(){
        if (p.dist(pos1.x, pos1.y, p.mouseX, p.mouseY) <= 10){
            return 1;
        }
        if (p.dist(pos2.x, pos2.y, p.mouseX, p.mouseY) <= 10){
            return 2;
        }
        if (p.dist(pos3.x, pos3.y, p.mouseX, p.mouseY) <= 10){
            return 3;
        }
        if (p.dist(pos4.x, pos4.y, p.mouseX, p.mouseY) <= 10){
            return 4;
        }
        return 0;
    }

    private int keyPressed(){
        if(p.keyPressed){
            if (p.key == 'm'){
                return 1;
            }
            else if (p.key == 's'){
                return 2;
            }
        }

        return 0;
    }


}
