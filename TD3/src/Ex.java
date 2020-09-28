

import java.util.LinkedList;
import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

@Invariant({ "elements != null",
             "estVide() || hautDePile() != null" }) 
public class Ex<T> {

  private final LinkedList<T> elements = new LinkedList<T>();

  @Requires("o != null")
  @Ensures({ "!estVide()", "hautDePile() == o" })
  public void empiler(T o) {
    elements.add(o);
  }

  @Requires("!estVide()")
  @Ensures({ "result == old(hautDePile())", "result != null" })
  public T depiler() {
    final T sommet = hautDePile();
    elements.removeLast();
    return sommet;
  }

  @Requires("!estVide()")
  @Ensures("result != null")
  public T hautDePile() {
    return elements.getLast();
  }

  public boolean estVide() {
    return elements.isEmpty();
  }

}