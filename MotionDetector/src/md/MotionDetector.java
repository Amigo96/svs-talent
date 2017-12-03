package md;

import at.AlarmTrigger;
import at.ConsoleAlarmChannel;
import icd.ConsoleImageCaptureDevice;
import icd.ImageCaptureDevice;

import java.io.ByteArrayOutputStream;

public class MotionDetector {
    private ImageCaptureDevice imageCaptureDevice;
    private AlarmTrigger alarmTrigger;

    public MotionDetector(ImageCaptureDevice imageCaptureDevice, AlarmTrigger alarmTrigger) {
        System.out.println("MotionDetector constructor called!");
        this.imageCaptureDevice = imageCaptureDevice;
        this.alarmTrigger = alarmTrigger;
    }
}

