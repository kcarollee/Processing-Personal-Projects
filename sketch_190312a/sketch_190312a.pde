float startX;
float startY;
float lineColor;

//setup block runs once
void setup(){
  //set window size
  size(1000, 1000);
  lineColor = 100;
  //set draw color
 
  background(192, 64, 0);
  
  startX = 150;
  startY = 25;
}
//draw() block runs repeatedly
void draw(){
 // first two params: begining of line
  stroke(lineColor);
  line(startX,startY, mouseX, mouseY);
}

void mousePressed(){
   startX = mouseX;
   startY = mouseY;
   lineColor = random(0, 255);
}
