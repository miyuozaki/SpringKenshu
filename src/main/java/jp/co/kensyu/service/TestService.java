package jp.co.kensyu.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.kensyu.dto.test.TestDto;
import jp.co.kensyu.entity.Test;
import jp.co.kensyu.mapper.TestMapper;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public TestDto getTest(Integer id) {
        TestDto dto = new TestDto();
        Test entity = testMapper.getTest(id);
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    /*  全件取得 */
	public List<TestDto> getTestAll(){
		List<Test>testList = testMapper.getTestAll();
		List<TestDto>resultList = convertToDto(testList);
		return resultList;
	}
	  /*  entityから取得したListをDtoにコピーし、詰め替える */
	private List<TestDto> convertToDto(List<Test> testList){
		List<TestDto> resultList = new LinkedList<TestDto>();
		for(Test entity : testList) {
			TestDto dto = new TestDto();
	        BeanUtils.copyProperties(entity, dto);
	        resultList.add(dto);
		}
		return resultList;
	}
	/*  送信件数計上 */
	public int insertTest(String name) {
		int count = testMapper.insertTest(name);
		return count;
	}
	/*  削除件数計上 */
	public int deleteTest(int id) {
	    int count = testMapper.deleteTest(id);
	    return count;
	}
	/*  更新件数計上 */
	public int updateTest(TestDto dto) {
	    int count = testMapper.updateTest(dto);
	    return count;
	}

}