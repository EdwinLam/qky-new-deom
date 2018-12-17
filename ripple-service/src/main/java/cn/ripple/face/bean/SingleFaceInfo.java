package cn.ripple.face.bean;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

import lombok.ToString;

/**
 * 单人脸
 *
 * @author Jastar·Wang
 * @email jastar_wang@163.com
 * @date 2018-12-05
 * @since 2.0
 */
@ToString
public class SingleFaceInfo extends Structure {

	// 位置
	public Rect faceRect;

	// 角度，逆时针方向
	public int faceOrient;

	/**
	 * 性别
	 */
	public int gender;

	/**
	 * 年龄
	 */
	public int age;

	/**
	 * 横滚角
	 */
	public float roll;
	/**
	 * 偏航角
	 */
	public float yaw;
	/**
	 * 俯仰角
	 */
	public float pitch;
	/**
	 * 0: 正常，其他数值:出错 int[]
	 */
	public int status;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("faceRect", "faceOrient","gender","age","roll","yaw","pitch","status");
	}

}
