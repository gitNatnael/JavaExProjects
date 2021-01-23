/**
 * Created by natna on 5/5/2019.
 */
public class EnumDemo {

    public static void main(String[] args) {
        for (kind k: kind.values())
        {
            System.out.println(k);
        }
    }
}

enum kind{
    house,
    villa,
    flat
}