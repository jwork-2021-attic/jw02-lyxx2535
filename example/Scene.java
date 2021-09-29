package example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {

    public static void main(String[] args) throws IOException {

        Line line = new Line(7);
        line.put(Gourd.ONE, 6);// 前面是真值，后面是数组位置
        line.put(Gourd.TWO, 3);
        line.put(Gourd.THREE, 1);
        line.put(Gourd.FOUR, 5);
        line.put(Gourd.FIVE, 2);
        line.put(Gourd.SIX, 4);
        line.put(Gourd.SEVEN, 0);

        Geezer theGeezer = Geezer.getTheGeezer();

        Sorter sorter = new BubbleSorter();

        theGeezer.setSorter(sorter);// 老头拥有了冒泡排序器

        String log = theGeezer.lineUp(line);// 输出内容java -jar asciianimator.jar -f result.txt -l false -c true -fps 3

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));// log写进文件，可以显示过程
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
