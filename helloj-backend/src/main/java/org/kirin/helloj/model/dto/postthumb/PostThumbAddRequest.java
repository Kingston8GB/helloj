package org.kirin.helloj.model.dto.postthumb;

import java.io.Serializable;
import lombok.Data;

/**
 * 帖子点赞请求
 *
 * @author Xiyao Li
 * @GitHub <a href="https://github.com/Kingston8GB/">Kingston8GB</a>
 */
@Data
public class PostThumbAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}