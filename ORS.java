public class ORS {
    private double train_number;
    private String train_name;
    private double class_type;
    private double Date_of_journey;
    private double From_to_Destination;

    public ORS(){

    }
    public double getTrain_number(){
        return train_number;
    }

    public void setTrain_number(double train_number) {
        this.train_number = train_number;
    }
    public String getTrain_name(){
        return train_name;
    }
    public void setTrain_name(String train_name){
        this.train_name = train_name;
    }

    public double getClass_type() {
        return class_type;
    }

    public void setClass_type(double class_type) {
        this.class_type = class_type;
    }

    public double getDate_of_journey() {
        return Date_of_journey;
    }

    public void setDate_of_journey(double date_of_journey) {
        Date_of_journey = date_of_journey;
    }

    public double getFrom_to_Destination() {
        return From_to_Destination;
    }

    public void setFrom_to_Destination(double from_to_Destination) {
        From_to_Destination = from_to_Destination;
    }
}
