package org.exam.service;

import org.exam.model.SubjectModel;
import org.exam.repository.SubjectRepository;
import java.util.*;

public class SubjectService {
	SubjectRepository subRepo = new SubjectRepository();

	public int addSubject(SubjectModel model) {  //if subject already present then return -1 otherwise add subject
		return (subRepo.isSubjectPresent(model.getName())) ? -1 : subRepo.isAddSubject(model) ? 1 : 0;
	}

	public List<String> getAllSubjects() {    //this function returns all subject list which we used in Question repository
		return this.subRepo.getAllSubjects();  //to create files of all subject
	}
}
