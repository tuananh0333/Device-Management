package letuananh.device_management.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
	private String userId;
	private String userName;
	private String password;
	private boolean isAdmin;
	private List<String> devices;
}
