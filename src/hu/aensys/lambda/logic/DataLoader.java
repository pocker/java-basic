package hu.aensys.lambda.logic;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class DataLoader {

    private final static String ADDRESS = "https://people.sc.fsu.edu/~jburkardt/data/csv/hw_25000.csv";

    public static Collection<Data> downloadData(){
        System.out.print("Downloading data\t");
        try {
            final List<Data> dataList = new ArrayList<>();

            final URL url = new URL(ADDRESS);;
            final Scanner s = new Scanner(url.openStream());

            s.nextLine(); //skipp first line
            while(s.hasNextLine()){
                final String line = s.nextLine();
                dataList.add(convert(line));
            }

            System.out.println("[OK]");

            return Collections.unmodifiableCollection(dataList);
        } catch (IOException e) {
            System.out.println("[ERR]");
            throw new RuntimeException("Couldn't download the file.",e);
        }
    }


    private static Data convert(final String line){
        final String[] split = line.split(",");
        return new Data(
                Integer.parseInt(split[0]),
                Float.parseFloat(split[1]),
                Float.parseFloat(split[2])
        );
    }


}
