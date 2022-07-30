package coffee.wantsmore.dto;

import java.io.Serializable;

public class PlayerDTO implements Serializable
{
    private long id;
    private String name;

    public long getId()
    {
        return id;
    }

    public PlayerDTO setId(long id)
    {
        this.id = id;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public PlayerDTO setName(String name)
    {
        this.name = name;
        return this;
    }
}
