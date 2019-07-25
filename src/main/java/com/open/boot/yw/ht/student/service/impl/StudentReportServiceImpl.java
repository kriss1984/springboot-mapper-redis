package com.open.boot.yw.ht.student.service.impl;

import com.open.boot.yw.ht.student.dao.StudentReportMapper;
import com.open.boot.yw.ht.student.model.StudentReport;
import com.open.boot.yw.ht.student.service.IStudentReportService;
import com.open.boot.core.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by kriss on 2019/07/24.
 */
@Service
@Transactional( isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class StudentReportServiceImpl extends AbstractService<StudentReport> implements IStudentReportService {
    @Autowired
    private StudentReportMapper studentReportMapper;

}
