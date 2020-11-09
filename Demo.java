public class Demo{

  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i < s.size(); i++){
      String temp = s.get(i);
      for(int j = s.size()-1; j > i ; j--){
        if (temp.equals(s.get(j))){
          s.remove(j);
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray();
    for(int i = 0; i < a.size(); i++){
      for(int j = 0; j < b.size(); j++){
        if (a.get(i).equals(b.get(j))){
          c.add(a.get(i));
        }
      }
    }
    removeDuplicates(c);
    return c;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray();
    int siz = 0;

    if (a.size() > b.size()){
      siz = b.size();
      for(int i = 0; i < siz; i++){
          c.add(a.get(i));
          c.add(b.get(i));
        }
      for(int i = siz; i < a.size(); i++){
        c.add(a.get(i));
      }
    }

    else{
      siz = a.size();
      for(int i = 0; i < siz; i++){
          c.add(a.get(i));
          c.add(b.get(i));
        }
      for(int i = siz; i < b.size(); i++){
          c.add(b.get(i));
      }
    }
    return c;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }

}
