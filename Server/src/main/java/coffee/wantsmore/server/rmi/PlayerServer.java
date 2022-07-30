package coffee.wantsmore.server.rmi;

import coffee.wantsmore.dto.PlayerDTO;
import coffee.wantsmore.rmi.PlayerRMI;
import coffee.wantsmore.server.player.Player;
import coffee.wantsmore.server.player.Players;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Optional;
import java.util.logging.Logger;

public class PlayerServer extends UnicastRemoteObject implements PlayerRMI
{
    private static final Logger logger = Logger.getLogger(PlayerServer.class.getName());

    public PlayerServer() throws RemoteException
    {
        super();
    }

    @Override
    public PlayerDTO createPlayer(String name)
    {
        Player player = new Player(Players.getInstance().nextId(), name);
        Players.getInstance().putPlayer(player);
        logger.info("Creating player named " + player.getName() + "#" + player.getId());
        return player.toDTO();
    }

    @Override
    public PlayerDTO getPlayer(long id)
    {
        return Players.getInstance().getPlayer(id).map(Player::toDTO).orElse(null);
    }
}
