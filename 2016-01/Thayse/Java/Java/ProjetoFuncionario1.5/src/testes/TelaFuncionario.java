package testes;


import funcionario.Endereco;
import funcionario.FuncionarioAbstrato;
import funcionario.FuncionarioComissionado;
import funcionario.FuncionarioFixo;
import funcionario.FuncionarioHorista;
import static java.lang.String.format;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thayse
 */
public class TelaFuncionario {
    private FuncionarioAbstrato funcionario;
    private FuncionarioFixo funcionarioFixo;
    private FuncionarioHorista funcionarioHorista;
    private FuncionarioComissionado funcionarioComissionado;
    
    protected static Scanner scan = new Scanner(System.in);
    
    
    
    //construtor
    public TelaFuncionario(FuncionarioFixo ffixo, FuncionarioHorista fH, FuncionarioComissionado fC) {
        this.setFuncionarioFixo(ffixo);
        this.setFuncionarioHorista(fH);
        this.setFuncionarioComissionado(fC);
    }

    TelaFuncionario() {
       
    }
    
    //getters e settes
    public void setFuncionarioHorista(FuncionarioHorista fH) {
        this.funcionarioHorista = fH;
    }
    
    public FuncionarioHorista getFuncionarioHorista() {
        return this.funcionarioHorista;
    }
    
    public void setFuncionarioFixo (FuncionarioFixo f) {
        this.funcionarioFixo = f;
    }
    
    public FuncionarioFixo getFuncionarioFixo() {
        return this.funcionarioFixo;
    }
    
    public void setFuncionarioComissionado(FuncionarioComissionado fC) {
        this.funcionarioComissionado = fC;
    }
    
    public FuncionarioComissionado getFuncionarioComissionado() {
        return this.funcionarioComissionado;
    }
    
    //transformar formato dos números
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    //transformar data para string
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    //métodos
    
    //Funcionário Horista
    public FuncionarioAbstrato leNomeH() {
        System.out.println("Digite o nome do funcionário horista: \n");
        String name = scan.nextLine();
        funcionarioHorista.setNome(name);
        return funcionario;
    }
    
    public FuncionarioAbstrato leSexoH() {
        System.out.println("Digite o gênero: \n");
        char sexo = scan.next().charAt(0);
        funcionarioHorista.setSexo(sexo);
        return funcionario;
    }
    
    public FuncionarioAbstrato leCpfH() {
        System.out.println("Digite o cpf: \n");
        scan.nextLine();
        String cpf = scan.nextLine();
        funcionarioHorista.setCpf(cpf);
        return funcionario;
    }
    
    public FuncionarioAbstrato leDataH() throws ParseException {
        System.out.println("Digite a sua data de nascimento no seguinte formato: dia/mês/ano \n");
        String string = scan.nextLine();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = format.parse(string);
        funcionarioHorista.setDate(date);
        return funcionario;
    }
    
    public FuncionarioAbstrato leEnderecoH() {
        System.out.println("Endereço. \n Digite a rua: \n");
        String rua = scan.nextLine();
        Endereco e = new Endereco();
        e.setRua(rua);
        System.out.println("Digite o número: \n");
        int num = scan.nextInt();
        scan.nextLine();
        e.setNumero(num);
        System.out.println("Digite o bairro: \n");
        String bairro = scan.nextLine();
        e.setBairro(bairro);
        System.out.println("Digite a cidade: \n");
        String cid = scan.nextLine();
        e.setCidade(cid);
        funcionarioHorista.setEndereco(e);
        return funcionario;
    }
    
    public FuncionarioAbstrato leSalarioPorHora() {
        System.out.println("Digite o salário por hora do funcionário. \n");
        float sal = scan.nextFloat();
        scan.nextLine();
        //grava o salario em uma string formatada com ','
        String s = nf.format(sal);
        try {
            //Transforma de String para float.      
            sal = nf.parse(s).floatValue();
            funcionarioHorista.setSalarioPorHora(sal);
          }
          catch (ParseException e){
            System.out.println(e.getMessage());
          }
        
        return funcionario;
    }
    
    public FuncionarioAbstrato leHorasTrabalhadas() {
        System.out.println("Digite o número de horas trabalhadas. \n");
        float sal = scan.nextFloat();
        scan.nextLine();
        String s = nf.format(sal);
        try {     
            sal = nf.parse(s).floatValue();
            funcionarioHorista.setHorasTrabalhadas(sal);
          }
          catch (ParseException e){
            System.out.println(e.getMessage());
          }
        
        return funcionario;
    }
    
    //Funcionário Fixo
    public FuncionarioAbstrato leNomeFixo() {
        System.out.println("Digite o nome do funcionário fixo: \n");
        String name = scan.nextLine();
        funcionarioFixo.setNome(name);
        return funcionario;
    }
    
    public FuncionarioAbstrato leSexoFixo() {
        System.out.println("Digite o gênero: \n");
        char sexo = scan.next().charAt(0);
        funcionarioFixo.setSexo(sexo);
        return funcionario;
    }
    
