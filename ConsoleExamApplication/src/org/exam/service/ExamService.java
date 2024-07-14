package org.exam.service;

import org.exam.model.ExamModel;
import org.exam.model.ScheduleModel;
import org.exam.repository.ExamRepository;
import java.util.*;
public class ExamService {
	ExamRepository examRepo=new ExamRepository();
	public int isAddExam(ExamModel model) {     //this method return result in ExamClient class
		if(examRepo.isExamPreset(model.getName())) {    //this statement call method from ExamRepository
			return -1;   //-1 means exam already present in db
		}else if(examRepo.isAddExam(model)) {
			return 1;	//1 means exam added
		}else {
			return 0;
		}
	}
	
	public List<ExamModel> getAllExams(){
		return examRepo.getAllExams();
	}
	public ExamModel getExamIdByName(String name) {
		return examRepo.getExamIdByName(name);
	}
	public boolean isSetSchedule(ExamModel model,String subName) {
		Date d=new Date();
		String []s=d.toLocaleString().split(",");
		String dsplit[]=s[0].split("-");
		ScheduleModel smodel=model.getScheduleModel();
		Date userDate=smodel.getExamdate();
		String userDateArr[]=userDate.toLocaleString().split(",");
		String userDates[]=userDateArr[0].split("-");
		if(Integer.parseInt(userDates[2])>=Integer.parseInt(dsplit[2]) && userDates[1].equals(dsplit[1])){
			if(Integer.parseInt(userDates[0])>=Integer.parseInt(dsplit[0])) {
				System.out.println("You can Schedule Exam");
				return examRepo.isSetSchedule(model,subName)?true:false;
			}else {
				System.out.println("You may be insert date before Today's date");
			}
		}else {
			System.out.println("You may be insert previous year or may be previous month");
		}
		
		
		return false;
	}
}
