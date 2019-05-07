import processing.core.PApplet;
import java.util.ArrayList;

public class MainApp extends PApplet{
    ShapeM m = new ShapeM(this);
    ShapeU u = new ShapeU(this);
    ShapeS s = new ShapeS(this);
    ShapeE e = new ShapeE(this);

    ShapeM m1 = new ShapeM(this);
    ShapeU u1 = new ShapeU(this);
    ShapeS s1 = new ShapeS(this);
    ShapeE e1 = new ShapeE(this);

    float w = width * 1.5f;
    float h = width * 1.5f;

    ArrayList<Shape> shapeArrayHorizontal = new ArrayList<Shape>();
    ArrayList<Shape> shapeArrayVertical = new ArrayList<Shape>();
    //boolean mflag = false;
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }
    public void settings(){
        size(630, 891);
    }
    public void setup(){
        System.out.println(width);
        background(153, 153, 255);
        m.setup(0, 0, w, h);
        u.setup(width / 4, width / 4, w, h);
        s.setup(width / 2, width / 2, w, h);
        e.setup(3 * width / 4, width * 3 / 4, w, h);

        m1.setup(0, 0, w, h);
        u1.setup(width / 4, width / 4, w, h);
        s1.setup(width / 2, width / 2, w, h);
        e1.setup(3 * width / 4, width * 3 / 4, w, h);

        shapeArrayVertical.add(m);
        shapeArrayVertical.add(u);
        shapeArrayVertical.add(s);
        shapeArrayVertical.add(e);

        shapeArrayHorizontal.add(m1);
        shapeArrayHorizontal.add(u1);
        shapeArrayHorizontal.add(s1);
        shapeArrayHorizontal.add(e1);
    }

    public void draw(){
        //background(200);
        noFill();
        strokeWeight(5);

        for (Shape shape : shapeArrayVertical){
            if (shape.isOutofBounds(shape.vertexList)) shape.moveVertical(0);
            else shape.moveVertical(40);
            shape.draw();
        }
        fill(60);
        for (Shape shape : shapeArrayHorizontal){
            if (shape.isOutofBounds(shape.vertexList)) shape.moveHorizontal(0);
            else shape.moveHorizontal(40);
            shape.draw();
        }

        e.draw();

        fill(2);
    }

    public void keyPressed(){
        switch (key){
            case 's':
                saveFrame("poster_####.png");
                break;
        }
    }
}
