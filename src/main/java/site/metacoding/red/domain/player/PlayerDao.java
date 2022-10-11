package site.metacoding.red.domain.player;

import java.util.List;

public interface PlayerDao {
	public List<Player> findAll();
	public void findById(Integer id);
	public void insert(Player team);
	public void update(Integer id, Player team);
	public void deleteById(Integer id);
}
