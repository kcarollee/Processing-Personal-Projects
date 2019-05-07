class Ellipse{
  float centerX;
  float centerY;
  float radX;
  float radY;
  
  void setup(float x, float y, float a, float b){
    centerX = x;
    centerY = y;
    radX = a;
    radY = b;
  }
  
  void change(float p, float q){
    radX += p / 1000;
    radY += q / 1000;
  }
  
  void draw(){
    ellipse(centerX, centerY, radX, radY);
  }
  
}
