package jp.co.kensyu.mapper;

import java.util.List;

import jp.co.kensyu.dto.test.TestDto;
import jp.co.kensyu.entity.Test;

public interface TestMapper {
    Test getTest(int id);

    /* 全件取得メソッド追加 */
    List<Test> getTestAll();

    /* 送信ボタン入力名取得 */
    int insertTest(String name);

    /* 削除ID取得 */
    int deleteTest(int id);

    /* 更新ID取得 */
    int updateTest(TestDto dto);
}