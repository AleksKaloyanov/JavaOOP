package Skeletons.harvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        Class<RichSoilLand> clazz = RichSoilLand.class;
        Field[] declaredFields = clazz.getDeclaredFields();

        while (!"HARVEST".equals(input = br.readLine())) {
            System.out.print(printFields(declaredFields, input));
        }
    }

    private static String printFields(Field[] fields, String input) {
        StringBuilder sb = new StringBuilder();
        for (Field field : fields) {
            if (Modifier.toString(field.getModifiers()).equals(input) || input.equals("all"))
                sb.append(String.format("%s %s %s", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(),
                        field.getName())).append(System.lineSeparator());


        }
        return sb.toString();
    }
}
