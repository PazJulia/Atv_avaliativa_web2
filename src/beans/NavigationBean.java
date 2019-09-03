package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "navigation")
@SessionScoped
public class NavigationBean {

    public String goToAtividade6(){
        return "/atividades/atividade1/atividade6.xhtml";
    }

}
