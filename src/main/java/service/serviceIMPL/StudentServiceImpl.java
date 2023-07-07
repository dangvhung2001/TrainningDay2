package service.serviceIMPL;

import lombok.RequiredArgsConstructor;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IStudentRepository;
import service.IStudentService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
