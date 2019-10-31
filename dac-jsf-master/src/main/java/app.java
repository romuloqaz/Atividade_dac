import beans.CadastroPessoasBean;
import br.edu.ifpb.domain.Dependente;
import br.edu.ifpb.domain.Pessoa;

public class app {
    public static void main(String[] args) {

        CadastroPessoasBean cadastroPessoasBean = new CadastroPessoasBean();

        System.out.println(cadastroPessoasBean.getLista());

    }
}
