package site.metacoding.red.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stadium {
	private Integer id;
	private Integer no; //DBì ìë ê°
	private String name;
	private Timestamp createdAt;
}
