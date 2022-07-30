package coffee.wantsmore.client;

import coffee.wantsmore.client.player.Player;
import coffee.wantsmore.rmi.PlayerRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Optional;

public class App
{
    private static PlayerRMI playerRMI;

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException
    {
        playerRMI = (PlayerRMI) Naming.lookup("//localhost/RMIServer/Players");
        Player player1 = new Player(playerRMI.createPlayer("Rizi"));
        player1.say("Hello, world!");
        playerRMI.createPlayer("Keenan");
        Optional.ofNullable(playerRMI.getPlayer(2L)).map(Player::new).ifPresent(p -> p.say("Oh, hello!"));
    }
}
