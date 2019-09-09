package services;

import POJO.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PersonService {

    private HashMap<String, Person> personHashMap = new HashMap<>();

    PersonService() {

        Person p1 = new Person();
        p1.setId(1);
        p1.setFirstName("Arish");
        p1.setLastName("Ballana");
        p1.setAge(24);
        personHashMap.put("1", p1);

        Person p2 = new Person();
        p2.setId(2);
        p2.setFirstName("Kavish");
        p2.setLastName("Kansal");
        p2.setAge(25);
        personHashMap.put("2", p2);

    }

    public Person getPerson(String id) {
        return personHashMap.getOrDefault(id, null);
    }

    public ArrayList<Person> getAll() {
        return new ArrayList<>(personHashMap.values());
    }

}
