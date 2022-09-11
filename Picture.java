/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Evan Skupien
 * @version 2022.09.11
 */
public class Picture
{
    private Person Dan; 
    private Person Kyle;
    private Square sand;
    private Square sea; 
    private boolean drawn;
    private Square sky;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
      Kyle = new Person();
      Dan = new Person();
      sand = new Square(); 
      sea = new Square();
      sky = new Square(); 
      sun = new Circle();
   
    }
    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn)  {

        sky.changeColor("white");
        sky.moveHorizontal(-320);
        sky.moveVertical(-200);
        sky.changeSize(550);
        sky.makeVisible();  
        
        sun.changeColor("yellow");
        sun.moveVertical(-100);
        sun.moveHorizontal(-5);
        sun.makeVisible(); 

        sand.changeColor("yellow");
        sand.moveHorizontal(-320);
        sand.changeSize(550);
        sand.makeVisible();

        sea.changeColor("blue");
        sea.moveVertical(90);
        sea.moveHorizontal(-360);
        sea.changeSize(550);
        sea.makeVisible();


        Dan.changeColor("red");
        Dan.moveHorizontal(-90);
        Dan.makeVisible();

        Kyle.changeColor("red");
        Kyle.moveHorizontal(30);
        Kyle.makeVisible();
        drawn = true;
        }

    }

    public static void main(String[] args)
    {
       
    Picture p = new Picture();
    p.draw();

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
     Dan.changeColor("black");
     Kyle.changeColor("white");
     sea.changeColor("white");
     sand.changeColor("white");
     sun.changeColor("white");

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
      Kyle.changeColor("red");
      Dan.changeColor("red");
      sea.changeColor("blue");
      sand.changeColor("yellow");
      sun.changeColor("yellow");
      sky.changeColor("white");
    }
}
