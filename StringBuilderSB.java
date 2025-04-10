
public class StringBuilderSB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Saniya");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'T');
        System.out.println(sb);

        // insert in char at index 0
        // sb.insert(0, 'S');
        // System.out.println(sb);
        // Output : STaniya

        // Insert in between
        sb.insert(2,'n');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);

        // append the string
        sb.append(" Shaikh");
        System.out.println(sb);
    }
}
