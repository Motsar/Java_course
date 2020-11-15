import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<String, String>();
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");

        String mikaelsNick = nicknames.get("mikael");
        System.out.println(mikaelsNick);

    }
}

