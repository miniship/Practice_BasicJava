package languagebasics;

import model.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionTest {
    private List<Person> roster;
    private LambdaExpression lambdaExpression = new LambdaExpression();

    @Before
    public void setup() {
        roster = new ArrayList<>();
        roster.add(new Person("Tuan", LocalDate.of(1990, 7, 1), Person.SEX.MALE, "tuan@gmail.com"));
        roster.add(new Person("Phu", LocalDate.of(2005, 5, 1), Person.SEX.MALE, "phu@gmail.com"));
        roster.add(new Person("Khang", LocalDate.of(1982, 1, 1), Person.SEX.MALE, "khang@gmail.com"));
    }

    @Test
    public void testLambdaExpression() {
        List<Person> result = lambdaExpression.searchPersonListEligibleForSelectiveService(roster, p -> p.getGender() == Person.SEX.MALE && p.getAge() >= 18 && p.getAge() <=40);
        Person person1 = result.get(0);
        Person person2 = result.get(1);

        Assert.assertEquals(2, result.size());
        Assert.assertEquals("Tuan", person1.getName());
        Assert.assertEquals(30, person1.getAge());
        Assert.assertEquals("Khang", person2.getName());
        Assert.assertEquals(38, person2.getAge());
    }
}
