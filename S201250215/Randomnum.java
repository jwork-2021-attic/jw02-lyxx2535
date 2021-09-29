package S201250215;

public class Randomnum {

    private int[] result;

    public Randomnum(int min, int max, int n) {
        if (n > (max - min + 1) || max < min) {
            System.out.println("wrong");
        }
        result = new int[n];
        int count = 0;
        while (count < n) {
            int num = (int) (Math.random() * (max - min)) + min;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count++;
            }
        }
    }

    public int[] getResult() {
        return this.result;
    }
}
