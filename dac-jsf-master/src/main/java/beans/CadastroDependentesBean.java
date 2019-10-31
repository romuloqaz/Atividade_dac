package beans;

import br.edu.ifpb.domain.Dependente;
import br.edu.ifpb.domain.Pessoa;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class CadastroDependentesBean implements Serializable {
    private Dependente dependenteSelecionado;
    private List<Dependente> lista;

    public CadastroDependentesBean(){
        dependenteSelecionado = new Dependente();
        lista = new ArrayList<Dependente>();


        for (int x = 0;x<10;x++){
            Dependente d = new Dependente();
            d.setUuid(x);
            d.setNome(String.format("Fulano dependente %02d",x));
            d.setDataDeNascimento(String.format("%02d/22/22",x));
            lista.add(d);
        }
    }

    public void editar(){
        if (!lista.contains(dependenteSelecionado)){
            lista.add(dependenteSelecionado);
        }
    }

    public void limpar(){
        dependenteSelecionado = new Dependente();
    }

    public void salvar() {
        int id = lista.size();
        dependenteSelecionado.setUuid(id);
//adicionando pessoas a lista
        lista.add(dependenteSelecionado);
//instanciado uma nova para ser cadastrada
        dependenteSelecionado = new Dependente();

    }

    public void excluir(){
        lista.remove(dependenteSelecionado);
        dependenteSelecionado = new Dependente();
    }

    public Dependente getDependenteSelecionado() {
        return dependenteSelecionado;
    }

    public void setDependenteSelecionado(Dependente dependenteSelecionado) {
        this.dependenteSelecionado = dependenteSelecionado;
    }

    public List<Dependente> getLista() {
        return lista;
    }

    public void setLista(List<Dependente> lista) {
        this.lista = lista;
    }
}
