package com.mmmm.mapper;


import com.mmmm.entity.FormalExam;

/**
 * 真是考试的Mapper
 * @author Noor
 *
 */
public interface FormalExamMapper {

	FormalExam getFormalExamByUserId(int id);

	int insertFormalExam(FormalExam formalExam);
}
