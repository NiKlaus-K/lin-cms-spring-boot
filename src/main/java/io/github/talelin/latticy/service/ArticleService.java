package io.github.talelin.latticy.service;

import io.github.talelin.latticy.dto.article.CreateOrUpdateArticleDTO;
import io.github.talelin.latticy.model.ArticleDO;

import java.util.List;

/**
 * 文章服务接口
 */
public interface ArticleService {

    /**
     * 新增文章
     * @param validator 数据传输对象
     * @return 是否成功
     */
    boolean createArticle(CreateOrUpdateArticleDTO validator);

    /**
     * 根据关键字获取文章集合
     * @param q 查询关键字
     * @return ArticleDO List
     */
    List<ArticleDO> getArticleByKeyword(String q);

    /**
     * 更新文章
     * @param article 文章对象
     * @param validator 数据传输对象
     * @return 是否更新成功
     */
    boolean updateArticle(ArticleDO article, CreateOrUpdateArticleDTO validator);

    /**
     * 获取文章
     * @param id 主键id
     * @return 文章数据对象
     */
    ArticleDO getById(Integer id);

    /**
     * 查询所有文章
     * @return 文章数据对象集合
     */
    List<ArticleDO> findAll();

    /**
     * 删除文章
     * @param id 主键id
     * @return 是否删除成功
     */
    boolean deleteById(Integer id);
}
