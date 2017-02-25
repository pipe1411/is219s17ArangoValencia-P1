package is219s17arangovalenciap1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pipe on 2/18/17.
 */

@Repository
public interface ResumeRepository extends CrudRepository<Resume,Integer>{
}
