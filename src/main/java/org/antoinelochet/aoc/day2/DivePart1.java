package org.antoinelochet.aoc.day2;

public class DivePart1 {

    public static void main(String[] args) {
        final int[] horizontalPosition = {0};
        final int[] depth = {0};
        Input.DATA.stream().map(input -> input.split(" ")).forEachOrdered(input -> {
            int a = Integer.parseInt(input[1]);
            switch (input[0]) {
                case "up" -> depth[0] -= a;
                case "down" -> depth[0] += a;
                case "forward" -> horizontalPosition[0] += a;
                default -> System.out.println("Hmmmm...");
            }
        });
        System.out.println(depth[0] * horizontalPosition[0]);
    }

}
