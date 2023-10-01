package Nodebounty_Control;

import Nodebounty_Model.Node_Model;



public class Node_Control extends Node_Model{

	
	
	public Node_Control(int a01_codigo, int a01_cpf, char a01_email, char a01_endereco, char a01_cep, char a01_rg,
			char a01_datanascimento, char a01_senha) {
		super(a01_codigo, a01_cpf, a01_email, a01_endereco, a01_cep, a01_rg, a01_datanascimento, a01_senha);
		// TODO Auto-generated constructor stub
	}

	Node_Control control = new Node_Control(a01_codigo, a01_codigo, a01_cep, a01_cep, a01_cep, a01_cep, a01_cep, a01_cep);
	
	public void inserirCliente(int sCpf) {
        control.setA01_cpf(sCpf);
}
	


	
	
}
