package br.com.serasa.consulta;

import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

    public boolean realizaConsulta(String cpf) {

        if(cpf.startsWith("2") || cpf.endsWith("0")) {
            return false;
        }

        return true;
    }
}
