package ChapterFour;

/**
 * Created by jc259420 on 26/08/2016.
 */
public class CreatePolicies {
    public static void main(String[] args) {


        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy(789,12, "Newcastle");

        // This does not work due to the overriden contructors not including a no input variation.
        // CarInsurancePolicy fourth = new CarInsurancePolicy();

        first.display();
        second.display();
        third.display();

}
}
