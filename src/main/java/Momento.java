public class Momento {
    private Stats state;

    Momento(Stats state){
        this.state = state;
    }

    public Momento(){

    }

    public void setState( Stats state){
        this.state = state;
    }

    public Stats getState(){
        return state;
    }

}
