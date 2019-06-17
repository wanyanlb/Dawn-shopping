package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * type_one���Ӧ��ʵ���࣬���ڱ������һ��һ�������Ϣ
 * 
 * @author wanyan
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeOne implements java.io.Serializable {

	private static final long serialVersionUID = -2690542590151848525L;
	
	/**
	 * һ�������
	 */
	private Integer typeOneId;
	/**
	 * һ���������
	 */
	private String typeOneName;
	/**
	 * һ��������
	 */
	private Integer typeOneNum;
	/**
	 * һ�����ע
	 */
	private String typeOneRemark;

}