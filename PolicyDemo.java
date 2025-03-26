import java.util.ArrayList;

public class PolicyDemo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();

        // Manually creating Policy objects since we're skipping file input
        policies.add(new Policy(3450, "State Farm", "Alice", "Jones", 20, "smoker", 65.0, 110.0));
        policies.add(new Policy(3455, "Aetna", "Bob", "Lee", 54, "non-smoker", 72.0, 200.0));
        policies.add(new Policy(2450, "Met Life", "Chester", "Williams", 40, "smoker", 71.0, 300.0));
        policies.add(new Policy(3670, "Global", "Cindy", "Smith", 55, "non-smoker", 62.0, 140.0));
        policies.add(new Policy(1490, "Reliable", "Jenna", "Lewis", 30, "smoker", 60.0, 105.0));
        policies.add(new Policy(3477, "State Farm", "Craig", "Duncan", 23, "smoker", 66.0, 215.0));

        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy policy : policies) {
            System.out.printf("Policy Number: %d\n", policy.getPolicyNumber());
            System.out.printf("Provider Name: %s\n", policy.getProviderName());
            System.out.printf("Policyholder's First Name: %s\n", policy.getPolicyholderFirstName());
            System.out.printf("Policyholder's Last Name: %s\n", policy.getPolicyholderLastName());
            System.out.printf("Policyholder's Age: %d\n", policy.getPolicyholderAge());
            System.out.printf("Policyholder's Smoking Status (smoker/non-smoker): %s\n", policy.getPolicyholderSmokingStatus());
            System.out.printf("Policyholder's Height: %.1f inches\n", policy.getPolicyholderHeight());
            System.out.printf("Policyholder's Weight: %.1f pounds\n", policy.getPolicyholderWeight());
            System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n\n", policy.calculatePolicyPrice());

            if (policy.getPolicyholderSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.printf("The number of policies with a smoker is: %d\n", smokerCount);
        System.out.printf("The number of policies with a non-smoker is: %d\n", nonSmokerCount);
    }
}
