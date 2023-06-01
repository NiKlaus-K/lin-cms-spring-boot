package io.github.talelin.latticy.service.impl;

import io.github.talelin.latticy.dto.article.CreateOrUpdateArticleDTO;
import io.github.talelin.latticy.mapper.ArticleMapper;
import io.github.talelin.latticy.model.ArticleDO;
import io.github.talelin.latticy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章服务实现类
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public boolean createArticle(CreateOrUpdateArticleDTO validator) {
        ArticleDO article = new ArticleDO();
        article.setAuthor(validator.getAuthor());
        article.setTitle(validator.getTitle());
        article.setThumbnail(validator.getThumbnail());
        article.setSummary(validator.getSummary());
        article.setContent(validator.getContent());
        return articleMapper.insert(article) > 0;
    }

    @Override
    public List<ArticleDO> getArticleByKeyword(String q) {
        return articleMapper.selectByTitleLikeKeyword(q);
    }

    @Override
    public boolean updateArticle(ArticleDO article, CreateOrUpdateArticleDTO validator) {
        article.setAuthor(validator.getAuthor());
        article.setTitle(validator.getTitle());
        article.setThumbnail(validator.getThumbnail());
        article.setSummary(validator.getSummary());
        article.setContent(validator.getContent());
        return articleMapper.updateById(article) > 0;
    }

    @Override
    public ArticleDO getById(Integer id) {
        return articleMapper.selectById(id);
    }

    @Override
    public List<ArticleDO> findAll() {
        return articleMapper.selectList(null);
    }

    @Override
    public boolean deleteById(Integer id) {
        return articleMapper.deleteById(id) > 0;
    }
}
