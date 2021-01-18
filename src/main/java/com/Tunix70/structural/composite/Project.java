package main.java.com.Tunix70.structural.composite;

public class Project {
    public static void main(String[] args) {
        DistillGroup distillGroup = new DistillGroup();

        Distiller bourbon = new BourbonDistiller();
        Distiller whiskey = new WhiskeyDistiller();

        distillGroup.addDistiller(bourbon);
        distillGroup.addDistiller(whiskey);

        distillGroup.createRealises();

    }
}
