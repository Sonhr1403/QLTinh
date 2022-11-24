package udqlkhtinh.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import udqlkhtinh.model.Province;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}
