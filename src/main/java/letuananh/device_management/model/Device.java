package letuananh.device_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Device {
	private String deviceId;
	private String deviceName;
	private String deviceModel;
}
