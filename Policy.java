/**
 * The Policy class stores information about an insurance policy,
 * including the policyholder's details and provides methods to
 * calculate BMI and policy price.
 */
public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

    /**
     * Default constructor.
     */
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        policyholderSmokingStatus = "non-smoker";
        policyholderHeight = 0.0;
        policyholderWeight = 0.0;
    }

    /**
     * Parameterized constructor.
     * @param pNumber the policy number
     * @param pName the provider name
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus the policyholder's smoking status
     * @param height the policyholder's height in inches
     * @param weight the policyholder's weight in pounds
     */
    public Policy(int pNumber, String pName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        policyNumber = pNumber;
        providerName = pName;
        policyholderFirstName = firstName;
        policyholderLastName = lastName;
        policyholderAge = age;
        policyholderSmokingStatus = smokingStatus;
        policyholderHeight = height;
        policyholderWeight = weight;
    }

    /** @param pNumber the policy number to set */
    public void setPolicyNumber(int pNumber) {
        policyNumber = pNumber;
    }

    /** @param pName the provider name to set */
    public void setProviderName(String pName) {
        providerName = pName;
    }

    /** @param firstName the policyholder's first name to set */
    public void setPolicyholderFirstName(String firstName) {
        policyholderFirstName = firstName;
    }

    /** @param lastName the policyholder's last name to set */
    public void setPolicyholderLastName(String lastName) {
        policyholderLastName = lastName;
    }

    /** @param age the policyholder's age to set */
    public void setPolicyholderAge(int age) {
        policyholderAge = age;
    }

    /** @param smokingStatus the policyholder's smoking status to set */
    public void setPolicyholderSmokingStatus(String smokingStatus) {
        policyholderSmokingStatus = smokingStatus;
    }

    /** @param height the policyholder's height in inches to set */
    public void setPolicyholderHeight(double height) {
        policyholderHeight = height;
    }

    /** @param weight the policyholder's weight in pounds to set */
    public void setPolicyholderWeight(double weight) {
        policyholderWeight = weight;
    }

    /** @return the policy number */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /** @return the provider name */
    public String getProviderName() {
        return providerName;
    }

    /** @return the policyholder's first name */
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    /** @return the policyholder's last name */
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    /** @return the policyholder's age */
    public int getPolicyholderAge() {
        return policyholderAge;
    }

    /** @return the policyholder's smoking status */
    public String getPolicyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }

    /** @return the policyholder's height in inches */
    public double getPolicyholderHeight() {
        return policyholderHeight;
    }

    /** @return the policyholder's weight in pounds */
    public double getPolicyholderWeight() {
        return policyholderWeight;
    }

    /**
     * Calculates and returns the BMI of the policyholder.
     * @return the BMI value
     */
    public double calculateBMI() {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

    /**
     * Calculates and returns the total policy price based on various factors.
     * @return the total policy price
     */
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;

        if (policyholderAge > 50) {
            additionalFee += 75.0;
        }

        if (policyholderSmokingStatus.equalsIgnoreCase("smoker")) {
            additionalFee += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        return baseFee + additionalFee;
    }
}
