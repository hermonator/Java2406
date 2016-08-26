package ChapterFour;

/**
 * Created by jc259420 on 26/08/2016.
 */
public class CreatePolicies2 {
    public static void main(String[] args) {


        CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
        CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4);
        CarInsurancePolicy2 third = new CarInsurancePolicy2(789,12, "Newcastle");

        // This does not work due to the overriden contructors not including a no input variation.
        // CarInsurancePolicy fourth = new CarInsurancePolicy();

        first.display();
        second.display();
        third.display();

}
}
