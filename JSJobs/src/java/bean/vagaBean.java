package bean;

import classes.Vaga;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@Named(value = "vagaBean")
@ViewScoped
public class vagaBean implements Serializable {
    
    Vaga vaga = new Vaga();
    
    
}
