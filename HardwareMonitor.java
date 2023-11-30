package flipper;

import java.util.Timer;
import java.util.TimerTask;

public class HardwareMonitor {

    private static final int UPDATE_INTERVAL = 1000; // En milisegundos

    private JNativeHook jNativeHook;
    private BlueCove blueCove;

    public HardwareMonitor() {
        jNativeHook = new JNativeHook();
        jNativeHook.registerNativeHook();

        blueCove = new BlueCove();
        // Conectarse al Flipper Zero
    }

    public void start() {
        // Iniciar el temporizador para actualizar los datos
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Actualizar los datos del hardware
                // Enviar los datos al Flipper Zero
            }
        }, 0, UPDATE_INTERVAL);
    }

    public static void main(String[] args) {
        new HardwareMonitor().start();
    }
}
