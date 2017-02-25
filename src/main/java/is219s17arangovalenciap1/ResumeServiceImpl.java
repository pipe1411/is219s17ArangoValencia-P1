package is219s17arangovalenciap1;

import is219s17arangovalenciap1.Resume;
import is219s17arangovalenciap1.ResumeRepository;
import is219s17arangovalenciap1.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pipe on 2/22/17.
 */

@Service
public class ResumeServiceImpl implements ResumeService {
    private ResumeRepository resumeRepository;

    @Autowired
    public void setResumeRepository(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    @Override
    public Iterable<Resume> listAllProducts() {
        return resumeRepository.findAll();
    }

    @Override
    public Resume getResumeById(Integer id) {
        return resumeRepository.findOne(id);
    }

    @Override
    public Resume saveResume(Resume resume) {
        return resumeRepository.save(resume);
    }

    @Override
    public void deleteResume(Integer id) {
        resumeRepository.delete(id);
    }
}
