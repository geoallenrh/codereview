package com.enterprisearchitecture.codereview;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CodeReview implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Review ID")
	private java.lang.Integer reviewID;
	@org.kie.api.definition.type.Label("Review Name")
	private java.lang.String reviewName;
	@org.kie.api.definition.type.Label("Review Description")
	private java.lang.String reviewDescription;
	@org.kie.api.definition.type.Label("DataStage Project Name")
	private java.lang.String dataStageProjectName;
	@org.kie.api.definition.type.Label("Date Needed")
	private java.util.Date dateNeeded;
	@org.kie.api.definition.type.Label("Review Type")
	private java.lang.String reviewType;

	@org.kie.api.definition.type.Label("Requester")
	private com.enterprisearchitecture.codereview.Requester requester;

	@org.kie.api.definition.type.Label("Jobs")
	private java.util.List<com.enterprisearchitecture.codereview.Job> jobs;

	private java.lang.String jobList;

	public CodeReview() {
	}

	public java.lang.Integer getReviewID() {
		return this.reviewID;
	}

	public void setReviewID(java.lang.Integer reviewID) {
		this.reviewID = reviewID;
	}

	public java.lang.String getReviewName() {
		return this.reviewName;
	}

	public void setReviewName(java.lang.String reviewName) {
		this.reviewName = reviewName;
	}

	public java.lang.String getReviewDescription() {
		return this.reviewDescription;
	}

	public void setReviewDescription(java.lang.String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}

	public java.lang.String getDataStageProjectName() {
		return this.dataStageProjectName;
	}

	public void setDataStageProjectName(java.lang.String dataStageProjectName) {
		this.dataStageProjectName = dataStageProjectName;
	}

	public java.util.Date getDateNeeded() {
		return this.dateNeeded;
	}

	public void setDateNeeded(java.util.Date dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public java.lang.String getReviewType() {
		return this.reviewType;
	}

	public void setReviewType(java.lang.String reviewType) {
		this.reviewType = reviewType;
	}

	public com.enterprisearchitecture.codereview.Requester getRequester() {
		return this.requester;
	}

	public void setRequester(
			com.enterprisearchitecture.codereview.Requester requester) {
		this.requester = requester;
	}

	public java.util.List<com.enterprisearchitecture.codereview.Job> getJobs() {
		return this.jobs;
	}

	public void setJobs(
			java.util.List<com.enterprisearchitecture.codereview.Job> jobs) {
		this.jobs = jobs;
	}

	public java.lang.String getJobList() {
		return this.jobList;
	}

	public void setJobList(java.lang.String jobList) {
		this.jobList = jobList;
	}

	public CodeReview(java.lang.Integer reviewID, java.lang.String reviewName,
			java.lang.String reviewDescription,
			java.lang.String dataStageProjectName, java.util.Date dateNeeded,
			java.lang.String reviewType,
			com.enterprisearchitecture.codereview.Requester requester,
			java.util.List<com.enterprisearchitecture.codereview.Job> jobs,
			java.lang.String jobList) {
		this.reviewID = reviewID;
		this.reviewName = reviewName;
		this.reviewDescription = reviewDescription;
		this.dataStageProjectName = dataStageProjectName;
		this.dateNeeded = dateNeeded;
		this.reviewType = reviewType;
		this.requester = requester;
		this.jobs = jobs;
		this.jobList = jobList;
	}

}