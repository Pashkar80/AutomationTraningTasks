package FirstApp;

/**
 * Created by user on 19.12.2017.
 */
public class ReversArguments {
    // this is not this code it is wrong code

    public static void main(String[] args) {
        String str = "[Bash] how to gain dominance among developers - Pastebin.com";
        String str2 = ReversArguments.getPartString(str);
        System.out.println(str2);
    }

    public static String getPartString(String startLine) {
        String partLine = "";
        String[] parts = startLine.split(":", 2);
        for (int i = 0; i < parts.length; i++) {
            partLine = parts[parts.length - 1].trim();

        }
        return partLine;
    }
}