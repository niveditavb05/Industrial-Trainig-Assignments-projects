/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package BarChart;

/**
 *
 * @author Sagar Das
 */
public class star2 {

    public static void main(String args[]) {
        int star = 1;
        int space = 3;
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j <= space + 4; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            star++;
            space--;
            System.out.println();
        }
        int star1 = 1;
        int space1 = 3;
        for (int i = 1; i < 3; i++) {
            for (int k = 1; k <= star1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= space1; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= star1; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= space1; j++) {
                System.out.print("* ");
            }

            star1++;
            space1--;
            System.out.println();
        }
//        ---reverse of the uper part

        int star2 = 2;
        int space2 = 3;
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= space2; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k <= star2; k++) {
                System.out.print("* ");
            }

            for (int k = 1; k <= space2; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= space2; k++) {
                System.out.print(" ");
            }

            for (int k = 2; k <= star2; k++) {
                System.out.print("* ");
            }

            star2++;
            space2--;
            System.out.println();
        }
        int star3 = 1;
        int space3 = 2;
        for (int i = 1; i < 4; i++) {
            for (int k = 1; k <= star3 + 5; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= space3; j++) {
                System.out.print("* ");
            }

            star3++;
            space3--;
            System.out.println();
        }

    }

}
