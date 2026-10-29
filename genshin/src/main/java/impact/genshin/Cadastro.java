package impact.genshin;

public class Cadastro extends Id{

    private String nomeUsuario;
    private String email;
    private String senha;
    private String numeroCelular;

    public Cadastro(String nomeUsuario, String email, String senha, String numeroCelular) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.numeroCelular = numeroCelular;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", numeroCelular=" + numeroCelular +
                '}';
    }

    public Cadastro() {
    }

    public void novaSenha(String senha) {
        this.senha = senha;
    }


}
