package sample;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class StudentFieldSetMapper implements FieldSetMapper<Student> {

	@Override
	public Student mapFieldSet(FieldSet fieldSet) throws BindException {
		Student student = new Student();
		student.setId(fieldSet.readInt("id"));
		student.setName(fieldSet.readString("name"));
		student.setPoints(fieldSet.readInt("points"));
		return student;
	}
}
