public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
  }

  public SuperArray(int InitialCapacity){
    size = 0;
    data = new String[InitialCapacity];
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if (size >= data.length){
      resize();
      data[size] = element;
      size++;
    }
    else {
      data[size] = element;
      size++;
    }
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  private void resize(){
    String[] newdata = new String[data.length+10];
    for (int i = 0; i < size; i++) {
			newdata[i] = data[i];
		}
    data = newdata;
  }

  public void clear(){
    String[] temp = new String[10];
    size = 0;
    data = temp;
  }

  public boolean isEmpty(){
    return (size()==0);
  }

  public String toString(){
    String empty = "[";
     for (int i = 0; i < size; i++) {
      empty += data[i];
      if (i != size-1)
      empty += ", ";
     }
    empty += "]";
    return empty;
	 }

  public boolean contains(String s){
    for(int i = 0; i < data.length; i++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element){
    if (index >= size) {
			add(element);
		}
    else if (index >= 0) {
			if (size == data.length)
				resize();
			for (int i = size; i > index; i--){
        data[i] = data[i-1];
      }
			data[index] = element;
			size++;
		}
  }

  public String remove(int index){
    String temp = data[index];
    if (index <= size || index > 0) {
			for (int i = index; i < size-1; i++){
        data[i] = data[i+1];
      }
      size--;
		}
    return temp;
  }

  public int indexOf(String s){
    int position = 0;
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        position = i;
        break;
      }
    }
    return position;
  }

  public String[] toArray(){
    String[] newdata = new String[size];
    for(int i = 0; i < data.length; i++){
      if (data[i]==null){
        break;
      }
      else {
        newdata[i] = data[i];
      }
    }
    return newdata;
  }

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


}
