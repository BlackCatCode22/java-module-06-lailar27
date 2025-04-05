// App.java
// Midterm Zookeeper's Challenge
// lR 4/3/25

package lailaRodriguez.Zoo.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class app {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to My Zoo Program!\n\n");

        // Use filePaths and Utilities to generate names for the animal lists
        String filePath = "C:\\Users\\laish\\IntelliJ\\ZookeeperMidterm\\src\\lailaRodriguez\\Zoo\\com\\animalNames.txt";
        AnimalNameListsWrapper animalLists = Utilities.createAnimalNameLists(filePath);

        // For-each loop outputting hyena names
        ArrayList<String> listOfHyenaNames = animalLists.getHyenaNameList();
        System.out.println("\nHyena Names: ");
        for (String hyenaName : listOfHyenaNames) {
            System.out.println(hyenaName);
        }

        // For-each loop outputting lion names
        ArrayList<String> listOfLionNames = animalLists.getLionNameList();
        System.out.println("\nLion Names: ");
        for (String lionName : listOfLionNames) {
            System.out.println(lionName);
        }

        // For-each loop outputting tiger names
        ArrayList<String> listOfTigerNames = animalLists.getTigerNameList();
        System.out.println("\nTiger Names: ");
        for (String tigerName : listOfTigerNames) {
            System.out.println(tigerName);
        }

        // For-each loop outputting bear names
        ArrayList<String> listOfBearNames = animalLists.getBearNameList();
        System.out.println("\nBear Names: ");
        for (String bearName : listOfBearNames) {
            System.out.println(bearName);
        }

        BufferedReader reader = null;

        String aniSex;
        String aniSpecies;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\laish\\IntelliJ\\ZookeeperMidterm\\src\\lailaRodriguez\\Zoo\\com\\arrivingAnimals.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] arrayOfStrPartsOnComma = line.split(", ");

                int elementNum = 0;
                for (String thePart : arrayOfStrPartsOnComma) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnComma is: " + thePart);
                    elementNum++;
                }
                String aniColor;
                String aniWeight;
                String aniOrigin01;
                String aniOrigin02;
                String aniAge;
                String aniArrivalDate;
                String aniID;

                aniArrivalDate = Utilities.arrivalDate();
                aniColor = arrayOfStrPartsOnComma[2];
                aniWeight = arrayOfStrPartsOnComma[3];
                aniOrigin01 = arrayOfStrPartsOnComma[4];
                aniOrigin02 = arrayOfStrPartsOnComma[5];

                System.out.println();
                String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(", ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace is: " + thePart);
                    elementNum++;
                }
                aniAge = arrayOfStrPartsOnSpace[0];
                int intAniAge = Integer.parseInt(aniAge);
                aniSex = arrayOfStrPartsOnSpace[3];
                aniSpecies = arrayOfStrPartsOnSpace[4];
                System.out.println("\n The animal's sex is " + aniSex);
                System.out.println("\n The species is " + aniSpecies);
                System.out.println("\n The color is " + aniColor);
                System.out.println("\n The weight is " + aniWeight);
                System.out.println("\n Origin01 is " + aniOrigin01);
                System.out.println("\n Origin02 is " + aniOrigin02);

                System.out.println();
                String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace02) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace02 is: " + thePart);
                    elementNum++;
                }
                System.out.println();

                String ageInYears = arrayOfStrPartsOnSpace[0];
                String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
                System.out.println("The age in years of the animal is: " + ageInYears);
                System.out.println("The season of birth of the animal is: " + animalBirthSeason);

                if (aniSpecies.equals("hyena")) {
                    System.out.println("\n The animal is a hyena!");

                    aniID = Utilities.calcAnimalID("hyena");
                    System.out.println("\n animal ID is: " + aniID);

                    String myName;
                    myName = listOfHyenaNames.removeFirst();

                    System.out.println("\n My hyena's name is: " + myName);

                    Hyena hyena = new Hyena(aniSex, intAniAge, 99, "to be named", "animalID", "animalBirthDate", aniColor, aniOrigin01 + aniOrigin02, aniArrivalDate);
                    System.out.println(" The new hyena's color is :" + hyena.getAnimalColor());

                    String reportFile = "C:\\Users\\laish\\IntelliJ\\ZookeeperMidterm\\src\\lailaRodriguez\\Zoo\\com\\zooPopulation.txt";

                }
            }
        } catch (IOException e) {

            e.printStackTrace();
        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }


            } catch (IOException ex) {
                ex.printStackTrace();

                    }
                }
            }

    public static void createReport(String fileName) throws FileNotFoundException {
try (java.io.PrintWriter writer = new java.io.PrintWriter(fileName)) {
    writer.println("Zoo Population Report");
    writer.println("======================");

    writer.println("ID #, Name, Birthdate, Color, Sex, Weight, Location, Arrival Date"); {
    }
}}
}

