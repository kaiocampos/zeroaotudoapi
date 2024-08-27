package br.com.kaiokampos.projeto.repository;

import br.com.kaiokampos.projeto.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
