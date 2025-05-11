package arrayBasics;

public class BasicProgram {
        public static void main(String[] args){
            int[] a = {1};
            BasicProgram t = new BasicProgram();
            t.increment(a);
            System.out.println(a[a.length - 1]);
        }
        void increment(int[] i){
            i[i.length - 1]++;
        }
    }

