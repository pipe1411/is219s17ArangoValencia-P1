package is219s17arangovalenciap1;

import is219s17arangovalenciap1.Resume;

/**
 * Created by pipe on 2/22/17.
 */
public interface ResumeService {
    Iterable<Resume> listAllProducts();

    Resume getResumeById(Integer id);

    Resume saveResume(Resume resume);

    void deleteResume(Integer id);
}
