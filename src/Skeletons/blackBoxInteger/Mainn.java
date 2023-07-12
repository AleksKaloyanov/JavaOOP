package Skeletons.blackBoxInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Mainn {
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        Constructor<?>[] declaredConstructors = BlackBoxInt.class.getDeclaredConstructors();
        BlackBoxInt blackBoxInt = null;

        try {
            Constructor<BlackBoxInt> ctor = BlackBoxInt.class.getDeclaredConstructor();
            ctor.setAccessible(true);
            blackBoxInt = ctor.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Method[] declaredMethods = BlackBoxInt.class.getDeclaredMethods();

        Map<String, Method> methods = new HashMap<>();

        for (Method declaredMethod : declaredMethods) {
            methods.put(declaredMethod.getName(), declaredMethod);
        }

        while (!"END".equals(input = br.readLine())) {
            String[] tokens = input.split("_");
            String cmd = tokens[0];
            Method method = methods.get(cmd);
            method.setAccessible(true);
            method.invoke(blackBoxInt, Integer.parseInt(tokens[1]));

            Field field = blackBoxInt.getClass().getDeclaredFields()[1];
            field.setAccessible(true);
            System.out.println(field.get(blackBoxInt));
        }
    }
}
