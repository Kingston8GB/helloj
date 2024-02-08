package org.kirin.helloj.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author Xiyao Li
 * @GitHub <a href="https://github.com/Kingston8GB/">Kingston8GB</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}