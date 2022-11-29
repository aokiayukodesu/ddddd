import java.util.HashMap;
import java.util.Map;


public class Main1 {
    public static void main(String[] args) {
        //Map
        Map<String, String> kidsTv = new HashMap<>();
        kidsTv.put("いないいないばあっ！", "わんわん うーたん　はるき");
        kidsTv.put("おかあさんといっしょ", "あずき&まやお姉さん　まこと＆ゆういちろうお兄さん");
        kidsTv.put("みぃつけた！", "サボさん　コッシー　スイちゃん");

        System.out.println(kidsTv.get("いないいないばあっ！"));
        System.out.println(kidsTv.get("おかあさんといっしょ"));
        System.out.println(kidsTv.get("みぃつけた！"));

        //例外処理
        String acolumn = "あいうえお";
        try {
            int number = Integer.parseInt(acolumn);
            throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println(acolumn + "は数値ではありません");
        }
    }
}
