package co.pipecode.p2p.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.pipecode.p2p.example.repository.entity.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {

	public Payment findByReferencia(String referencia);

	public List<Payment> findByEstado(String estado);
}
