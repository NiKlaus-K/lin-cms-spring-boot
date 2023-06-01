package io.github.talelin.latticy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.talelin.latticy.model.ArticleDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文章mapper接口
 */
@Repository
public interface ArticleMapper extends BaseMapper<ArticleDO> {

    /**
     * 根据标题模糊查询文章列表
     * @param q 查询关键字
     * @return 文章数据对象列表
     */
    List<ArticleDO> selectByTitleLikeKeyword(@Param("q") String q);

    /**
     * 根据标题查询文章列表
     * @param title 文章标题
     * @return 文章数据对象列表
     */
    List<ArticleDO> selectByTitle(@Param("title") String title);
}
