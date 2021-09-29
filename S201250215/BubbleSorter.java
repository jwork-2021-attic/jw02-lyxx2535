package S201250215;

public class BubbleSorter implements Sorter {

    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;// 没进来后就结束
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {// 从小到大冒泡排序 将rgb排序后应该交换value
                    swap(i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    @Override
    public String getPlan() {
        return this.plan;// 排序的顺序
    }

}