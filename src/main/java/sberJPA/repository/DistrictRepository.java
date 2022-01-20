package sberJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sberJPA.model.other.District;

public interface DistrictRepository extends JpaRepository<District, Long> {
    District getDistrictByName(String name);
}
