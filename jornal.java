public class jornal {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char result = 'A';


        switch (result) {
            case 'A':
                System.out.println("ОТЛИЧНО!!!");
                break;
            case 'B':
                System.out.println("{ХОРОШО ПОРАБОТАЛИ!!!");
                break;
            case 'C':
                System.out.println("ХОРОШО ПОРАБОТАЛИ!!!");
                break;
            case 'D':
                System.out.println("СДАНО");
                break;
            case 'E':
                System.out.println("ПЕРЕСДАЧА");
            default:
                System.out.println("СИМВОЛ НЕКОРРЕКТЕН!!!");

        }

    }

}
