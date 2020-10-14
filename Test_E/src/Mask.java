public class Mask {

    public static String changeMiddleWordToStar(String word) {
        StringBuilder ret = new StringBuilder();
        if (word.length() > 2) {
            ret.append(word.charAt(0));
            for (int a = 1; a < word.length() - 1; a++) {
                ret.append("*");
            }
            ret.append(word.charAt(word.length() - 1));
            return ret.toString();
        }

        return word;
    }

    public String mask(String original) {
        StringBuilder ret = new StringBuilder();
        String[] word = original.split(" ");
        for (String data : word) {
            if (data.length() == 2) {
                String newWord = data;
                ret.append(newWord);
            } else {
                String newWord = changeMiddleWordToStar(data);
                ret.append(newWord);
            }
            ret.append(" ");
        }

        String result = ret.toString();
        return result.substring(0, result.length() - 1);
    }

    public Mask() {
        System.out.println(mask("To Stark"));
        System.out.println(mask("Peter Parker"));
        System.out.println(mask("Bumblebee"));
        System.out.println(mask("El Taurino"));
        System.out.println(mask("John Doe"));
        System.out.println(mask("Crazy Rich Asian"));
        System.out.println(mask("Stephen Strange"));
        System.out.println(mask("A Kid With Supernatural Abilities"));
    }

    public static void main(String[] args) {
        new Mask();
    }

}
