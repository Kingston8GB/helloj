package org.kirin.helloj.judge.strategy;

import org.kirin.helloj.model.dto.question.JudgeCase;
import org.kirin.helloj.judge.codesandbox.model.JudgeInfo;
import org.kirin.helloj.model.entity.Question;
import org.kirin.helloj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
