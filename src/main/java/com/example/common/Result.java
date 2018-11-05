package com.example.common;

import java.io.Serializable;
import java.util.List;

/**
 * 公共返回实体
 * */
public class Result implements Serializable{

	private static final long serialVersionUID = 1596681823982940231L;
	private String msg;
	private int code;
	private Object data;

	private Result(int code, String msg){
		this.code = code;
		this.msg = msg;
	}
	private Result(int code, String msg, Object data){
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public static Result ok(int code, String msg, Object data) {
		return new Result(code, msg, data);
	}
	public static Result ok(int code, String msg) {
		return ok(code, msg, null);
	}
	public static Result ok(String msg) {
		return ok(200, msg);
	}
	public static Result ok(String msg, Object data) {
		return ok(200, msg, data);
	}
	public static Result ok(Object data) {
		return ok(200, "", data);
	}
	public static Result ok() {
		return ok("");
	}
	public static Result error(int code, String msg) {
		return new Result(code, msg);
	}
	public static Result error(String msg) {
		return error(500, msg);
	}
	public static Result error() {
		return new Result(500, "系統異常");
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}

}
