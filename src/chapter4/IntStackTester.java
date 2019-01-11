package chapter4;

import java.util.Scanner;

public class IntStackTester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println("현재 데이터 수 : " + s.size() + " / "+s.capacity());
            System.out.print("(1)푸시  (2)팝  (3)피크  (4)덤프  (0)종료");

            int menu = stdIn.nextInt();
            if (menu == 0) {
                break;
            }
            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    x = stdIn.radix();
                    try {
                        s.push(x)
                    }
            }
        }
    }
}
