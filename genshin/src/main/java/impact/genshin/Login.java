package impact.genshin;

import java.util.ArrayList;
import java.util.List;

public class Login extends Cadastro{

    private String emailLogin;
    private String senhaLogin;

    public Login(String nomeUsuario, String email, String senha, String numeroCelular, String emailLogin, String senhaLogin) {
        super(nomeUsuario, email, senha, numeroCelular);
        this.emailLogin = emailLogin;
        this.senhaLogin = senhaLogin;
    }

    public Login(String emailLogin, String senhaLogin) {
        this.emailLogin = emailLogin;
        this.senhaLogin = senhaLogin;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }

    public Cadastro validarLogin(List<Cadastro> cadastros) {

        for (Cadastro cadastro : cadastros) {

            if (cadastro.getEmail() != null && cadastro.getSenha() != null && cadastro.getEmail().equals(emailLogin) && cadastro.getSenha().equals(senhaLogin)) {
                return cadastro;
            }
        }
        return null;
    }


}
