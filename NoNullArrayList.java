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
      throw new IllegalArgumentException();
    }
    else{
      super.add(value);
      return true;
  }
}

  public boolean set(T value, int index){
    if (value == null){
      throw new IllegalArgumentException();
    }
    else{
      super.set(index, value);
      return true;
    }
  }

}
