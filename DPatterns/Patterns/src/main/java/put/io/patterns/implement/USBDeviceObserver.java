package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver {
    private int lastUsbDeviceCount = -1;

    @Override
    public void update(SystemState lastSystemState) {
        int currentUsbDevices = lastSystemState.getUsbDevices();
        if (lastUsbDeviceCount != -1 && currentUsbDevices != lastUsbDeviceCount) {
            System.out.println("The number of USB devices has changed! Before: " + lastUsbDeviceCount + ", now: " + currentUsbDevices);
        }
        lastUsbDeviceCount = currentUsbDevices;
    }
}
