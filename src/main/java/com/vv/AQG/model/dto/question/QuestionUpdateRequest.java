package com.vv.aqg.model.dto.question;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新题目请求
 *

 
 */
@Data
public class QuestionUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 题目内容（json格式）
     */
    private String questionContent;

    /**
     * 应用 id
     */
    private Long appId;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * id
     */
    private Long notID;

    /**
     * 搜索词
     */
    private String searchText;

    private static final long serialVersionUID = 1L;
}