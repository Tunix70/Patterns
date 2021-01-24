package main.java.com.Tunix70.behavioral.visitor;

public class Model implements ProjectElement{
    ProjectElement [] projectElements;

    public Model() {
        this.projectElements = new ProjectElement[]{
                new Bicycle(),
                new Auto(),
                new Plane()
        };
    }

    @Override
    public void move(Person person) {
        for(ProjectElement pE : projectElements){
            pE.move(person);
        }
    }
}
