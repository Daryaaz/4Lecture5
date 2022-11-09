package lecture3;

public class LightDetectorLauncher {
    public static void main(String[] args) {
        lecture3.LightColorDetector lightColorDetector = new lecture3.LightColorDetector();
        int waveLenght = 380;
        String result = lightColorDetector.detect(waveLenght);
        System.out.println(result);
//      System.out.println(lightColorDetector.detect(waveLenght));
    }
}