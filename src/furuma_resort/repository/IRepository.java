package furuma_resort.repository;

import java.util.List;

public interface IRepository<E> {
    List<E> display();

    boolean add(E e);

}
