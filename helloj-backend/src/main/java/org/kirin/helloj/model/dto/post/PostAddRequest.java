package org.kirin.helloj.model.dto.post;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * 创建请求
 *
 * @author Xiyao Li
 * @GitHub <a href="https://github.com/Kingston8GB/">Kingston8GB</a>
 */
@Data
public class PostAddRequest implements Serializable {

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    private static final long serialVersionUID = 1L;
}