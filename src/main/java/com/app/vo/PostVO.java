package com.app.vo;

public class PostVO {
	Long id;
	String postTitle;
	String postContent;
	
	public PostVO() {;}

	public PostVO(Long id, String postTitle, String postContent) {
		super();
		this.id = id;
		this.postTitle = postTitle;
		this.postContent = postContent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	@Override
	public String toString() {
		return "PostVO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent + "]";
	}	
	
}
