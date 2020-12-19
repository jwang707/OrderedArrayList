import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException("Can't add null");
    }
    else{
      super.add(value);
      return true;
  }
}

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Can't add null");
    }
    else{
      super.add(index, value);
    }
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Can't add null");
    }
    else{
      super.set(index, value);
      return value;
    }
  }

}
