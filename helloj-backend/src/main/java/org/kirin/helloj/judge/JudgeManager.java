package org.kirin.helloj.judge;

import org.kirin.helloj.judge.strategy.DefaultJudgeStrategy;
import org.kirin.helloj.judge.strategy.JavaLanguageJudgeStrategy;
import org.kirin.helloj.judge.strategy.JudgeContext;
import org.kirin.helloj.judge.strategy.JudgeStrategy;
import org.kirin.helloj.judge.codesandbox.model.JudgeInfo;
import org.kirin.helloj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
