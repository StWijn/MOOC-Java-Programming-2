
public class Program {

    public static void main(String[] args) {

        HashMap_obvEigenGemaakteList<Integer, String> map = new HashMap_obvEigenGemaakteList<>();
        map.add(1, "uno");
        map.add(2, "dos");
        map.add(3, "tres");

        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map.get(2));
        System.out.println(map.get(4));
        map.remove(2);
        System.out.println(map.get(2));


    }

}
