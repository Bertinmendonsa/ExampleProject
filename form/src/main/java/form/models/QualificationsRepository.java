package form.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationsRepository extends CrudRepository<Qualifications,Integer> {

}
