package Chapter9_Object_And_Class.Exercise;

public class soal2b_Stock {
    String Symbol;
    String name;
    double previousclosingPrice;
    double currentPrice;

    soal2b_Stock(String newSymbol, String newName) {
        Symbol = newSymbol;
        name = newName;
    }
    double getChangePercent() {
        return ((currentPrice- previousclosingPrice) / previousclosingPrice) * 100;
    }
}
