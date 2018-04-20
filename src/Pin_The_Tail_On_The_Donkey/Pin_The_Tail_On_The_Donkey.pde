PImage donkey;
PImage tail;
if (mousePressed){
int x = mouseX;
int y = mouseY;
}
void setup(){
donkey=loadImage("donkey.jpg");
tail=loadImage("tai.png");
size(300,206);
tail.resize(100,200);
}
void draw(){
  rect(256,14,40,40);
  if (dist(0,0,mouseX,mouseY) < 30){
    background (donkey);
    rect(256,14,40,40);
  }
  else {
    background(0,0,0);
  }
  image(tail, mouseX-80, mouseY-10);
  rect(0,0,30,30);
}