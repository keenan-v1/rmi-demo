package coffee.wantsmore.server;

import coffee.wantsmore.server.rmi.PlayerServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class App
{
    public static void main(String[] args){
        try
        {
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/RMIServer/Players", new PlayerServer());
            System.err.println("Server ready");
        }
        catch (Exception e)
        {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
