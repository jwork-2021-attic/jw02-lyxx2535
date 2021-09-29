package S201250215;

import S201250215.Line.Position;

public class Linable {

    private int value;// 块块儿里面的数值

    private Position position;

    public void setPosition(Position position) {
        this.position = position;
    };

    public Position getPosition() {
        return this.position;
    };

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    };

    public void swapPosition(Linable another) {
        Position p = another.getPosition();
        this.getPosition().setLinable(another);
        p.setLinable(this);
    }

}
