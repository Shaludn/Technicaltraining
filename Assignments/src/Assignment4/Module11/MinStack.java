package Assignment4.Module11;
import java.util.*;
//LEETCODE -155 MinStack
public class MinStack {
        long min = Long.MAX_VALUE;
        Stack<Long> s;

        public MinStack() {
            s = new Stack<>();
        }

        public void push(int val) {
            if (s.isEmpty()) {
                min = val;
                s.push((long) val);
            } else {
                if (val > min) {
                    s.push((long) val);
                } else {
                    s.push(2L * val - min); // encode
                    min = val;
                }
            }
        }

        public void pop() {
            if (s.isEmpty()) return;

            long x = s.pop();

            if (x < min) {
                min = 2L * min - x; // decode
            }
        }

        public int top() {
            if (s.isEmpty()) return -1;

            long x = s.peek();

            if (x > min) return (int) x;
            else return (int) min;
        }

        public int getMin() {
            return (int) min;
        }
    }

    class Main {
        public static void main(String[] args) {
            MinStack st = new MinStack();

            st.push(5);
            System.out.println("Pushed 5, Min: " + st.getMin());

            st.push(3);
            System.out.println("Pushed 3, Min: " + st.getMin());

            st.push(7);
            System.out.println("Pushed 7, Min: " + st.getMin());

            System.out.println("Top: " + st.top());

            st.pop();
            System.out.println("After pop, Min: " + st.getMin());

            st.pop();
            System.out.println("After pop, Min: " + st.getMin());

            System.out.println("Top: " + st.top());
        }
    }

