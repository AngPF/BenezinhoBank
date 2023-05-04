import br.com.benezinhobank.model.Agencia;
import br.com.benezinhobank.model.Banco;
import br.com.benezinhobank.model.ContaCorrente;
import br.com.benezinhobank.model.ContaPoupanca;
import br.com.benezinhobank.pessoa.model.PessoaFisica;
import br.com.benezinhobank.pessoa.model.PessoaJuridica;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Banco benezinho = new Banco("Benezinho Bank");

        Agencia osasco = new Agencia();
        osasco.setBannco(benezinho);
        osasco.setNome("Osasco");
        osasco.setNumero("1-9");

        PessoaFisica mae = new PessoaFisica();
        mae.setNome("Si");
        mae.setNascimento(LocalDate.of(1977,12,6));
        mae.setCPF("213345651-20");

        PessoaFisica ang = new PessoaFisica();
        ang.setCPF("243543642-12");
        ang.setNascimento(LocalDate.of(2004,01,16));
        ang.setNome("Angelo Pelluci");
        ang.setMae(mae);

        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(osasco);
        cc.setTitular(ang);
        cc.setSaldo(1_000_000.99);
        cc.setLimite(5_000_000);
        cc.setNumero("1-9");

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero("2-8");
        cp.setAniversario(4);
        cp.setAgencia(osasco);
        cp.setSaldo(500_000);
        cp.setTitular(mae);

        PessoaJuridica holding = new PessoaJuridica();
        holding.setCNPJ("22341448/0001-29");
        holding.setNascimento(LocalDate.of(1988,10,5));
        holding.setNome("Ang Holding");
        holding.setRazaoSocial("Ang Holding SA");

        ContaCorrente cch = new ContaCorrente();
        cch.setNumero("3-7");
        cch.setLimite(800_000_000);
        cch.setSaldo(1_000_000_000);
        cch.setTitular(holding);
        cch.setAgencia(osasco);

        System.out.println(cch);




    }
}