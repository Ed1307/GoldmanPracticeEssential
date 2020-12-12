package essential.objects;

import essential.Map;

import javax.swing.*;

/**
 * Created by Asus on 10.09.2020.
 */
public class Goldman extends AbstractMovableObject {

    public Goldman(Map map) {
        super(map);
        setImage(new ImageIcon(getClass().getResource("/images/goldman_up.png")));
    }
    @Override
    public void move(int direction) throws Exception {

        int x = getX();
        int y = getY();

        Ground ground = new Ground(getMap());

        switch (direction) {
            case 1:
                y--;
                break;
            case 2:
                y++;
                break;
            case 3:
                x--;
                break;
            case 4:
                x++;
                break;
        }

        AbstractGameObject nextObject = getMap().getObjectByCoordinates(y, x);
        if(nextObject != null && nextObject.getClass() == Ground.class) {
            getMap().setObjectByCoordinate(getY(), getX(), ground);
            getMap().setObjectByCoordinate(y, x, this);
            getMap().drawTable();
            Thread.sleep(1500);
        }
    }

}
