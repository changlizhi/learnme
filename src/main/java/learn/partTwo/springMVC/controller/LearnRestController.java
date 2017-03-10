package learn.partTwo.springMVC.controller;

import learn.partOne.model.Person;
import learn.partTwo.springMVC.model.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by clz on 2017/1/19.
 */
@RestController
@RequestMapping("/rest")
public class LearnRestController {

    private static final String TEMPLATE = "Hello,%s!";
    private static final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/getjson", produces = "application/json;charset=utf-8")
    public Person getPersonJson(Person person) {
        return new Person(person.getName() + "testName",
                person.getCode() + "test", person.getFlag(), person.getSource());
    }

    @RequestMapping(value = "/getxml", produces = "application/xml;charset=utf-8")
    public Person getPersonXml(Person person) {
        return new Person(person.getName() + "testName",
                person.getCode() + "test", person.getFlag(), person.getSource());
    }

    @RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
    public Greeting greeting(@PathVariable String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}