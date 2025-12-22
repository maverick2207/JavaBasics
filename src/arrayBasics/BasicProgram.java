package arrayBasics;



public class BasicProgram {
    // This program demonstrates how to modify an element in an array
        public static void main(String[] args){
            // The program creates an array with one element, increments that element,
            // and prints the value of that element.

            int[] a = {1};
            // The array is initialized with a single element, 1.
            BasicProgram t = new BasicProgram();
            // An instance of BasicProgram is created to call the increment method.
            t.increment(a);
            // The increment method is called, which modifies the last element of the array.
            System.out.println(a[a.length - 1]); // The last element of the array is printed, which should now be 2.
        }
        void increment(int[] i){
            i[i.length - 1]++;
        }
    }

