package org.exam.repository;

import java.util.*;

import org.exam.model.SubjectModel;

public class SubjectRepository extends DBConfig {
	List<String> list=new ArrayList<String>();
//	private int subjectId;
//	private int getSubjectId() {
//		try {
//			stmt = conn.prepareStatement("select max(sid) from subject");
//			rs = stmt.executeQuery();
//			if (rs.next()) {
//				subjectId = rs.getInt(1);
//			}
//			++subjectId;
//		} catch (Exception e) {
//			System.out.println("Error is " + e);
//			return 0;
//		}
//		return subjectId;
//	}
	
	public boolean isAddSubject(SubjectModel model) {
		try {
			stmt = conn.prepareStatement("insert into subject values('0',?)");
			stmt.setString(1, model.getName());
			return stmt.executeUpdate()>0?true:false;
			
		} catch (Exception e) {
			System.out.println("Error is " + e);
			return false;
		}
	}
	public boolean isSubjectPresent(String subName) {
		try {
			stmt=conn.prepareStatement("select * from subject where subjectName=?");
			stmt.setString(1, subName);
			rs=stmt.executeQuery();
			return rs.next();
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<String> getAllSubjects(){
		try {
			stmt=conn.prepareStatement("select subjectname from subject");
			rs=stmt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString("subjectname"));
			}
			return list.size()>0?list:null;  //null return when table has no more data or if there is exception occurs
		}catch(Exception e) {
			System.out.println("Error is "+e);
			return null;
		}
		
	}

}
