public static void main(String[] args) {

        int n = StdIn.readInt();
        WeightedQuickUnion uf = new WeightedQuickUnion(n);
        String date, time;
        //timestamps are sorted ascending
        while (!StdIn.isEmpty()) {

            int p = StdIn.readInt();
            int q = StdIn.readInt();
            date = StdIn.readString();
            time = StdIn.readString();


            uf.union(p, q);

            StdOut.println("["+p+","+q+"]");

            if(uf.getComponents() == 1){
                StdOut.println("All members were connected at: " + date + time);
                break;
            }

        }