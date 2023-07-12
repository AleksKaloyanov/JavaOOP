//package Skeletons.blackBoxInteger;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br =
//                new BufferedReader(new InputStreamReader(System.in));
//        String input = "";
//
//        Constructor<?>[] declaredConstructors = BlackBoxInt.class.getDeclaredConstructors();
//        try {
//            Constructor<?> ctor = declaredConstructors.getClass().getDeclaredConstructor();
//
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//        while (!"END".equals(input = br.readLine())) {
//            String[] tokens = input.split("_");
//            String cmd = tokens[0];
//            switch (cmd) {
//                case "add":
//                    ctor.getClass().getDeclaredMethod("add", int.class)
//                            .invoke(ctor, Integer.parseInt(tokens[1]));
//                    break;
//                case "subtract":
//                    ctor.getClass().getDeclaredMethod("subtract", int.class)
//                            .invoke(ctor, Integer.parseInt(tokens[1]));
//                    break;
//                case "divide":
//                    ctor.getClass().getDeclaredMethod("divide", int.class)
//                            .invoke(ctor, Integer.parseInt(tokens[1]));
//                    break;
//                case "multiply":
//                    ctor.getClass().getDeclaredMethod("multiply", int.class)
//                            .invoke(ctor, Integer.parseInt(tokens[1]));
//                    break;
//                case "rightShift":
//                    ctor.getClass().getDeclaredMethod("rightShift", int.class)
//                            .invoke(ctor, Integer.parseInt(tokens[1]));
//                    break;
//                case "leftShift":
//                    ctor.getClass().getDeclaredMethod("leftShift", int.class)
//                            .invoke(ctor, Integer.parseInt(tokens[1]));
//                    break;
//            }
//            Field[] fields = ctor.getClass().getFields();
//            for (Field field : fields) {
//                System.out.println(field);
//            }
//        }
//    }
//}
