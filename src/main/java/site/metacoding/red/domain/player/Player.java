package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
	private Integer id;
	private String name;
	private String position;
	private Integer teamId;
	private Boolean isOuter;
	private Timestamp createdAt;
}
