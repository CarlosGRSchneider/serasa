package br.com.serasa.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;

@RestController
@RequestMapping("/consulta-credito")
public class ConsultaCredito {

    @Autowired
    private ConsultaService service;

    private static final Pattern PATTERN = Pattern.compile("-?\\d+(\\.\\d+)?");

    @PostMapping
    public ResponseEntity<String> consultaPessoaPorCpf(@RequestBody Request request) {

        System.out.println(request.getCpf());

        if(request.getCpf() == null || !PATTERN.matcher(request.getCpf()).matches()) {
            return ResponseEntity.badRequest().body("O cpf enviado não é valido!");
        }
        if(request.getCpf().length() != 11) {
            return ResponseEntity.unprocessableEntity().body("O cpf precisa ter 11 digitos!");
        }

        boolean consulta = service.realizaConsulta(request.getCpf());

        return consulta ? ResponseEntity.ok().body("APROVADO") : ResponseEntity.ok().body("REPROVADO");
    }
}
