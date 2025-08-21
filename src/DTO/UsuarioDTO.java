package DTO;


public class UsuarioDTO {
    
    private int id_usuario;
    private String Nome_usuario, Senha_usuario;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return Nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.Nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return Senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.Senha_usuario = senha_usuario;
    }
}
