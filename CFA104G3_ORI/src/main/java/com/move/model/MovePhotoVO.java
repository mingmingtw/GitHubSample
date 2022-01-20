package com.move.model;

import java.io.Serializable;
import java.util.Arrays;

public class MovePhotoVO implements Serializable {
	private Integer id;
	private Integer moveRequestId;
	private byte[] photo;

	public MovePhotoVO() {
	}

	public MovePhotoVO(Integer id, Integer moveRequestId, byte[] photo) {
		this.id = id;
		this.moveRequestId = moveRequestId;
		this.photo = photo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMoveRequestId() {
		return moveRequestId;
	}

	public void setMoveRequestId(Integer moveRequestId) {
		this.moveRequestId = moveRequestId;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "MovePhotoVO [id=" + id + ", moveRequestId=" + moveRequestId + ", photo=" + Arrays.toString(photo) + "]";
	}
}
