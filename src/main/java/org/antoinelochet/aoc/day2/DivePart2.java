package org.antoinelochet.aoc.day2;

public class DivePart2 {

    public static void main(String[] args) {
        PositionsCounter collect = Input.DATA.stream().map(input -> input.split(" ")).collect(PositionsCounter::new, PositionsCounter::add,
                PositionsCounter::merge);
        System.out.println(collect.depth * collect.horizontalPosition);
    }

    private static class PositionsCounter {
        int horizontalPosition = 0;
        int depth = 0;
        int aim = 0;

        public void add(String[] input) {
            int a = Integer.parseInt(input[1]);
            switch (input[0]) {
                case "up" -> aim -= a;
                case "down" -> aim += a;
                case "forward" -> {
                    horizontalPosition += a;
                    depth += (aim * a);
                }
                default -> System.out.println("Hmmmm...");
            }
        }

        public void merge(PositionsCounter other) {
            this.horizontalPosition += other.horizontalPosition;
            this.depth += other.depth;
            this.aim += other.aim;
        }
    }

}
