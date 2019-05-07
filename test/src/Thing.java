import processing.core.PApplet;
public class Thing {
    PApplet p;
    public Thing(PApplet p){
        this.p = p;
    }

    void doSomething(){
        p.stroke(0);
        p.fill(255, 255, 0);
        p.rect(p.width/3, p.height/3, 100, 50);
    }

}
