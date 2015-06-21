package net.leandroabreu.springbootmongorestex;

import org.springframework.data.annotation.Id;

public class Contato {
	
	@Id
	private String id;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String twitterHandle;
	private String facebookProfile;
	private String linkedInProfile;
	private String googlePlusProfile;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTwitterHandle() {
		return twitterHandle;
	}
	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}
	public String getFacebookProfile() {
		return facebookProfile;
	}
	public void setFacebookProfile(String facebookProfile) {
		this.facebookProfile = facebookProfile;
	}
	public String getLinkedInProfile() {
		return linkedInProfile;
	}
	public void setLinkedInProfile(String linkedInProfile) {
		this.linkedInProfile = linkedInProfile;
	}
	public String getGooglePlusProfile() {
		return googlePlusProfile;
	}
	public void setGooglePlusProfile(String googlePlusProfile) {
		this.googlePlusProfile = googlePlusProfile;
	}
	
	
}
