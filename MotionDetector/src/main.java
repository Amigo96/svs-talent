import at.AlarmTrigger;
import at.ConsoleAlarmChannel;
import icd.ConsoleImageCaptureDevice;
import icd.ImageCaptureDevice;
import md.MotionDetector;
import md.MotionDetectorAdapter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class main {


    public static  void  main(String[] args){
        ConsoleAlarmChannel consoleAlarmChannel = new ConsoleAlarmChannel();
        ConsoleImageCaptureDevice consoleImageCaptureDevice =
                new ConsoleImageCaptureDevice();

        MotionDetector motionDetector = new MotionDetector(consoleImageCaptureDevice, consoleAlarmChannel);

        MotionDetectorAdapter motionDetectorAdapter =
                new MotionDetectorAdapter(motionDetector);


        System.out.println("Main terminated here!");
    }
}
