package controllers;

import gameloop.GameLoop;
import views.View;

public class Controller extends gameloop.Controller{

    View view;

    public Controller(View view) {
        this.view = view;
        new GameLoop(this).start();
    }



    @Override
    public void tick()
    {

    }

    @Override
    public void render()
    {
        view.render();
    }
}
