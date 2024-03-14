
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StingBuilderExamples {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Boa noite");

        System.out.println(buffer.length());

        int num = 42;
        float flt = 42.9;

        buffer.insert(1, 'oposição1');
        buffer.append(" turma");
        buffer.append(" ");
        buffer.append(num);
        buffer.append(" ");
        buffer.append(flt)
        //buffer.setLength(42);
        buffer.ensureCapacity(42);
        buffer.setCharAt(2, 'A');
        System.out.println(buffer.capacity());
        System.out.println(buffer.reverse());
        buffer.deleteCharAt(1)
        System.out.println(buffer);

    }
}
}