    public FuncionarioAbstrato leCpfFixo() {
        System.out.println("Digite o cpf: \n");
        scan.nextLine();
        String cpf = scan.nextLine();
        funcionarioFixo.setCpf(cpf);
        return funcionario;
    }
    
    public FuncionarioAbstrato leDataFixo() throws ParseException {
        System.out.println("Digite a sua data de nascimento no seguinte formato: dia/mês/ano \n");
        String string = scan.nextLine();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = format.parse(string);
        funcionarioFixo.setDate(date);
        return funcionario;
    }
    
    public FuncionarioAbstrato leEnderecoFixo() {
        System.out.println("Endereço. \n Digite a rua: \n");
        String rua = scan.nextLine();
        Endereco e = new Endereco();
        e.setRua(rua);
        System.out.println("Digite o número: \n");
        int num = scan.nextInt();
        scan.nextLine();
        e.setNumero(num);
        System.out.println("Digite o bairro: \n");
        String bairro = scan.nextLine();
        e.setBairro(bairro);
        System.out.println("Digite a cidade: \n");
        String cid = scan.nextLine();
        e.setCidade(cid);
        funcionarioFixo.setEndereco(e);
        return funcionario;
    }
    
    public FuncionarioAbstrato leSalarioFixo() {
        System.out.println("Digite o salário do funcionário. \n");
        float sal = scan.nextFloat();
        scan.nextLine();
        String s = nf.format(sal);
        try {     
            sal = nf.parse(s).floatValue();
            funcionarioFixo.setSalario(sal);
          }
          catch (ParseException e){
            System.out.println(e.getMessage());
          }
        
        return funcionario;
    }
    
    //Funcionário Comissionado
    public FuncionarioAbstrato leNomeC() {
        System.out.println("Digite o nome do funcionário comissionado: \n");
        String name = scan.nextLine();
        funcionarioComissionado.setNome(name);
        return funcionario;
    }
    
    public FuncionarioAbstrato leSexoC() {
        System.out.println("Digite o gênero: \n");
        char sexo = scan.next().charAt(0);
        funcionarioComissionado.setSexo(sexo);
        return funcionario;
    }
    
    public FuncionarioAbstrato leCpfC() {
        System.out.println("Digite o cpf: \n");
        scan.nextLine();
        String cpf = scan.nextLine();
        funcionarioComissionado.setCpf(cpf);
        return funcionario;
    }
    
    public FuncionarioAbstrato leDataC() throws ParseException {
        System.out.println("Digite a sua data de nascimento no seguinte formato: dia/mês/ano \n");
        String string = scan.nextLine();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = format.parse(string);
        funcionarioComissionado.setDate(date);
        return funcionario;
    }
    
    public FuncionarioAbstrato leEnderecoC() {
        System.out.println("Endereço. \n Digite a rua: \n");
        String rua = scan.nextLine();
        Endereco e = new Endereco();
        e.setRua(rua);
        System.out.println("Digite o número: \n");
        int num = scan.nextInt();
        scan.nextLine();
        e.setNumero(num);
        System.out.println("Digite o bairro: \n");
        String bairro = scan.nextLine();
        e.setBairro(bairro);
        System.out.println("Digite a cidade: \n");
        String cid = scan.nextLine();
        e.setCidade(cid);
        funcionarioComissionado.setEndereco(e);
        return funcionario;
    }
    
    public FuncionarioAbstrato leSalarioBase() {
        System.out.println("Digite o salário base. \n");
        float sal = scan.nextFloat();
        scan.nextLine();
        String s = nf.format(sal);
        try {     
            sal = nf.parse(s).floatValue();
            funcionarioComissionado.setSalarioBase(sal);
          }
          catch (ParseException e){
            System.out.println(e.getMessage());
          }
        
        return funcionario;
    }
    
    public FuncionarioAbstrato leValorVendas() {
        System.out.println("Digite o valor de vendas. \n");
        float val = scan.nextFloat();
        scan.nextLine();
        String s = nf.format(val);
        try {     
            val = nf.parse(s).floatValue();
            funcionarioComissionado.setValorVendas(val);
          }
          catch (ParseException e){
            System.out.println(e.getMessage());
          }
        
        return funcionario;
    }
    
    public FuncionarioAbstrato lePorcentagemComissao() {
        System.out.println("Digite a porcentagem de comissão. \n");
        float p = scan.nextFloat();
        scan.nextLine();
        String s = nf.format(p);
        try {     
            p = nf.parse(s).floatValue();
            funcionarioComissionado.setPorcentagemComissao(p);
          }
          catch (ParseException e){
            System.out.println(e.getMessage());
          }
        
        
        return funcionario;
    }
    
    //métodos
    
    
    
