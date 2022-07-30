package coffee.wantsmore.client.player;

import coffee.wantsmore.dto.PlayerDTO;

public class Player
{
    private final long id;
    private final String name;

    public Player(final PlayerDTO playerDTO)
    {
        this.id = playerDTO.getId();
        this.name = playerDTO.getName();
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void say(final String message)
    {
        System.out.println("<" + getName() + "#" + getId() + "> " + message);
    }
}
