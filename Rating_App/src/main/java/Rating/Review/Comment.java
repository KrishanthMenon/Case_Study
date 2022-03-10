package Rating.Review;

public class Comment {
	private int commentId;
	private String commentText;
	private int likes;
	private int dislikes;
	private boolean report;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Comment(int commentId, String commentText, int likes, int dislikes, boolean report) {
		super();
		this.commentId = commentId;
		this.commentText = commentText;
		this.likes = likes;
		this.dislikes = dislikes;
		this.report = report;
	}
	
	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

	public boolean isReport() {
		return report;
	}

	public void setReport(boolean report) {
		this.report = report;
	}
}
