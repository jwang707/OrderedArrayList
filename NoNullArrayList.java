import java.util.ArrayList;
import java.util.IllegalArgumentException;

public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public void add(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    else (super.add(value));
  }

  public void set(T value, int index){
    if (value == null){
      throw new IllegalArgumentException();
    }
    else (super.set(value, index));
  }


}
