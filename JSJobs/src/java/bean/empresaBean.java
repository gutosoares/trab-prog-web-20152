package bean;

import classes.Empresa;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.view.ViewScoped;


@Named(value = "empresaBean")
@ViewScoped
public class empresaBean implements Serializable {
    Empresa empresa = new Empresa();

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public void testarDados(){
        System.out.println(empresa.getNomeEmpresa() + empresa.getSenha());
    }
    
    public void realizarCadastro(){
        
    }
    
    
    
}
