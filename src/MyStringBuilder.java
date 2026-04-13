import java.util.Stack;

public class MyStringBuilder {

    private StringBuilder sb;
    private Stack<String> history;

    public MyStringBuilder() {
        sb = new StringBuilder();
        history = new Stack<>();
    }

    // Save current state
    private void saveState() {
        history.push(sb.toString());
    }

    // Append
    public void append(String str) {
        saveState();
        sb.append(str);
    }

    // Delete last n characters
    public void delete(int n) {
        if (n > sb.length()) return;
        saveState();
        sb.delete(sb.length() - n, sb.length());
    }

    // Replace
    public void replace(int start, int end, String str) {
        if (start < 0 || end > sb.length()) return;
        saveState();
        sb.replace(start, end, str);
    }

    // Undo
    public void undo() {
        if (!history.isEmpty()) {
            sb = new StringBuilder(history.pop());
        }
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}