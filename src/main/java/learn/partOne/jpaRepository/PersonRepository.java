package learn.partOne.jpaRepository;

import learn.partOne.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by clz on 2017/1/14.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, AtomicInteger> {//改成CrudRepository之后成功了再改回来还是成功的！！！真是神奇

    Person findByName(String name);

    Person findByCodeAndName(String code, String name);

    @Query("from Person p where p.name = :name")
    Person findUser(@Param("name") String name);
}
