/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cl418656
 */
public class HangmanClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("aga14", 8081);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("CIAONEE");
        } catch (IOException ex) {
            Logger.getLogger(HangmanClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
