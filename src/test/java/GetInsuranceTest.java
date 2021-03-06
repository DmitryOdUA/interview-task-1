import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GetInsuranceTest {

    private final List<Company> companies = Arrays.asList(
            new Company("Amazon", Arrays.asList(
                    new Employee("John", "Simens", new Insurance(4231, 500)),
                    new Employee("Peter", "Parker"),
                    new Employee("Mister", "Proper", new Insurance(666, 499)))),
            new Company("Google", Arrays.asList(
                    new Employee("John", "Snow", new Insurance(4231, 99)),
                    new Employee("Donald", "Duck"),
                    new Employee("Bruce", "Wayne", new Insurance(9999, 5555)),
                    new Employee("Bruce", "Banner", new Insurance(3412, 400))))
    );

    @Test
    public void getInsuredNum() {
        long insuredNum = 0;
        Assert.assertEquals(5, insuredNum);
    }

    @Test
    public void findBatmanInsurance() {
        final String batmanFirstName = "Bruce";
        final String batmanLastName = "Wayne";
        long batmanInsuranceId = 0;
        // your code should be here

        Assert.assertEquals(9999, batmanInsuranceId);
    }

    @Test
    public void getExpensiveInsuranceList() {
        final int expensiveInsuranceThreshold = 500;
        final List<Insurance> expected = List.of(new Insurance(4231, 500), new Insurance(9999, 5555));

        List<Insurance> actualList = new ArrayList<>(); // your code should be here

        Assert.assertEquals(expected, actualList);
    }
}
