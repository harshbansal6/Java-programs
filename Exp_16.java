//RMI Server Program

import java.rmi.*; 
import java.rmi.server.*;
import java.rmi.registry.*; 

interface Hello extends Remote 
{  
   void printMsg() throws RemoteException;  
} 

class ImplExample implements Hello 
{  
   	public void printMsg() 
	{  
      		System.out.println(" Client called : This is an example RMI program");  
   	}  
} 

class Server extends ImplExample 
{ 
   	public Server() 
	{
	} 
   	public static void main(String args[]) 
	{ 
      		try 
		{ 
         			ImplExample obj = new ImplExample(); 
   			Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);  
         			Registry registry = LocateRegistry.getRegistry(); 
         			registry.bind("Hello", stub);  
         			System.err.println("Server ready"); 
      		} 
		catch (Exception e) 
		{ 
         			System.err.println("Server exception: " + e.toString()); 
        			e.printStackTrace(); 
      		} 
   	} 
} 

public class Client 
{  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         Hello stub = (Hello) registry.lookup("Hello"); 
    
         // Calling the remote method using the obtained object 
         stub.printMsg(); 
         
         // System.out.println("Remote method invoked"); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}

