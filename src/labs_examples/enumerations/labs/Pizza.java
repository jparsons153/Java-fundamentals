package labs_examples.enumerations.labs;

enum PizzaStatus {
    //ADD THE STATUSES
    ORDERED,
    MAKING,
    READY,
    DELIVERED
}


public class Pizza{
    private PizzaStatus status;

    public boolean isDeliverable() {
        // COMPLETE SO THAT THIS RETURNS TRUE WHEN STATUS IS READY
        if(getStatus() == PizzaStatus.READY){
            return true;
        }
        else return false;
        }



    public void setStatus(PizzaStatus status){
        this.status = status;
    }

    public PizzaStatus getStatus(){
        return this.status;
    }

}
