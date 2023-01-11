package Inheritance.randomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList randomArrayList = new RandomArrayList();

        randomArrayList.add(3);
        randomArrayList.add(8);
        randomArrayList.add("asd");
        randomArrayList.add('1');


        System.out.println(randomArrayList.getRandomElement());
    }
}
