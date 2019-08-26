package br.com.sindeaux.passwd.repository;

import br.com.sindeaux.passwd.entity.DadoPessoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadoPessoalRepository extends JpaRepository<DadoPessoal, Long> {
}
