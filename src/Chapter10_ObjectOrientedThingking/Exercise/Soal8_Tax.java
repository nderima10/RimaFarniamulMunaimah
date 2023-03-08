package Chapter10_ObjectOrientedThingking.Exercise;

import java.util.Scanner;

public class Soal8_Tax {
    public static void main(String[] args) {
        Soal8b tax2001 = new Soal8b();
        Soal8b tax2009 = new Soal8b();

        double[]  rates20001 = {15,27.5, 30, 35.1,  39.5};
        tax2001.setRates(rates20001);

        int[][] brackets2001 = {{27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}};

        tax2001.setBrackets(brackets2001);
        final double FROM = 50000;
        final double To = 60000;
        final double INTERVAL =  1000;

        System.out.println("\n2001 tax tables for taxable income  from  $50,000 to $60,000");
        print(tax2001, FROM, To, INTERVAL);
    }
    public static void print(Soal8b tax, double from, double to, double interval) {
        System.out.println(
                "-----------------------------------------------------------------\n" +
                        "Taxable        Single      married Joint      Married     Head of\n" +
                        "Income                     or Qualifying      Separate    a House\n" +
                        "-----------------------------------------------------------------\n");
        for (double taxableIncome = from; taxableIncome <= to; taxableIncome += interval) {
            tax.setTaxableIncome(taxableIncome);
            System.out.printf("%-13.0f", taxableIncome);
            tax.setFilingStatus(tax.SINGLE_FILER);
            System.out.printf("%8.2f", tax.getTax());
            tax.setFilingStatus(tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
            System.out.printf("%15.2f", tax.getTax());
            tax.setFilingStatus(tax.MARRIED_SEPARATELY);
            System.out.printf("%188.2f", tax.getTax());
            tax.setFilingStatus(tax.HEAD_OF_HOUSEHOLD);
            System.out.printf("%15.2f\n", tax.getTax());
        }
    }
}
