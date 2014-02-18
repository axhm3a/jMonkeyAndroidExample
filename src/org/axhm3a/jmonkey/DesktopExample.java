package org.axhm3a.jmonkey;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;

/**
 * Created by basten on 18.02.14.
 */
public class DesktopExample extends SimpleApplication {
    private Node node;


    public static void main (String[] argv) {
        DesktopExample example = new DesktopExample();
        example.start();
    }

    @Override
    public void simpleInitApp() {
        Box box = new Box(1,1,1);
        Geometry[] geometry = {new Geometry("Box1", box),new Geometry("Box2", box)};
        Material material = new Material(this.assetManager, "Common/MatDefs/Misc/ShowNormals.j3md");
        //material.setColor("Color", ColorRGBA.Red);
        geometry[0].setMaterial(material);
        geometry[1].setMaterial(material);
        geometry[0].rotate(1f, 0, 0);
        geometry[1].move(-3f,0,0);

        node = new Node();
        node.attachChild(geometry[0]);
        node.attachChild(geometry[1]);

        this.rootNode.attachChild(node);
    }

    @Override
    public void simpleUpdate(float tpf) {
        this.node.rotate(0,2*tpf,0);
        super.simpleUpdate(tpf);
    }
}
