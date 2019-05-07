
Ellipse e = new Ellipse();
void setup(){
 size(1000, 700); 
 e.setup(width /2, height / 2, 3, 3);
}

void draw(){
 if(mousePressed){
   fill(0);
 }
 else{
   fill(255); 
 }
 e.draw();
 e.change(mouseX, mouseY);
  
}
