package InterfacesAndAbstractionEx.militaryElite;

import InterfacesAndAbstractionEx.militaryElite.enums.Corp;
import InterfacesAndAbstractionEx.militaryElite.enums.State;
import InterfacesAndAbstractionEx.militaryElite.interfaces.Private;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        List<SoldierImpl> soldiers = new LinkedList<>();

        while (!"End".equals(input = br.readLine())) {
            String[] tokens = input.split("\\s+");
            String position = tokens[0];
            int id = Integer.parseInt(tokens[1]);
            String firstName = tokens[2];
            String lastName = tokens[3];
            double salary = Double.parseDouble(tokens[4]);
            switch (position) {
                case "Private":
                    soldiers.add(new PrivateImpl(id, firstName, lastName, salary));
                    break;
                case "LieutenantGeneral":
                    LieutenantGeneralImpl lieutenant = new LieutenantGeneralImpl(
                            id, firstName, lastName, salary);
                    for (int i = 5; i < tokens.length; i++) {
                        int targetId = Integer.parseInt(tokens[i]);
                        for (SoldierImpl soldier : soldiers) {
                            if (soldier instanceof PrivateImpl) {
                                if (soldier.getId() == targetId) {
                                    lieutenant.addPrivates((Private) soldier);
                                }
                            }
                        }
                    }
                    soldiers.add(lieutenant);
                    break;
                case "Commando":
                    if (tokens[5].equals("Marines") || tokens[5].equals("Airforces")) {
                        CommandoImpl commando = new CommandoImpl(id, firstName, lastName, salary, Corp.valueOf(tokens[5].toUpperCase()));
                        for (int i = 6; i < tokens.length; i++) {
                            if (tokens[i + 1].equals("inProgress") || tokens[i + 1].equals("finished")) {
                                Mission mission = new Mission(tokens[i], State.valueOf(tokens[++i].toUpperCase()));
                                commando.addMission(mission);
                            }
                        }
                        soldiers.add(commando);
                    }
                    break;
                case "Engineer":
                    if (tokens[5].equals("Marines") || tokens[5].equals("Airforces")) {
                        EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, Corp.valueOf(tokens[5].toUpperCase()));
                        for (int i = 6; i < tokens.length; i++) {
                            Repair repair = new Repair(tokens[i], Integer.parseInt(tokens[++i]));
                            engineer.addRepair(repair);
                        }
                        soldiers.add(engineer);
                    }

                    break;
                case "Spy":
                    soldiers.add(new SpyImpl(id, firstName, lastName, tokens[4]));
                    break;
            }
        }

        for (SoldierImpl soldier : soldiers) {
            System.out.print(soldier.toString());
        }
    }
}
