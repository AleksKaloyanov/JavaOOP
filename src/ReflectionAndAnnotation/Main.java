package ReflectionAndAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    @Author(name = "George")
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class reflection = Reflection.class;
        System.out.println(reflection);
        System.out.println(reflection.getSuperclass());
        for (Class<?> anInterface : reflection.getInterfaces()) {
            System.out.println(anInterface);
        }

        Object reflectionObject = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject);

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();

        Method[] declaredMethods = reflection.getDeclaredMethods();

        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();
        for (Method declaredMethod : declaredMethods) {
            String name = declaredMethod.getName();
            if (name.startsWith("set")) {
                setters.add(declaredMethod);
            }
            if (name.startsWith("get")) {
                getters.add(declaredMethod);
            }
        }

        getters = getters.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
        setters = setters.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());

        for (Method getter : getters) {
            System.out.printf("%s will return class %s%n", getter.getName(), getter.getReturnType().getSimpleName());
        }

        for (Method setter : setters) {
            Parameter[] parameters = setter.getParameters();
            System.out.printf("%s and will set field of class %s%n", setter.getName(),
                    parameters[0].getType().getSimpleName());
        }

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();


        for (Field declaredField : reflection.getDeclaredFields()) {
            int modifiers = declaredField.getModifiers();
            if (!Modifier.isPrivate(modifiers)) {
                System.out.printf("%s must be private!%n", declaredField.getName());
            }
        }

        for (Method getter : getters) {
            int modifiers = getter.getModifiers();
            if (!Modifier.isPublic(modifiers)) {
                System.out.printf("%s have to be public!%n", getter.getName());
            }
        }

        for (Method setter : setters) {
            int modifiers = setter.getModifiers();
            if (!Modifier.isPrivate(modifiers)) {
                System.out.printf("%s have to be private!%n", setter.getName());
            }
        }

        System.out.println("-------------------------------------");


        for (Field declaredField : reflection.getDeclaredFields()) {
            System.out.println(declaredField.getName());
        }


        System.out.println("-------------------------------------");

        Tracker.printMethodsByAuthor(Main.class);
        Tracker.printMethodsByAuthor(Tracker.class);

    }

    public static class Tracker {
        @Author(name = "Peter")
        public static void printMethodsByAuthor(Class clazz) {
            Method[] declaredMethods = clazz.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
                for (Annotation declaredAnnotation : declaredAnnotations) {
                    if (declaredAnnotation instanceof Author) {
                        System.out.printf("%s: %s()%n", ((Author) declaredAnnotation).name(),
                                declaredMethod.getName());
                    }
                }
            }
        }
    }
}
