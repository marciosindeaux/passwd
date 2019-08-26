package br.com.sindeaux.passwd.repository;

import br.com.sindeaux.passwd.entity.DadosContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosContatoRepository extends JpaRepository<DadosContato, Long> {
}
