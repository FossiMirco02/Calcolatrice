/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;
import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Famiglia
 */
public class Cliente 
{
    public static void main(String[] args) throws IOException
    {
        String operazione;
	Scanner scanner = new Scanner(System.in);	
	Socket client = new Socket("localhost",1235);	
	DataOutputStream output = new DataOutputStream(client.getOutputStream());		
	BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
	System.out.println("Inserisci l'operazione usando gli spazi tra i numeri e l'operatore (Esempio: 1 + 1). Poi premi invio ");
	operazione = scanner.nextLine();		
	output.writeBytes(operazione + "\n");	
	System.out.println("Risultato: " + input.readLine());
	scanner.close();
	client.close();
    }
}
    