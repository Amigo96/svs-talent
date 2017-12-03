package md;

import at.AlarmTrigger;
import icd.ImageCaptureDevice;

import java.io.ByteArrayOutputStream;

public class MotionDetectorAdapter implements AlarmTrigger, ImageCaptureDevice {
    private MotionDetector motionDetector;

    public MotionDetectorAdapter() {
    }

    public MotionDetectorAdapter(MotionDetector motionDetector) {
        System.out.println("MotionDetectorAdapter constructor called!");
        this.motionDetector = motionDetector;

    }

    @Override
    public void report() {
        System.out.println("REPORT from MotionDetectorAdapter");

    }

    @Override
    public ByteArrayOutputStream makeImage() {
        return new ByteArrayOutputStream(12345);
    }
}
