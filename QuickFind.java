
import java.util.Arrays;
import java.util.*;
    class QuickFind {
        private int[] integerArray;
        public int[] getIntegerArray(){
            return integerArray;
        }
        public void setIntegerArray(int[]integerArray){
            this.integerArray=integerArray;
        }
        public QuickFind(int lengthOfArray){
            this.integerArray=new int [lengthOfArray];
            for(int i=0;i<integerArray.length;i++){
                this.integerArray[i]=new Random().nextInt(20)+1;
            }
        }
        public int find(int index){
            return integerArray[index];
        }
        public boolean connected(int p,int q){
            return integerArray[p]==integerArray[q];
        }
        public void union(int p,int q){
            int valueOfP=integerArray[p];
            int valueOfQ=integerArray[q];
            if(valueOfP!=valueOfQ){
                for(int i=0;i<integerArray.length;i++){
                    if(integerArray[i]==valueOfP){
                        integerArray[i]=valueOfQ;
                    }
                }
            }
        }
    public static void main(String[] args) {
        QuickFind quickfind =new QuickFind(20);
        System.out.println("values of Array:"+Arrays.toString(quickfind.getIntegerArray()));
        System.out.println("values of 4 is:"+(quickfind.find(4)));
            System.out.println("is index 1 and 4 connected:"+(quickfind.connected(1,4)));
             System.out.println("proccessing union of index please wait");
             quickfind.union(5,6);
              System.out.println("DONE");
               System.out.println("values of Array:"+Arrays.toString(quickfind.getIntegerArray()));
    
    }
}