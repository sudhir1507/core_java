package org.exam.service;

import org.exam.helper.PathHelper;
import org.exam.model.QuestionModel;
import org.exam.repository.QuestionRepository;
import java.io.*;
import java.util.*;
public class QuestionService {
	QuestionRepository qRepo=new QuestionRepository();
	SubjectService ss=new SubjectService();
	public boolean isAddQuestion(QuestionModel qModel,String subName) {
		return qRepo.isAddQuestion(qModel, subName);
	}
	
	public boolean createFiles() {
		try {
			String path="C:\\Users\\ACER\\eclipse-workspace\\questionbank";
			File f=new File(path);
			if(!f.exists()) {
				f.mkdir();
			}
			List<String> subList=ss.getAllSubjects();
			if(subList!=null) {
				for(String subName:subList) {
					f=new File(path+"\\"+subName+".csv");
					if(!f.exists()) {
						f.createNewFile();
					}
				}
			}else {
				System.out.println("Subject Not Found..");
			}
		}catch(Exception e) {
			System.out.println("Error is "+e);
		}
		return true;
	}
	public boolean uploadBulkQuestion(String subName) {
		boolean b=this.createFiles();
		if(b) {
			File f=new File("C:\\Users\\ACER\\eclipse-workspace\\questionbank");
			File []fileList=f.listFiles(); //list all the files and folders
			boolean flag=false;
			for(File file:fileList) {      //iteratate through all files and folders
				if(file.isFile()) {     //if file is file then true
//					System.out.println(file);
					int index=file.toString().indexOf(subName);  //search for file using subject name as subject name and file name
					if(index!=-1) {                              //is same return true
						flag=true;
						break;
					}
				}
			}
			if(flag) {   //if flag is true means file found 
				try {
					FileReader fr=new FileReader(PathHelper.filePath+"\\"+subName+".csv"); //read from file in which we stored bulk questions
					BufferedReader br=new BufferedReader(fr);   
					String question;
					flag=false;
					while((question=br.readLine())!=null) {  //read questions and options line by line
						String qwithop[]=question.split(",");  //split question options and answers by quama
						flag=qRepo.uploadBulkQuestion(qwithop,subName);  //pass questions with options and subjectname in this function
					}
				}catch(Exception e) {
					System.out.println(e);
				}
				
			}else {
				System.out.println("Subject file not found");
			}
			return true;
		}else {
			return false;
		}
		
	}
}
