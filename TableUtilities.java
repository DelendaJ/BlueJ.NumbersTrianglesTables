 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for (int row = 1; row <= 5; row++) {
        for (int col = 1; col <= 5; col++){
            table += String.format ("%3d |", row * col);
        }
            table += "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
         String table = "";
        for (int row = 1; row <= 10; row++) {
        for (int col = 1; col <= 10; col++){
            table += String.format ("%3d |", row * col);
        }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
         String table = "";
        for (int row = 1; row <= tableSize; row++) {
        for (int col = 1; col <= tableSize; col++){
            table += String.format ("%3d |", row * col);
        }
            table += "\n";
        }
        return table;
    }
}
