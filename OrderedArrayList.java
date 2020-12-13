import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    for (int i = 0; i < super.size(); i++) {
      if (super.get(i) > value) {
        if (i != 0) {
          super.add(i-1, value);
        }
        else super.add(i, value);
      }
    }
  }

  public boolean add(T value, int index){
    if (value == null){
      throw new IllegalArgumentException();
    }
    else{
      OrderedArrayList.add(value);
      return true;
    }
  }

  public boolean set(T value, int index){
    if (value == null){
      throw new IllegalArgumentException();
    }
    else{
      super.remove(index);
      OrderedArrayList.add(value);
      return true;
    }
  }
}
