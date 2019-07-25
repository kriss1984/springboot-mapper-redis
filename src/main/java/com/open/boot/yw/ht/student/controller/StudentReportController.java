package com.open.boot.yw.ht.student.controller;
import com.open.boot.yw.ht.student.model.StudentReport;
import com.open.boot.yw.ht.student.service.IStudentReportService;
import com.open.boot.core.Result;
import com.open.boot.core.ResultGenerator;
import com.open.boot.core.redis.RedisUtil;
import com.open.boot.core.CorePager;
import com.open.boot.core.utils.CommonUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;
import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
/**
* Created by kriss on 2019/07/24.
*/
@RestController
@RequestMapping("/ht/student/report")
public class StudentReportController {
    @Autowired
    private IStudentReportService studentReportService;
	@Resource
	RedisUtil RedisUtil;
	
    @RequestMapping("/add")
    public Result add(@RequestBody StudentReport studentReport) {
        studentReportService.saveSelective(studentReport);
        return ResultGenerator.genSuccessResult(studentReport);
    }

    @RequestMapping("/delete")
    public Result delete(@RequestParam String id) {
        studentReportService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/updateSelective")
    public Result update(@RequestBody StudentReport studentReport) {
        studentReportService.updateSelective(studentReport);
        return ResultGenerator.genSuccessResult();
    }
    
    @RequestMapping("/updateAll")
    public Result updateAll(@RequestBody StudentReport studentReport) {
        studentReportService.updateAll(studentReport);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    public Result detail(@RequestParam String id) {
        StudentReport studentReport = studentReportService.findById(id);
        return ResultGenerator.genSuccessResult(studentReport);
    }

    @RequestMapping("/listAll")
    public Result listAll(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<StudentReport> list = studentReportService.findAll();
        PageInfo<StudentReport> pageInfo = new PageInfo<StudentReport>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    
	@RequestMapping("/addList")
	public Result addList(@RequestBody List<StudentReport> list) {
		int count = studentReportService.saveList(list);
		return ResultGenerator.genSuccessResult(count);
	}
	
	@RequestMapping("/updateList")
	public Result updateListStudentReport(@RequestBody List<StudentReport> list) {
		for (StudentReport item : list) {
			studentReportService.updateSelective(item);
		}
		return ResultGenerator.genSuccessResult();
	}
	
	/**
	 * actor-T 传分页对象就分页查询，不传就不分页
	 * 
	 * @param map paper对象和实体类objBean条件对象
	 * @return 查询结果
	 */
    @RequestMapping("/listByCondition")
	public Result listByCondition(@RequestBody Map<String, Object> map) {
		String pagerStr = CommonUtil.getMapValue(map, "pager");
		StudentReport objBean = JSON.parseObject(map.get("objBean").toString(), StudentReport.class);
		if (StringUtil.isEmpty(pagerStr)) {
			Condition condition = new Condition(StudentReport.class);
			condition.createCriteria().andEqualTo(objBean);
			List<StudentReport> list = studentReportService.findByCondition(condition);
			return ResultGenerator.genSuccessResult(list);
		} else {
			CorePager pager = JSON.parseObject(pagerStr, CorePager.class);
			PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
			Condition condition = new Condition(StudentReport.class);
			condition.createCriteria().andEqualTo(objBean);
			List<StudentReport> list = studentReportService.findByCondition(condition);
			PageInfo<StudentReport> pageInfo = new PageInfo<>(list);
			return ResultGenerator.genSuccessResult(pageInfo);
		}
	}
	
	/**
	 * actor-T 根据条件更新objBean不为空的值
	 * 
	 * @param map objCondition为更新条件对象，objBean为更新实体内对象
	 * @return 查询结果
	 */
	@RequestMapping("/updateByConditionSelective")
    public Result updateByConditionSelective(@RequestBody Map<String, Object> map) {
        StudentReport objBean = JSON.parseObject(map.get("objBean").toString(), StudentReport.class);
       	StudentReport objCondition = JSON.parseObject(map.get("objCondition").toString(), StudentReport.class);
       	Condition condition = new Condition(StudentReport.class);
		condition.createCriteria().andEqualTo(objCondition);
		studentReportService.updateByConditionSelective(objBean,objCondition);
        return ResultGenerator.genSuccessResult();
    }
}
