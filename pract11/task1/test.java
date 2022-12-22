package pract11.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

    public static void main(String[] args) throws ParseException {
        Task first = new Task("Soldatenkova", (new SimpleDateFormat("dd.MM.yyyy")).parse("15.09.2020"));
        first.setEndDate(new Date());
        System.out.println(first);
    }
}
