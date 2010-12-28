/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mapeditor;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Philipp
 */
public class EditorObject extends GameObject {
    
    Point position = new Point(0, 0);
    int tile = 0;

    public EditorObject(GameObject go, Point position){
        super(go.name, go.objectChar);
        this.position = position;
    }
    
    public EditorObject(GameObject go, Point position, int tile){
        super(go.name, go.objectChar);
        this.position = position;
        this.tile = tile;
        try{
            image = ImageIO.read(new File("tilesheet.png"));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void draw(Graphics g, ImageObserver io){
        g.drawImage(image, position.x*16, position.y*16, position.x*16 + 16, position.y*16 + 16, 0 + 16*tile, 0, 16 + 16*tile, 16, io);
    }

    public GameObject getParent(){
        return new GameObject(super.name, super.objectChar);
    }

}
