package S201250215;

public class Snake {

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Line line) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            this.execute(step, line);
            System.out.println(line.toString());// 一行行显示出来
            log += line.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private void execute(String step, Line line) {

        if (step != "") {
            String[] couple = step.split("<->");
            int temp1 = 0;
            int temp2 = 0;
            Linable[] linables = line.toArray();
            for (int i = 0; i < linables.length; i++) {
                if (linables[i].getValue() == Integer.parseInt(couple[0])) {
                    temp1 = i;
                }
                if (linables[i].getValue() == Integer.parseInt(couple[1])) {
                    temp2 = i;
                }
            }
            Linable temp = line.get(temp1);
            temp.swapPosition(line.get(temp2));
        }
    }

}