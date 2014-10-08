package Fachada;

import Basicas.Cliente;
import Basicas.Funcionario;
import Basicas.Pedido;
import Basicas.Produto;
import Negocio.NegCliente;
import Negocio.NegFuncionario;
import Negocio.NegPedido;
import Negocio.NegProduto;

public class Fachada {
	private static Fachada instance;
	
	private NegCliente negCliente;
	private NegFuncionario negFuncionario;
	private NegPedido negPedido;
	private NegProduto negProduto;
	
	private Fachada(){
		this.negCliente = new NegCliente();
		this.negFuncionario = new NegFuncionario();
		this.negPedido = new NegPedido();
		this.negProduto = new NegProduto();
	}
	
	public static Fachada GetInstance(){
		if(instance == null){
			instance = new Fachada();
		}
		return instance;
	}
	
	//########### CLIENTE #############
	public void ClienteInserir(Cliente c){
		this.negCliente.inserir(c);
	}
	public void ClienteAlterar(Cliente c){
		this.negCliente.alterar(c);
	}
	public Cliente ClienteBuscarPorId(int id){
		return this.negCliente.buscarPorId(id);
	}
	
	//########### FUNCIONARIO #############
	public void FuncionarioInserir(Funcionario f){
		this.negFuncionario.inserir(f);
	}
	public void FuncionarioAlterar(Funcionario f){
		this.negFuncionario.alterar(f);
	}
	public Funcionario FuncionarioBuscarPorId(int id){
		return this.negFuncionario.buscarPorId(id);
	}
	
	//########### PRODUTO #############
	public void ProdutoInserir(Produto p){
		this.negProduto.inserir(p);
	}
	public void ProdutoAlterar(Produto p){
		this.negProduto.alterar(p);
	}
	public Produto ProdutoBuscarPorId(int id){
		return this.negProduto.buscarPorId(id);
	}
	
	//########### PEDIDO #############
	public void PedidoInserir(Pedido p){
		this.negPedido.inserir(p);
	}
	public void PedidoAlterar(Pedido p){
		this.negPedido.alterar(p);
	}
	public Pedido PedidoBuscarPorId(int id){
		return this.negPedido.buscarPorId(id);
	}
	
}
