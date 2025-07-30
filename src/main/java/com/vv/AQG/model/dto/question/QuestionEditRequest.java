package com.vv.aqg.model.dto.question;

import lombok.Data;

import java.io.Serializable;

/**
 * 编辑题目请求
 *

 
 */
@Data
public class QuestionEditRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 题目内容（json格式）
     */
    private QuestionContentDTO questionContent;

    private static final long serialVersionUID = 1L;
}