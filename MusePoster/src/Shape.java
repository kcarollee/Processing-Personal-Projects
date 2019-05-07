import processing.core.PApplet;
import processing.core.PVector;
import java.util.ArrayList;

abstract public class Shape {
    PApplet p;
    int vertexNum = 0;
    PVector originalPos;
    boolean fillFlag = false;
    ArrayList<PVector> vertexList = new ArrayList<PVector>();
    public Shape(){ }

    public void addVertex(PVector vertex){
        vertexList.add(vertex);
        vertexNum++;
        if (vertexNum == 1){
            originalPos = vertexList.get(0);
        }
    }

    public void moveVertical(float speed){
        for (PVector v : vertexList){
            v.y += speed;
        }
    }

    public void moveHorizontal(float speed){
        for (PVector v : vertexList){
            v.x += speed;
        }
    }

    public boolean isOutofBounds(ArrayList<PVector> vertexList){
        for (PVector v : vertexList){
            if (v.y >= p.height || v.y < 0 || v.x >= p.width || v.x < 0){
                return true;
            }
        }
        return false;
    }

    public void draw(){
        p.beginShape();
        fillColor();
        for (PVector v : vertexList){
            p.vertex(v.x, v.y);
        }
        p.endShape(p.CLOSE);
    }
    abstract public void setup(float originalX, float originalY, float w, float h);
    abstract public void fillColor();
}

class ShapeM extends Shape{
    public ShapeM(PApplet p){
        super.p = p;
    }

    public void setup(float originalX, float originalY, float w, float h){
        addVertex(new PVector(originalX, originalY));
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y ));
        addVertex(new PVector(originalPos.x + w / 2, originalPos.y + w / 2));
        addVertex(new PVector(originalPos.x + w * 3 / 4, originalPos.y ));
        addVertex(new PVector(originalPos.x + w, originalPos.y ));
        addVertex(new PVector(originalPos.x + w, originalPos.y + h));
        addVertex(new PVector(originalPos.x + w * 3 / 4, originalPos.y + h));
        addVertex(new PVector(originalPos.x + w * 3 / 4, originalPos.y + h / 4));
        addVertex(new PVector(originalPos.x + w / 2, originalPos.y + h * 3 / 4));
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y + h / 4));
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y + h));
        addVertex(new PVector(originalPos.x , originalPos.y + h));
    }

    public void fillColor(){
        p.fill(51, 51, 255);
    }
}

class ShapeU extends Shape{
    public ShapeU(PApplet p){
        super.p = p;
    }

    public void setup(float originalX, float originalY, float w, float h){
        addVertex(new PVector(originalX, originalY));
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y ));
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y + w * 3 / 4));
        addVertex(new PVector(originalPos.x + w * 3 / 4, originalPos.y + w * 3 / 4));
        addVertex(new PVector(originalPos.x + w * 3 / 4, originalPos.y));
        addVertex(new PVector(originalPos.x + w, originalPos.y));
        addVertex(new PVector(originalPos.x + w, originalPos.y + h));
        addVertex(new PVector(originalPos.x, originalPos.y + h));
    }

    public void fillColor(){
        p.fill(51, 153, 255);
    }
}


class ShapeS extends Shape{
    public ShapeS(PApplet p){
        super.p = p;
    }

    public void addVertex(PVector vertex){
        vertexList.add(vertex);
    }

    public void setup(float originalX, float originalY, float w, float h){
        originalPos = new PVector(originalX, originalY);
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y));
        addVertex(new PVector(originalPos.x + w, originalPos.y));
        addVertex(new PVector(originalPos.x + w, originalPos.y + h / 4));
        addVertex(new PVector(originalPos.x + w / 2, originalPos.y + h / 4));
        addVertex(new PVector(originalPos.x + w, originalPos.y + 3 * h / 4));
        addVertex(new PVector(originalPos.x + w * 3 / 4, originalPos.y + h));
        addVertex(new PVector(originalPos.x , originalPos.y + h));
        addVertex(new PVector(originalPos.x, originalPos.y + h * 3 / 4));
        addVertex(new PVector(originalPos.x + w / 2, originalPos.y + 3 * h / 4));
        addVertex(new PVector(originalPos.x, originalPos.y + h / 4));
    }
    public void fillColor(){
        p.fill(51, 255, 255);
    }
}

class ShapeE extends Shape{
    public ShapeE(PApplet p){
        super.p = p;
    }
    public void setup(float originalX, float originalY, float w, float h){
        addVertex(new PVector(originalX, originalY));
        addVertex(new PVector(originalPos.x + w, originalPos.y));
        addVertex(new PVector(originalPos.x + w, originalPos.y + h / 4));
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y + h / 4));
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y + h * 3 / 8));
        addVertex(new PVector(originalPos.x + w, originalPos.y + h * 3 / 8));
        addVertex(new PVector(originalPos.x + w, originalPos.y + h * 5 / 8));
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y + h * 5 / 8));
        addVertex(new PVector(originalPos.x + w / 4, originalPos.y + h * 3 / 4));
        addVertex(new PVector(originalPos.x + w, originalPos.y + h * 3 / 4));
        addVertex(new PVector(originalPos.x + w, originalPos.y + h));
        addVertex(new PVector(originalPos.x, originalPos.y + h));
    }
    public void fillColor(){
        p.fill(51, 255, 153);
    }
}