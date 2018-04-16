package com.mmmm.mapper;

import java.util.List;

import com.mmmm.entity.Exam;
import com.mmmm.entity.Questions;

public interface AdminExamMapper {

	List<Exam> showExam();

	List<Questions> showQuestions();

	List<Exam> showFormalExam();

	int addQuestions(Questions questions);

	void deleteQuestion(String quesId);

	int addExam(Exam exam);

	void deleteExam(String id);

	void deleteExamQuestion(String id);

	Exam getExam(String examid);

	List<Questions> getQuestion(String id);

	int linkQuestions(String examId, String quesId);

	int exitformalExamId(String examid);

}
