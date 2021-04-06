package Java2.Lesson6.online;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен, ожидаем подключения!");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился!");
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String clientRequest = dataInputStream.readUTF();
                if (clientRequest.equals("end")) break;
                System.out.println("Получили от клиента запрос: " + clientRequest);
                dataOutputStream.writeUTF("Ответ за запрос клиента: " + clientRequest);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
