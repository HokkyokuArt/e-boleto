package br.com.hjv.eboleto.service;
import br.com.hjv.eboleto.core.CrudService;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.repository.ClienteRepository;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends CrudService<Cliente, Long> {

    @Autowired
    protected ClienteRepository clienteRepository;

    @Override
    protected Cliente editarEntidade(Cliente recuperado, Cliente entidade) {
        recuperado.setRazaosocialnome(entidade.getRazaosocialnome());
        recuperado.setCnpjcpf(entidade.getCnpjcpf());
        recuperado.setIerg(entidade.getIerg());
        recuperado.setLogradouro(entidade.getLogradouro());
        recuperado.setNumero(entidade.getNumero());
        recuperado.setBairro(entidade.getBairro());
        recuperado.setComplemento(entidade.getComplemento());
        recuperado.setCep(entidade.getCep());
        recuperado.setCidade(entidade.getCidade());
        recuperado.setEstado(entidade.getEstado());
        recuperado.setEmail(entidade.getEmail());
        recuperado.setTelefone(entidade.getTelefone());
        recuperado.setContato(entidade.getContato());
        // recuperado.setSenha(entidade.getSenha());

        return recuperado;
    }

    public Cliente autenticacaoUsuario(String email, String senha){
        var recuperado = clienteRepository.autenticacaoUser(email, senha);
        if(Objects.isNull(recuperado)){
           return null;
        } else {
            return recuperado;
        }
    };

}
