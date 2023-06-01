package io.github.talelin.latticy.dto.article;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * 文章创建/更新数据传输对象
 */
@Data
@NoArgsConstructor
public class CreateOrUpdateArticleDTO {

    @NotEmpty(message = "{article.title.not-empty}")
    @Length(max = 50, message = "{article.title.length}")
    private String title;

    @Length(max = 50, message = "{article.author.length}")
    private String author;

    @Length(max = 1000, message = "{article.summary.length}")
    private String summary;

    @Length(max = 200, message = "{article.thumbnail.length}")
    private String thumbnail;

    private String content;
}
