package faq.model;

public class FaqVO implements java.io.Serializable {
	private Integer faqId;//faq�s��
	private String faqQuestion;//���D
	private String faqAnswer;//�^��
	

	public FaqVO() {

	}
	


	public FaqVO(Integer faqId, String faqQuestion, String faqAnswer) {
		super();
		this.faqId = faqId;
		this.faqQuestion = faqQuestion;
		this.faqAnswer = faqAnswer;
	}



	public Integer getFaqId() {
		return faqId;
	}


	public void setFaqId(Integer faqId) {
		this.faqId = faqId;
	}


	public String getFaqQuestion() {
		return faqQuestion;
	}


	public void setFaqQuestion(String faqQuestion) {
		this.faqQuestion = faqQuestion;
	}


	public String getFaqAnswer() {
		return faqAnswer;
	}


	public void setFaqAnswer(String faqAnswer) {
		this.faqAnswer = faqAnswer;
	}



	@Override
	public String toString() {
		return "FaqVO [faqId=" + faqId + ", faqQuestion=" + faqQuestion + ", faqAnswer=" + faqAnswer + "]";
	}

}