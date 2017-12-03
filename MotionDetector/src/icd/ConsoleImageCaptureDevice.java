package icd;

import java.io.ByteArrayOutputStream;

public class ConsoleImageCaptureDevice implements ImageCaptureDevice {
    public ConsoleImageCaptureDevice() {
        System.out.println("ConsoleImageCaptureDevice!! constructor called");
    }

    public ByteArrayOutputStream makeImage() {
        return new ByteArrayOutputStream(123456);
    }
}
