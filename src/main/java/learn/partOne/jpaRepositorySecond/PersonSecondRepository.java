package learn.partOne.jpaRepositorySecond;

import learn.partOne.model.PersonSecond;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by clz on 2017/2/2.
 */
@Repository
public interface PersonSecondRepository extends JpaRepository<PersonSecond, AtomicInteger> {
    PersonSecond findByName(String name);

}
