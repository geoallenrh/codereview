package com.enterprisearchitecture.codereview;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Job implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	private String executionNumber;
	@org.kie.api.definition.type.Label("Number of Rows")
	private String rowsPerExecution;
	@org.kie.api.definition.type.Label("Row Size in KB")
	private String rowSize;
	private String executionTime;
	@org.kie.api.definition.type.Label("Comment")
	private java.lang.String comment;

	@org.kie.api.definition.type.Label("id")
	private java.lang.String id;

	public Job() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getComment() {
		return this.comment;
	}

	public void setComment(java.lang.String comment) {
		this.comment = comment;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getExecutionTime() {
		return this.executionTime;
	}

	public void setExecutionTime(java.lang.String executionTime) {
		this.executionTime = executionTime;
	}

	public java.lang.String getRowsPerExecution() {
		return this.rowsPerExecution;
	}

	public void setRowsPerExecution(java.lang.String rowsPerExecution) {
		this.rowsPerExecution = rowsPerExecution;
	}

	public java.lang.String getRowSize() {
		return this.rowSize;
	}

	public void setRowSize(java.lang.String rowSize) {
		this.rowSize = rowSize;
	}

	public java.lang.String getExecutionNumber() {
		return this.executionNumber;
	}

	public void setExecutionNumber(java.lang.String executionNumber) {
		this.executionNumber = executionNumber;
	}

	public Job(java.lang.String name, java.lang.String executionNumber,
			java.lang.String rowsPerExecution, java.lang.String rowSize,
			java.lang.String executionTime, java.lang.String comment,
			java.lang.String id) {
		this.name = name;
		this.executionNumber = executionNumber;
		this.rowsPerExecution = rowsPerExecution;
		this.rowSize = rowSize;
		this.executionTime = executionTime;
		this.comment = comment;
		this.id = id;
	}

}