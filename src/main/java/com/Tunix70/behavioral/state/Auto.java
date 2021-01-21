package main.java.com.Tunix70.behavioral.state;

public class Auto {
    State state;


    public void setState(State state) {
        this.state = state;
    }

    public void changeState(){
        if(state instanceof Stop){
            setState(new Ride());
        }else if(state instanceof Ride){
            setState(new Wait());
        }else if(state instanceof Wait) {
            setState(new Stop());
        }
    }

    public void activity(){
        state.activity();
    }
}
