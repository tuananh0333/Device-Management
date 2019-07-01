package letuananh.device_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Model {
	private String modelId;
	private String modelName;
	private String categoryId;
}
