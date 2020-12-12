package essential.objects;

import essential.Map;

public abstract class AbstractMovableObject extends AbstractGameObject{

    public AbstractMovableObject(Map map) {
        super(map);
    }

    public abstract void move(int direction) throws Exception;
}
