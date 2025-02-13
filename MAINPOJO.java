public class MAINPOJO {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            StudentPojo s = new StudentPojo("A132" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Timy";
                        case 3 -> "Jane";
                        case 4 -> "Jonny";
                        case 5 -> "Xao ming";
                        default -> "Unknown";
                    }, "05/03/1974", "JavaClass");
            System.out.println(s);
        }
    }
}
