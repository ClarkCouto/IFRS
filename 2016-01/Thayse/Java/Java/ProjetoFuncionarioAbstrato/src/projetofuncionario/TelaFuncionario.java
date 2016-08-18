/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuncionario;

import java.util.Scanner;


/**
 *
 * @author Thayse
 */
public class TelaFuncionario {
    private Funcionario funcionario;
    private FuncionarioHorista fhorista;
    private FuncionarioFixo ffixo;
    private FuncionarioComissionado fcomissionado;
    
    protected static Scanner scan = new Scanner(System.in);
    
    public TelaFuncionario(FuncionarioFixo f) {
        setFuncionarioFixo(f);

    }
    
    public TelaFuncionario(FuncionarioFixo f, FuncionarioHorista fH, FuncionarioComissionado fC) {
        setFuncionarioFixo(f);
        setFuncionarioHorista(fH);
        setFuncionarioComissionado(fC);
        
        
    }
    
    public void setFuncionarioHorista(FuncionarioHorista fH) {
        this.fhorista = fH;
    }
    
    public void setFuncionarioFixo (FuncionarioFixo f) {
        this.ffixo = f;
    }
    
    public void setFuncionarioComissionado(FuncionarioComissionado fC) {
        this.fcomissionado = fC;
    }
    
    public FuncionarioFixo getFuncionarioFixo() {
        return ffixo;
    }
    
    public FuncionarioHorista getFuncionarioHorista() {
        return fhorista;
    }
    
    public FuncionarioComissionado getFuncionarioComissionado() {
        return fcomissionado;
    }
    /*
    public void setFuncionario(Funcionario f){
        if (f==null) {
            throw new RuntimeException("Erro: funcionario null");
        } else {
            this.funcionario = f;
            
        }
    }
   
    public Funcionario getFuncionario() {
        return funcionario;
    }
    */
    public FuncionarioComissionado leNomeC() {
        System.out.println("Digite o nome do funcionário comissionado: ");
        String n = scan.nextLine();
        fcomissionado.setNome(n);
        return fcomissionado;
    }
    
    public FuncionarioComissionado leSexoC() {
        System.out.println("Digite o sexo: ");
        char sexo = scan.next().charAt(0);
        scan.nextLine();
        fcomissionado.setSexo(sexo);
        return fcomissionado;
    }
    
    public FuncionarioComissionado leCpfC() {
        System.out.println("Digite o cpf: ");
        String cpf = scan.nextLine();
        fcomissionado.setCpf(cpf);
        return fcomissionado;
    }
    
    
    public FuncionarioComissionado leEnderecoC() {
        System.out.println("Digite a rua: ");
        String r = scan.nextLine();
        Endereco e = new Endereco();
        e.setRua(r);
        System.out.println("Digite o numero: ");
        int n = scan.nextInt();
        scan.nextLine();
        e.setNumero(n);
        fcomissionado.setEndereco(e);
        
        return fcomissionado;
    }
    
    public FuncionarioComissionado leSalarioBase() {
        System.out.println("Digite o salario base: ");
        double sal = scan.nextDouble();
        scan.nextLine();
        fcomissionado.setSalarioBase(sal);
        return fcomissionado;
    }
    
    public FuncionarioComissionado leValorVendas() {
        System.out.println("Digite o valor de vendas: ");
        double v = scan.nextDouble();
        scan.nextLine();
        fcomissionado.setValorVendas(v);
        return fcomissionado;
    }
    
    public FuncionarioComissionado lePorcentagemComissao() {
        System.out.println("Digite a porcentagem (sem o %): ");
        double p = scan.nextDouble();
        scan.nextLine();
        fcomissionado.setPorcentagemComissao(p);
        return fcomissionado;
    }
    
    
    
    
    public FuncionarioHorista leNomeH() {
        System.out.println("Digite o nome do funcionario horista: ");
        String n = scan.nextLine();
        fhorista.setNome(n);
        return fhorista;
    }
    
    public FuncionarioHorista leSexoH() {
        System.out.println("Digite o sexo: ");
        char sexo = scan.next().charAt(0);
        scan.nextLine();
        fhorista.setSexo(sexo);
        return fhorista;
    }
    
    public FuncionarioHorista leCpfH() {
        System.out.println("Digite o cpf: ");
        String cpf = scan.nextLine();
        fhorista.setCpf(cpf);
        return fhorista;
    }
    
    
    public FuncionarioHorista leEnderecoH() {
        System.out.println("Digite a rua: ");
        String r = scan.nextLine();
        Endereco e = new Endereco();
        e.setRua(r);
        System.out.println("Digite o numero: ");
        int n = scan.nextInt();
        scan.nextLine();
        e.setNumero(n);
        fhorista.setEndereco(e);
        
        return fhorista;
    }
    
    public FuncionarioHorista leHorasTrabalhadas() {
        System.out.println("Digite o numero de horas trabalhadas: ");
        double horas = scan.nextDouble();
        scan.nextLine();
        fhorista.setHorasTrabalhadas(horas);
        return fhorista;
    }
    
    public FuncionarioHorista leSalarioPorHora() {
        System.out.println("Digite o salario por hora: ");
        double sal = scan.nextDouble();
        scan.nextLine();
        fhorista.setSalarioPorHora(sal);
        return fhorista;
    }
    
    public FuncionarioFixo leLimiteINSS() {
        System.out.println("Digite o limite do INSS: ");
        double lim = scan.nextDouble();
        scan.nextLine();
        ffixo.setLimiteINSS(lim);
        return ffixo;
    }
    
    public FuncionarioFixo leNome() {
        System.out.println("Digite o nome do funcionário fixo: ");
        String n = scan.nextLine();
        ffixo.setNome(n);
        return ffixo;
    }
    
    public FuncionarioFixo leSexo() {
        System.out.println("Digite o sexo: ");
        char sexo = scan.next().charAt(0);
        scan.nextLine();
        ffixo.setSexo(sexo);
        return ffixo;
    }
    
    public FuncionarioFixo leCpf() {
        System.out.println("Digite o cpf: ");
        String cpf = scan.nextLine();
        ffixo.setCpf(cpf);
        return ffixo;
    }
    
    public FuncionarioFixo leSalarioBruto() {
        System.out.println("Digite o salario bruto: ");
        double sB = scan.nextDouble();
        scan.nextLine();
        ffixo.setSalario(sB);
        return ffixo;
    }
    
    public FuncionarioFixo leEndereco() {
        System.out.println("Digite a rua: ");
        String r = scan.nextLine();
        Endereco e = new Endereco();
        e.setRua(r);
        System.out.println("Digite o numero: ");
        int n = scan.nextInt();
        scan.nextLine();
        e.setNumero(n);
        ffixo.setEndereco(e);
        
        return ffixo;
    }
    
  
    
    
    
    
}