    public void leDados(FuncionarioAbstrato f) throws ParseException {
        //Funcionário Fixo
        leNomeFixo();
        leSexoFixo();
        leCpfFixo();
        leDataFixo();
        leEnderecoFixo();
        leSalarioFixo();
        //Funcionário Horista
        leNomeH();
        leSexoH();
        leCpfH();
        leDataH();
        leEnderecoH();
        leSalarioPorHora();
        leHorasTrabalhadas();
        //Funcionario Comissionado
        leNomeC();
        leSexoC();
        leCpfC();
        leDataC();
        leEnderecoC();
        leSalarioBase();
        leValorVendas();
        lePorcentagemComissao();
    
    }
    public void mostraDados(FuncionarioAbstrato f) {
        
        //Funcionário Fixo
        System.out.println("----------------------------------");
        System.out.println("Dados do Funcionário Fixo:");
        System.out.println("----------------------------------");
        System.out.println("Nome: " + funcionarioFixo.getNome());
        System.out.println("Sexo: " + funcionarioFixo.getSexo());
        System.out.println("CPF: " + funcionarioFixo.getCpf());
        System.out.println("Data de Nascimento: " +  df.format(funcionarioFixo.getDate()));
        System.out.println("\n Endereço: \n");
        System.out.println("Rua: " + funcionarioFixo.getEndereco().getRua());
        System.out.println("Número: " + funcionarioFixo.getEndereco().getNumero());
        System.out.println("Bairro: " + funcionarioFixo.getEndereco().getBairro());
        System.out.println("Cidade: " + funcionarioFixo.getEndereco().getCidade());
        System.out.println("----------------------------------");
        System.out.println("Salário Bruto:             " + nf.format(funcionarioFixo.getSalario()));
        System.out.println("Taxa INSS:                   " + funcionarioFixo.txINSS()*100 + "%");
        System.out.println("Valor do INSS:               " + nf.format(funcionarioFixo.valorINSS()));
        System.out.println("                   ---------------");
        System.out.println("Salário Líquido:            " + nf.format(funcionarioFixo.salarioLiquido()));
        System.out.println("----------------------------------");
        
        //Funcionário Horista
        System.out.println("----------------------------------");
        System.out.println("Dados do Funcionário Horista:");
        System.out.println("----------------------------------");
        System.out.println("Nome: " + funcionarioHorista.getNome());
        System.out.println("Sexo: " + funcionarioHorista.getSexo());
        System.out.println("CPF: " + funcionarioHorista.getCpf());
        System.out.println("Data de Nascimento: " + df.format(funcionarioHorista.getDate()));
        System.out.println("\n Endereço: \n");
        System.out.println("Rua: " + funcionarioHorista.getEndereco().getRua());
        System.out.println("Número: " + funcionarioHorista.getEndereco().getNumero());
        System.out.println("Bairro: " + funcionarioHorista.getEndereco().getBairro());
        System.out.println("Cidade: " + funcionarioHorista.getEndereco().getCidade());
        System.out.println("----------------------------------");
        System.out.println("Horas Trabalhadas:             " + nf.format(funcionarioHorista.getHorasTrabalhadas()));
        System.out.println("Salário por Hora:             " + nf.format(funcionarioHorista.getSalarioPorHora()));
        System.out.println("Salário Bruto:             " + nf.format(funcionarioHorista.salarioBruto()));
        System.out.println("Taxa INSS:                   " + funcionarioHorista.txINSS()*100 + "%");
        System.out.println("Valor do INSS:               " + nf.format(funcionarioHorista.valorINSS()));
        System.out.println("                   ---------------");
        System.out.println("Salário Líquido:            " + nf.format(funcionarioHorista.salarioLiquido()));
        System.out.println("----------------------------------");
        
        
        //Funcionário Comissionado
        System.out.println("----------------------------------");
        System.out.println("Dados do Funcionário Comissionado:");
        System.out.println("----------------------------------");
        System.out.println("Nome: " + funcionarioComissionado.getNome());
        System.out.println("Sexo: " + funcionarioComissionado.getSexo());
        System.out.println("CPF: " + funcionarioComissionado.getCpf());
        System.out.println("Data de Nascimento: " + df.format(funcionarioComissionado.getDate()));
        System.out.println("\n Endereço: \n");
        System.out.println("Rua: " + funcionarioComissionado.getEndereco().getRua());
        System.out.println("Número: " + funcionarioComissionado.getEndereco().getNumero());
        System.out.println("Bairro: " + funcionarioComissionado.getEndereco().getBairro());
        System.out.println("Cidade: " + funcionarioComissionado.getEndereco().getCidade());
        System.out.println("----------------------------------");
        System.out.println("Salário Base:             " + nf.format(funcionarioComissionado.getSalarioBase()));
        System.out.println("Porcentagem Comissão:             " + nf.format(funcionarioComissionado.getPorcentagemComissao()));
        System.out.println("Valor de Vendas:             " + nf.format(funcionarioComissionado.getValorVendas()));
        System.out.println("Salário Bruto:             " + nf.format(funcionarioComissionado.salarioBruto()));
        System.out.println("Taxa INSS:                   " + funcionarioComissionado.txINSS()*100 + "%");
        System.out.println("Valor do INSS:               " + nf.format(funcionarioComissionado.valorINSS()));
        System.out.println("                   ---------------");
        System.out.println("Salário Líquido:            " + nf.format(funcionarioComissionado.salarioLiquido()));
        System.out.println("----------------------------------");
        
    }
}
