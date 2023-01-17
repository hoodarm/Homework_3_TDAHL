public class Main {
    public static void main(String[] args) {
        String [][] A = {{"hello","there","is","an","animal"},{"the","animal","is","coming","here"},
                        {"it","is","saying","hello","now"},{"now","it","leaves","forever", "bye"}};
        String searchKey = "is";
        for (int row = 0; row <=3; row++)
            for (int column = 0; column <=4; column++)
                if (A[row][column].equals(searchKey))
                    System.out.println("(" + row + ", " + column + ")");
    }
}