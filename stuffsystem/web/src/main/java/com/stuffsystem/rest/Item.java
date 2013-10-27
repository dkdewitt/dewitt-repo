package com.stuffsystem.rest;

public class Item {

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		this._id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
	}

	private String _id;
	private String type;
	private String[] fields;

}
