package org.kirin.helloj.service;

import org.kirin.helloj.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import org.kirin.helloj.model.entity.User;

/**
 * 帖子点赞服务
 *
 * @author Xiyao Li
 * @GitHub <a href="https://github.com/Kingston8GB/">Kingston8GB</a>
 */
@Deprecated
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
