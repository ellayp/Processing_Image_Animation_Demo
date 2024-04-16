import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  // Declare variables before methods, settings, setup, and draw.
  PImage imgMeteor; // "img" follows conventions

  // x and y coordinates for meteor
  float fltMeteorX = 0; // Declares and initializes in the same line
  float fltMeteorY = 0; // Declares and initializes in the same line

  // Define colours
  int black = color(0);
  int white = color(255);
  int magenta = color(255, 0, 255);

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    // load meteor
    imgMeteor = loadImage("spaceMeteors_003.png");

    // resize meteor
    //imgMeteor.resize(50, 50); // Sets the width and height measures of the image
    imgMeteor.resize(imgMeteor.width/4, imgMeteor.height/4);

    // load missile

    // resize missile

    // load rocket

    // resize rocket

  }

  public void draw() {
    background(black);
    
    // draw meteor and move
    // image (imgMeteor, 0, 0);
    // image (imgMeteor, fltMeteorX, fltMeteorY);
    image (imgMeteor, mouseX, mouseY);

    // draw missile and move


    // draw rocket and move

  }
}