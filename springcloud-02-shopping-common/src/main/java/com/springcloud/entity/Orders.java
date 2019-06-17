package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDER���Ӧ��ʵ���࣬���ڷ�װһ�ж�����Ϣ
 * 
 * @author wanyan
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = -7062202476855677873L;

	/**
	 * �������
	 */
	private Integer orderId;
	/**
	 * ��ǰ������Ӧ���û���Ϣ
	 */
	private Users user;
	/**
	 * �ջ�������,���ʡ��Ĭ��Ϊ�û����е��û�����
	 */
	private String receiverName;
	/**
	 * �ջ��˵绰,���ʡ��Ĭ��Ϊ�û����е���ϵ�绰
	 */
	private String receiverTel;
	/**
	 * �ջ��˵�ַ,���ʡ��Ĭ��Ϊ�û����е��ջ���ַ
	 */
	private String receiverAddr;
	/**
	 * �µ�ʱ��,Ĭ��Ϊ��ǰʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderTime;
	/**
	 * �����ܶ�
	 */
	private Double orderTotal;
	/**
	 * ����״̬:0������,1������,2���ջ�,3�Ѹ���,4���˻�
	 */
	private Integer orderStatus;

	/**
	 * 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMin;

	/**
	 * 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMax;

	/**
	 * ��ѯ��������ʼ����
	 */
	private String startMonth;
	/**
	 * ��ѯ��������ֹ����
	 */
	private String endMonth;
	/**
	 * ͳ�ƽ��������
	 */
	private String orderMonth;
	/**
	 * ͳ�ƽ�������۶�
	 */
	private Double orderPrice; // private BigDecimal orderPrice �������������
	
	

}