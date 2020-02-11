package languagebasics;

import model.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExpression {
    public List<Person> searchPersonListEligibleForSelectiveService(List<Person> roster, Predicate<Person> checkPerson) {
        return roster.stream().filter(checkPerson).collect(Collectors.toList());
    }
}
