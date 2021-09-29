package S201250215;

public class Gourd extends Linable {

    private final int r;
    private final int g;
    private final int b;

    // 成员变量初始化
    Gourd(int r, int g, int b, int value) {
        super.setValue(value);
        this.r = r;
        this.g = g;
        this.b = b;
    }

    // 字符画的格式 将变量画出来
    @Override
    public String toString() {
        String str = String.format("%02d", this.getValue());// 这里写的不好，要根据实际位数使数字长度相同
        return " \033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + str + "  \033[0m";
    }

}
