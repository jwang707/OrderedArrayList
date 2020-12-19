import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
      super();
    }
    public OrderedArrayList(int initialCapacity){
        super(initialCapacity);
      }

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException("Can't add null");
    }
    super.add(value);
    sort();
    return true;
    }

  public void add(T value, int index){
    add(value);
    sort();
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Can't add null");
    }
    else{
      remove(index);
      super.add(value);
      sort();
      return remove(index);
    }
  }

  private void sort(){
   for (int j = 0; j < size(); j++) {
     int min = j;
     for (int i = j+1; i < size(); i++) {
       if (get(i).compareTo(get(min)) < 0) {
         min = i;
        }
     }
     T yeet = get(j);
     super.set(j, get(min));
     super.set(min, yeet);
   
   }
 }
}
