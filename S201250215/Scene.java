package S201250215;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Scene {

    public static void main(String[] args) throws IOException {

        // Randomnum randomnum = new Randomnum(1, 65, 64);

        // Random r = new Random();
        // Line line = new Line(64);
        // for (int i = 0; i < 64; i++) {
        // Gourd gourd = new Gourd(r.nextInt(256), r.nextInt(256), r.nextInt(256),
        // randomnum.getResult()[i]);
        // line.put(gourd, i);
        // }

        // Snake theSnake = new Snake();

        // Sorter sorter = new QuickSorter();

        // theSnake.setSorter(sorter);// 老头拥有了冒泡排序器

        // String log = theSnake.lineUp(line);

        // BufferedWriter writer;
        // writer = new BufferedWriter(new FileWriter("result.txt"));// log写进文件，可以显示过程
        // writer.write(log);
        // writer.flush();
        // writer.close();
        Randomnum randomnum = new Randomnum(1, 65, 64);

        Random r = new Random();
        Matrix matrix = new Matrix(64);
        for (int i = 0; i < 64; i++) {
            Gourd gourd = new Gourd(r.nextInt(256), r.nextInt(256), r.nextInt(256), randomnum.getResult()[i]);
            matrix.put(gourd, i);
        }

        Snake theSnake = new Snake();

        Sorter sorter = new BubbleSorter();

        theSnake.setSorter(sorter);// 老头拥有了冒泡排序器

        String log = theSnake.lineUp(matrix);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));// log写进文件，可以显示过程
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
