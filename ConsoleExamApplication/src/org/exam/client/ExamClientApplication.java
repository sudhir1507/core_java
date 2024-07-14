package org.exam.client;

import java.util.*;

import org.exam.model.ExamModel;
import org.exam.model.QuestionModel;
import org.exam.model.ScheduleModel;
import org.exam.model.SubjectModel;
import org.exam.service.ExamService;
import org.exam.service.QuestionService;
import org.exam.service.SubjectService;

public class ExamClientApplication {

	public static void main(String[] args) {
		SubjectService sv = new SubjectService();
		QuestionService qService=new QuestionService();
		ExamService examService=new ExamService();
		do {
			System.out.println("\n1 : Add subject");
			System.out.println("2 : Add Single Question Under subject");
			System.out.println("3 : Add Bulk question under subject");
			System.out.println("4 : Add Exam");
			System.out.println("5 : Create Exam Schudule");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter subject name");
				String subName = sc.nextLine();
				SubjectModel model = new SubjectModel();
				model.setName(subName);
				int result = sv.addSubject(model);
				System.out.println((result == 1)?"Subject Added Success..!":(result ==-1)?"Subject Already present..!":"Some problem is there..!");
				break;
			case 2:
				sc.nextLine();
				System.out.println("Enter Question");
				String question=sc.nextLine();
				System.out.println("Enter Option1");
				String op1=sc.nextLine();
				System.out.println("Enter Option2");
				String op2=sc.nextLine();
				System.out.println("Enter Option3");
				String op3=sc.nextLine();
				System.out.println("Enter Option4");
				String op4=sc.nextLine();
				System.out.println("Enter optiom number as answer");
				int ans=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter subject name");
				subName=sc.nextLine();
				QuestionModel qModel=new QuestionModel(question,op1,op2,op3,op4,ans);
				boolean b=qService.isAddQuestion(qModel, subName);
				if(b) {
					System.out.println("Question added Successfuly..!");
				}else {
					System.out.println("Some Problem is there..!");
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter subject name for store bulk question");
				String subname=sc.nextLine();
				b=qService.uploadBulkQuestion(subname);
				if(b) {
					System.out.println("Questions added success..");
				}else {
					System.out.println("Questions not added..");
				}
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter Exam Name, totalmarks,passingmarks");
				String examName=sc.nextLine();
				int totalMarks=sc.nextInt();
				int passingMarks=sc.nextInt();
				ExamModel examModel=new ExamModel(examName,totalMarks,passingMarks);
				result=examService.isAddExam(examModel);
				String str=(result==1)?"Exam Added successfuly..":(result==-1)?"Exam Already present..":"Some problem is there..";
				System.out.println(str);
				break;
			case 5:
				sc.nextLine();
				List<ExamModel> list=examService.getAllExams();
				System.out.println("Hey user..you have list of exams and select one for schedule");
				System.out.println("==================================================================");
				for(ExamModel m:list) {
					System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getTotalMarks()+"\t"+m.getPassingMarks());
				}
				System.out.println("==================================================================");
				System.out.println("Emter exam Name for Schedule");
				examName=sc.nextLine();
				ExamModel emodel=examService.getExamIdByName(examName); //search for exam in exam table using its name
				if(emodel!=null) {    //when get exam from exam table 
					System.out.println("Enter examdate starttime and endtime");
					String dateFormat=sc.nextLine();
					Date d1=new Date(dateFormat);
					String startTime=sc.nextLine();
					String endTime=sc.nextLine();
					ScheduleModel smodel=new ScheduleModel();
					smodel.setExamdate(d1);
					smodel.setStartTime(startTime);
					smodel.setEndTime(endTime);
					smodel.setExamid(emodel.getId());
					emodel.setScheduleModel(smodel); //passed smodel in ExamModel 
					System.out.println("Enter Subject Name for Exam");
					subName=sc.nextLine();
					b=examService.isSetSchedule(emodel,subName);
					if(b) {
						System.out.println("Exam Schedule Successfully..");
					}else {
						System.out.println("Exam NOT schedule..");
					}
				}else {
					System.out.println("Enter correct exam");
				}
				break;
			default:
				System.out.println("Worng choice");
			}
		} while (true);

	}

}
