package news.model;

import java.sql.Date;
import java.util.Arrays;

public class NewsVO implements java.io.Serializable {
	private Integer newsId;//�̷s�����s��
	private String newsContent;//���e
	private byte[] newsImg;//�Ϥ�
	private  Date newsTime;//�إ߮ɶ�
	private Integer newsType;//���������s��

	public NewsVO() {
	}

	public NewsVO(Integer newsId, String newsContent, byte[] newsImg, Date newsTime, Integer newsType) {
		super();
		this.newsId = newsId;
		this.newsContent = newsContent;
		this.newsImg = newsImg;
		this.newsTime = newsTime;
		this.newsType = newsType;
	}

	public Integer getNewsId() {
		return newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public byte[] getNewsImg() {
		return newsImg;
	}

	public void setNewsImg(byte[] newsImg) {
		this.newsImg = newsImg;
	}

	public Date getNewsTime() {
		return newsTime;
	}

	public void setNewsTime(Date newsTime) {
		this.newsTime = newsTime;
	}

	public Integer getNewsType() {
		return newsType;
	}

	public void setNewsType(Integer newsType) {
		this.newsType = newsType;
	}

	@Override
	public String toString() {
		return "NewsVO [newsId=" + newsId + ", newsContent=" + newsContent + ", newsImg=" + Arrays.toString(newsImg)
				+ ", newsTime=" + newsTime + ", newsType=" + newsType + "]";
	}

	
	

}
