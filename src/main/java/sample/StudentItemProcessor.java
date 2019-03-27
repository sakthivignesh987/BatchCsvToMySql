package sample;

import org.springframework.batch.item.ItemProcessor;

public class StudentItemProcessor implements ItemProcessor<Student, Student> {
	@Override
	public Student process(Student student) throws Exception {
		System.out.println("Processing..." + student.toString());
		System.out.println(student.getName().length());
		student.setId(student.getId()+12);
		return student;
	}
}
