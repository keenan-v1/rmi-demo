package coffee.wantsmore.server.player;

import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public enum Players
{
    INSTANCE;

    private final ConcurrentMap<Long, Player> playersById = new ConcurrentHashMap<>();

    public static Players getInstance()
    {
        return INSTANCE;
    }

    public long nextId()
    {
        return playersById
                .keySet()
                .stream().max(Comparator.comparingLong(a -> a))
                .orElse(0L) + 1L;
    }

    public Optional<Player> getPlayer(final long id)
    {
        return Optional.ofNullable(playersById.get(id));
    }

    public void putPlayer(final Player player)
    {
        playersById.put(player.getId(), player);
    }
}
