package S201250215;

public class Matrix extends Line {

    private Position[] positions;

    public Matrix(int length) {
        this.positions = new Position[length];
    }

    public void put(Linable linable, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null);
        }
        this.positions[i].setLinable(linable);
    }

    public Linable get(int i) {// 通过数组的下标返回
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].linable;
        }
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].linable;
        }

        return linables;

    }

    @Override
    public String toString() {
        String lineString = "\t";
        int count = 0;
        for (int i = 0; i < positions.length; i++) {// 一个个格子显示出来

            lineString += positions[i].linable.toString();
            count++;
            if (count % Math.sqrt(positions.length) == 0)
                lineString += "\t\t\t\t\t\t\t";
        }
        return lineString;
    }

}
