import java.util.Comparator;

public class ComparadorCodigo implements Comparator<Pais>
{
    @Override
    public int compare(Pais um, Pais outro) {
        return (um.getCod()).compareTo(outro.getCod());
    }

   // @Override
   // public int compare(Object o1, Object o2) {
   //     Pais p1 = (Pais) o1;
    //    Pais p2 = (Pais) o2;
   //     return (p1.getCod()).compareTo(p1.getCod());
   // }
}
