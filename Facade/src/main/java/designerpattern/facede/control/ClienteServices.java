package designerpattern.facede.control;



import designerpattern.facede.model.Cliente;
import designerpattern.facede.model.ModelFacade;

import java.util.List;

public class ClienteServices {

    public List<Cliente> listarTodosClientes() {
        return ModelFacade.listarTodosClientes();

    }


}
