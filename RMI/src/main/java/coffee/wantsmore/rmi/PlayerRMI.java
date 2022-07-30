package coffee.wantsmore.rmi;

import coffee.wantsmore.dto.PlayerDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Optional;

public interface PlayerRMI extends Remote
{
    // Sends a player
    PlayerDTO createPlayer(final String name) throws RemoteException;
    PlayerDTO getPlayer(final long id) throws RemoteException;
}
