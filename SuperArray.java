public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  /*
  public static void main(String[]arg){
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
  }
  */

}
