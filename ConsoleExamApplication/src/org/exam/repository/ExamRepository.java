package org.exam.repository;

import org.exam.model.ExamModel;
import org.exam.model.ScheduleModel;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class ExamRepository extends DBConfig {
	List<ExamModel> listExams = new ArrayList<ExamModel>();
	QuestionRepository qRepo=new QuestionRepository();
	public boolean isExamPreset(String examName) {
		try {
			stmt = conn.prepareStatement("select *from exam where examname=?");
			stmt.setString(1, examName);
			rs = stmt.executeQuery();
			return rs.next();
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean isAddExam(ExamModel model) {
		try {
			stmt = conn.prepareStatement("insert into exam values('0',?,?,?)");
			stmt.setString(1, model.getName());
			stmt.setInt(2, model.getTotalMarks());
			stmt.setInt(3, model.getPassingMarks());
			int value = stmt.executeUpdate();
			if (value > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Error is " + e);
			return false;
		}
	}

	public List<ExamModel> getAllExams() {
		try {
			stmt = conn.prepareStatement("select * from exam");
			rs = stmt.executeQuery();
			while (rs.next()) {
				ExamModel model = new ExamModel();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setTotalMarks(rs.getInt(3));
				model.setPassingMarks(rs.getInt(4));
				listExams.add(model);
			}
			return listExams.size() > 0 ? listExams : null;
		} catch (Exception e) {
			System.out.println("Error is " + e);
			return null;
		}

	}

	public ExamModel getExamIdByName(String name) {
		try {
			stmt = conn.prepareStatement("select * from exam where examname='" + name + "'");
			rs = stmt.executeQuery();
			ExamModel model = null;
			if (rs.next()) { // when exam name match in exam table return true
				model = new ExamModel(); // created ExamModel object and stored all exam data in it.
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setTotalMarks(rs.getInt(3));
				model.setPassingMarks(rs.getInt(4));
			}
			return model != null ? model : null; // when exam not return null otherwise return model
		} catch (Exception e) {
			System.out.println("Error is " + e);
			return null;
		}
	}

	int getScheduleId() {
		int count = 0;
		try {
			stmt = conn.prepareStatement("select max(schid) from schedule");
			rs = stmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}
			++count;
			return count;
		} catch (Exception e) {
			System.out.println("Error is " + e);
			return 0;
		}
	}

	public boolean isSetSchedule(ExamModel model,String subName) {
		try {
			int schid = this.getScheduleId();
			if (schid != 0) {
				int subId=qRepo.getSubjectId(subName);
				ScheduleModel smodel = model.getScheduleModel();
				String examDate = smodel.getExamdate().toLocaleString();
				String d[] = examDate.split(",");
				String dateSplit[] = d[0].split("-");
				int months[] = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
				int m = 0;
				switch (dateSplit[1]) {
				case "Jan":
					m = 0;
					break;
				case "Feb":
					m = 1;
					break;
				case "Mar":
					m = 2;
					break;
				case "Apr":
					m = 3;
					break;
				case "May":
					m = 4;
					break;
				case "June":
					m = 5;
					break;
				case "July":
					m = 6;
					break;
				case "Aug":
					m = 7;
					break;
				case "Sep":
					m = 8;
					break;
				case "Oct":
					m = 9;
					break;
				case "Nov":
					m = 10;
					break;
				case "Dec":
					m = 11;
					break;
				}
				String newYear=dateSplit[2].substring(2,dateSplit[2].length());
				Date sqlDate=new Date((Integer.parseInt(newYear)+100),m,Integer.parseInt(dateSplit[0]));
				 stmt=conn.prepareStatement("insert into schedule values(?,?,?,?,?,?)");
				 stmt.setInt(1, schid);
				 stmt.setInt(2, model.getId()); 
				 stmt.setDate(3, sqlDate);
				 stmt.setString(4, smodel.getStartTime());
				 stmt.setString(5, smodel.getEndTime());
				 stmt.setInt(6, subId);
				 int value=stmt.executeUpdate();
				 return value>0?true:false;
			
			} else {
				System.out.println("Some problem is there..");
				return true;
			}

		} catch (Exception e) {
			System.out.println("Error is " + e);
			return false;
		}
	}
}
