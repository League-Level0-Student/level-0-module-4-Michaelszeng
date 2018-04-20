void setup(){
size(210,100);}
  void draw (){
    fill(256,256,256);
    ellipse(50,50,75,50);
    ellipse(160,50,75,50);
    if (mouseY>60){
      mouseY=50;
    }
    if(mouseY<40){
      mouseY=50;
    }
    if (mouseX<25){
      mouseX=50;
    }
    if(mouseX>75){
      mouseX=50;
    }
    fill(0,0,0);
    ellipse(mouseX,mouseY,25,25);
    ellipse(mouseX+110,mouseY,25,25);
    
  }