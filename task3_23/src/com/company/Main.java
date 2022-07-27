package com.company;
import java.util.Locale;
import java.util.Scanner;

    public class Main {
        public static final Line L1 = new Line(-1, 2, -2);
        public static final VerticalParabola P1 = new VerticalParabola(0, -5, 0.25);
        public static final Rectangle R1 = new Rectangle(-6, -2, 5, 6);

        public static SimpleColor getColor(double x, double y) {
            if (P1.isPointAboveOfParabola(x, y) && L1.isPointAboveLine(x, y) && !R1.isPointInRectangle(x, y)) {
                return SimpleColor.YELLOW;
            }
            if (!P1.isPointAboveOfParabola(x, y) && L1.isPointAboveLine(x, y)) {
                return SimpleColor.GRAY;
            }
            if ( L1.isPointAboveLine(x, y) && R1.isPointInRectangle(x, y)) {
                return SimpleColor.ORANGE;
            }
            if (P1.isPointAboveOfParabola(x, y) && !L1.isPointAboveLine(x, y) && R1.isPointInRectangle(x, y)) {
                return SimpleColor.GRAY;
            }
            if (!P1.isPointAboveOfParabola(x, y) && !L1.isPointAboveLine(x, y) && !R1.isPointInRectangle(x, y)) {
                return SimpleColor.BLUE;
            }
            if (P1.isPointAboveOfParabola(x, y) && !L1.isPointAboveLine(x, y) && y > 4) {
                return SimpleColor.BLUE;
            }
            if (P1.isPointAboveOfParabola(x, y) && !L1.isPointAboveLine(x, y)) {
                return SimpleColor.GRAY;
            }
            return SimpleColor.GRAY;
        }

        public static void printColorForPoint(double x, double y) {
            System.out.printf("(%.3f, %.3f) -> %s%n", x, y, getColor(x,y));
        }

        public static void tests() {
            printColorForPoint(3, 2);
            printColorForPoint(0, 5);
            printColorForPoint(-3, -8);
            printColorForPoint(-3, 0);
            printColorForPoint(0, -6);
            printColorForPoint(0, -3);
            printColorForPoint(-1.5, 3.5);
        }

        public static void main(String[] args) {
            Locale.setDefault(Locale.ROOT);

            tests();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите x и y.");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            printColorForPoint(x,y);
        }
    }


