package com.mmmm.service;

import java.util.List;

import com.mmmm.entity.Exam;
import com.mmmm.entity.Questions;

public interface AdminExamService {

	List<Exam> showExam();

	List<Questions> showQuestions();

	List<Exam> showFormalExam();

	int addQuestions(Questions questions);

	void deleteQuestion(String quesId);

	int addExam(Exam exam);

	void deleteExam(String ids);

	List<Questions> lookExam(String examid);

	void linkQuestions(String questionIds, String examId);

	int exitformalExamId(String examid);

}
