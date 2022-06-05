public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
    }

    private static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        int first = fullName.indexOf(" ");
        int second = fullName.indexOf("I", 7);
        int third = fullName.lastIndexOf(" ");
        String lastName = fullName.substring(0, first);
        String middleName = fullName.substring(third);
        String name = fullName.substring(second, third);
        System.out.println("Имя сотрудника — " + name);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }


    private static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char[] array = fullName.toCharArray();
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == ' ' && array[i] != ' ')
                array[i] = Character.toUpperCase(array[i]);
        }
        if (array[0] != ' ')
            array[0] = Character.toUpperCase(array[0]);
        System.out.println(array);

    }

    private static void task7() {
        String first = "135";
        String second = "246";
        StringBuilder built = new StringBuilder();
        String[] a = first.split("");
        String[] b = second.split("");
        for (int i = 0; i < first.length(); i++) {
            built.append(a[i]).append(b[i]);
        }
        System.out.println(built);
    }
    private static void task8() {
        String data = "aabccddefgghiijjkk";
        StringBuilder bodybuilder = new StringBuilder();
        String[] a = data.split("");
        for (int i = 0;i < data.length() - 1;i ++) {
            if (a[i].equals(a[i + 1])) {
                bodybuilder.append(a[i]);
            }
        }
        System.out.println(bodybuilder);
    }
}

