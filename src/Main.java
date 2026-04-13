public class Main {
    public static void main(String[] args) {

        MyStringBuilder sb = new MyStringBuilder();

        sb.append("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.delete(6);
        System.out.println("After delete: " + sb);

        sb.undo();
        System.out.println("After undo: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        sb.undo();
        System.out.println("After undo: " + sb);
    }
}