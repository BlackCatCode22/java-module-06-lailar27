package lailaRodriguez.Zoo.com;

import java.io.FileNotFoundException;

public class Hyena extends lailaRodriguez.Zoo.com.Animal {

    static int numOfHyenas = 0;

    public Hyena(){
        super();
        numOfHyenas++;
    }

    public Hyena (String sex, int age, int weight, String animalName, String animalID, String animalBirthDate, String animalColor, String animalOrigin, String animalArrivalDate) throws FileNotFoundException {
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin, animalArrivalDate);
        numOfHyenas++;

        String reportFile = "C:\\Users\\laish\\IntelliJ\\ZookeeperMidterm\\src\\lailaRodriguez\\Zoo\\com\\zooPopulation.txt";

        lailaRodriguez.Zoo.com.app.createReport(reportFile);

        System.out.println("Zoo population report has been created: " + reportFile);
    }

}
