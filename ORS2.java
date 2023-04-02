public class ORS2 implements ORS1{

    ORS o = new ORS();

    @Override
    public void train_number() {
        System.out.println("train_no is: "+o.getTrain_number());
    }

    @Override
    public void train_name(String train_name) {

    }


    @Override
    public void train_name() {

    }

    @Override
    public void class_type() {
        System.out.println("class_type is: "+o.getClass_type());
    }

    @Override
    public void date_of_journey() {
        System.out.println("date_of_journey: "+o.getDate_of_journey());
    }

    @Override
    public void From_To_Destination() {
        System.out.println("From_to_Destination: "+o.getFrom_to_Destination());
    }
}
