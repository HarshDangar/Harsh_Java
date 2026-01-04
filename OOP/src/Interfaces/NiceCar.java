package Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
        // Here it is calling start written in engine
    }

    public void stop(){
        engine.stop();
    }

    public void accelerate(){
        engine.acc();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
