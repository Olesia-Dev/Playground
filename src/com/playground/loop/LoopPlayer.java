package com.playground.loop;

public class LoopPlayer {

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println();
        printTriangleBackwards(5);
    }

    private static void printTriangle(int dimension) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printTriangleBackwards(int dimension) {
        int innerDimension = dimension;
        for (int i = 0; i < dimension; i++, innerDimension--) {
            for (int j = 0; j < innerDimension; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
