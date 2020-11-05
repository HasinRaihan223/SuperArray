public class Tester {
    public static void main(String[] args) {
        SuperArray words = new SuperArray();
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        for(int i = 0; i < words.size(); i++){
            System.out.println( words.get(i) );
        }

        for(int i = 0; i < 10; ++i) {
            words.add("mhm");
        }

        for(int i = 0; i < words.size(); ++i) {
            if(!words.get(i).equals("mhm")) {
                System.out.println("Don't say " + words.set(i, "hmh") + "!");
            }
            System.out.println( words.get(i) );
        }
    }
}

//Tests for the new methods

/*
public static void main(String[]args){
  SuperArray words = new SuperArray();
  words.add("kani");
  words.add("uni");
  words.add("ebi");
  words.add(2, "hello");
  System.out.println(words.toString());
  words.remove(1);
  System.out.println(words.toString());
  words.add("ebi");
  words.add("ebi");
  words.add("ebi");
  words.add("kani");
  words.add("kani");
  words.add("uni");
  System.out.println(words.indexOf("kani"));
  System.out.println(words.toString());
  System.out.println(words.toArray());
  System.out.println(words.toString());
}
*/
