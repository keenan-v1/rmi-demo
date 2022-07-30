package coffee.wantsmore.server.player;

import coffee.wantsmore.dto.PlayerDTO;

public class Player
{
    private final long id;
    private final String name;

    public Player(final long id, final String name)
    {
        this.id = id;
        this.name = name;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public PlayerDTO toDTO()
    {
        return new PlayerDTO()
                .setId(getId())
                .setName(getName());
    }
}
