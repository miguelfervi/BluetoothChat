package com.example.android.bluetoothchat;

/**
 * Constantes que se usarán entre {@link BluetoothChatService} y UI.
 */
public interface Constants {

    // Tipos de mensajes enviados por el handler BluetoothChatService
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_READ = 2;
    public static final int MESSAGE_WRITE = 3;
    public static final int MESSAGE_DEVICE_NAME = 4;
    public static final int MESSAGE_TOAST = 5;

    // Nombres recibidos por el handler BluetoothChatService
    public static final String DEVICE_NAME = "device_name";
    public static final String TOAST = "toast";

}
