
class Phone{
    public void call() {
        System.out.println("Making Phone Call");
    }
    public void sms(){
        System.out.println("Phone Sending SMS");
    }
}

interface ICamera{
    void clickPhoto();
    void recordVideo();
}

interface IMusicPlayer{
    void playMusic();
    void stopMusic();
}

class Smartphone extends Phone implements ICamera, IMusicPlayer{
    public void videoCall(){
        System.out.println("Smartphone Video Calling");
    }

    @Override
    public void clickPhoto() {
        System.out.println("Smartphone Clicking Photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Smartphone Recording Video");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone Playing Music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smartphone Stopping Music");
    }
}


public class Main {
    public static void main(String[] args) {

       Smartphone smartphoneObj = new Smartphone();
       smartphoneObj.videoCall();
       smartphoneObj.call();
       smartphoneObj.sms();
       smartphoneObj.clickPhoto();
       smartphoneObj.recordVideo();
       smartphoneObj.playMusic();
       smartphoneObj.stopMusic();
//        smartphoneObj can access all above method

        System.out.println();

        // Here we use Smartphone as Phone, So only Phone class methods are accessible
        Phone phoneRef = new Smartphone();
        phoneRef.call();
        phoneRef.sms();
//        phoneRef can only access above method

        System.out.println();

        // Here we use Smartphone as Camera, So only ICamera interface methods are accessible
        ICamera cameraObj = new Smartphone();
        cameraObj.clickPhoto();
        cameraObj.recordVideo();
//        cameraObj can only access above method

        System.out.println();

        // Here we use Smartphone as Music Player, So only IMusicPlayer interface methods are accessible
        IMusicPlayer musicPlayerObj = new Smartphone();
        musicPlayerObj.playMusic();
        musicPlayerObj.stopMusic();
//        musicPlayerObj can only access above method


    }
}