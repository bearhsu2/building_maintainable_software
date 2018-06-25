package idv.kuma.chap06.better;


import idv.kuma.chap06.better.camera.Camera;

public class SmartPhone {

    Camera camera;

    public void takePhoto() {
        camera.zoomIn();
        camera.zoomOut();
        camera.takePhoto();
    }


    public void talk() {
    }

    public void sendMessage() {
    }


}
