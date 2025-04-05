import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {

	private String nome;
	private List<IConta> contas = new ArrayList<>();

}
