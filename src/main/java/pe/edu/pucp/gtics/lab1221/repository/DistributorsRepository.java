package pe.edu.pucp.gtics.lab1221.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pucp.gtics.lab1221.entity.Distributors;

import java.util.List;

@Repository
public interface DistributorsRepository extends JpaRepository<Distributors, Integer> {
    @Query(nativeQuery = true,value = "select * from distribuidoras order by nombre;")
    List<Distributors> listarDistributorsPorNombre();

}
