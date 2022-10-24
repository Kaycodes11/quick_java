package pattern;

public class LearnPattern {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(5);
        // pattern5(4);
        // pattern28(5);
        // pattern30(5);
        // pattern17(5);
        pattern31(4);
    }

    static void pattern1(int n) {
        // for (int row  = 0; row < n; row++) / for (int row  = 1; row <= n; row++)
        for (int row = 1; row <= n; row++) {
            // System.out.println(row); // 1 2 3 4
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println(); // adds a new line after every inner loop done
        }
    }

    /*
     * outer loop's length should always be given number
     * identify for every inner row no; how many cols are there / type of element within col
     * what's needed to print here? here System.out.print("* ");
     * */
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, just add a newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // n = 5; n - row + 1 = 5 - 2 + 1 = 4 or n + 1 - row = 4
            // n = 5; n - row + 1 = 5 - 3 + 1 = 3 or n + 1 - row = 3
            // n = 5; n - row + 1 = 5 - 4 + 1 = 2 or n + 1 - row = 2
            // n = 5; n - row + 1 = 5 - 5 + 1 = 1 or n + 1 - row = 1
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println(); // adds a new line
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // n = 5; row = 1
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println(); // adds  a new line
        }
    }


    // find the no. of rows => find the relationship between row and col => print that many amount of time => print what to print
    static void pattern5(int n) {
        // n = 5
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row; // (2 * 5) - 6 = 4, (2 * 5) - 7 = 3, (2 * 5) - 8 = 2, (2 * 5) - 9 = 1
            // either use <= below or remove - 1 from above and less than below for loop
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? (2 * n) - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;

            for (int spaces = 0; spaces < n - c; spaces++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
