package com.kate;

class Electronic{
    public void start(){
        System.out.println("Electronic device is powered on!");
    }
}

class Camera extends Electronic{
    public void start(){
        System.out.println("Camera is powered on!");
    }
    public void takePic(){
        System.out.println("Photo taken.");
    }
}

public class Main {

    public static void main(String[] args) {
        Electronic electronic1 = new Electronic();
        Camera camera1 = new Camera();

        electronic1.start();
        camera1.start();
        camera1.takePic();

        //Electronic electronic2 = camera1;
        //electronic2.start();

        //downcasting
       /* Electronic electronic3 = new Camera();
        Camera camera2 = (Camera)electronic3;
        camera2.start();
        camera2.takePic();*/

       Electronic electronic4 = new Electronic();
       Camera camera3 = (Camera)electronic4;
       camera3.start();
       camera3.takePic();

    }
}
