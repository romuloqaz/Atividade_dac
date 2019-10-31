package beans;

import br.edu.ifpb.domain.Dependente;
import br.edu.ifpb.domain.Pessoa;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@ManagedBean
@SessionScoped
public class CadastroPessoasBean implements Serializable {
    private Pessoa pessoaSelecionada;
    private Dependente dependente;
    private List<Pessoa> lista;

   public CadastroPessoasBean(){
    pessoaSelecionada = new Pessoa();
    dependente = new Dependente();
       Dependente dependente = new Dependente(15,"nome","28/29/29");
       Pessoa pessoa = new Pessoa(20,"teste pessoa","11111111",dependente);
    lista = new ArrayList<Pessoa>();


    for (int x = 0;x<10;x++){
        Pessoa p = new Pessoa();
        p.setId(x);
        p.setNome(String.format("Fulano %02d",x));
        p.setCpf(String.format("111.111.111-%02d",x));

        lista.add(p);
    }
   }
   public String cancelar(){
       return "inicio";
   }

   public void editar(){
       if (!lista.contains(pessoaSelecionada)){
           lista.add(pessoaSelecionada);
       }
   }
   public void limpar(){
       pessoaSelecionada = new Pessoa();
   }

    public void salvar() {
        int id = lista.size();
        pessoaSelecionada.setId(id);
        lista.add(pessoaSelecionada);
//instanciado uma nova para ser cadastrada
        pessoaSelecionada = new Pessoa();

    }

    public void excluir(){
       lista.remove(pessoaSelecionada);
       pessoaSelecionada = new Pessoa();
    }

    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }

    public String searchCpf(String cpf) {
        String lista ="";
        for (int c = 0; c<this.lista.size();c++){
            Pessoa pessoa = this.lista.get(c);
            if (pessoa.getCpf().equalsIgnoreCase(cpf))
                lista+=pessoa.getNome();;
    }
        System.out.println(lista);
    return lista;
   }
}
