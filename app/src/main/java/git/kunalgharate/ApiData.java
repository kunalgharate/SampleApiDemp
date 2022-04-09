package git.kunalgharate;



import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiData implements Serializable
{

    @SerializedName("error_code")
    @Expose
    private Integer errorCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("issue_question_data")
    @Expose
    private List<IssueQuestionDatum> issueQuestionData = null;
    private final static long serialVersionUID = 7987822056530182966L;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<IssueQuestionDatum> getIssueQuestionData() {
        return issueQuestionData;
    }

    public void setIssueQuestionData(List<IssueQuestionDatum> issueQuestionData) {
        this.issueQuestionData = issueQuestionData;
    }


public class IssueQuestionDatum implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("issue_id")
    @Expose
    private String issueId;
    @SerializedName("issue_name")
    @Expose
    private String issueName;
    @SerializedName("issue_description")
    @Expose
    private String issueDescription;
    @SerializedName("issue_for")
    @Expose
    private List<String> issueFor = null;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("created_on")
    @Expose
    private String createdOn;
    @SerializedName("master_question_data")
    @Expose
    private List<MasterQuestionDatum> masterQuestionData = null;
    private final static long serialVersionUID = 9058505556139461639L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public List<String> getIssueFor() {
        return issueFor;
    }

    public void setIssueFor(List<String> issueFor) {
        this.issueFor = issueFor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public List<MasterQuestionDatum> getMasterQuestionData() {
        return masterQuestionData;
    }

    public void setMasterQuestionData(List<MasterQuestionDatum> masterQuestionData) {
        this.masterQuestionData = masterQuestionData;
    }


    public class MasterQuestionDatum implements Serializable {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("issue_id")
        @Expose
        private String issueId;
        @SerializedName("question_id")
        @Expose
        private String questionId;
        @SerializedName("question_text")
        @Expose
        private String questionText;
        @SerializedName("answer_text")
        @Expose
        private String answerText;
        @SerializedName("user")
        @Expose
        private String user;
        @SerializedName("question_for_user")
        @Expose
        private String questionForUser;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("created_on")
        @Expose
        private String createdOn;
        @SerializedName("sub_question_data")
        @Expose
        private List<SubQuestionDatum> subQuestionData = null;
        private final static long serialVersionUID = -3526356674828196974L;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIssueId() {
            return issueId;
        }

        public void setIssueId(String issueId) {
            this.issueId = issueId;
        }

        public String getQuestionId() {
            return questionId;
        }

        public void setQuestionId(String questionId) {
            this.questionId = questionId;
        }

        public String getQuestionText() {
            return questionText;
        }

        public void setQuestionText(String questionText) {
            this.questionText = questionText;
        }

        public String getAnswerText() {
            return answerText;
        }

        public void setAnswerText(String answerText) {
            this.answerText = answerText;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getQuestionForUser() {
            return questionForUser;
        }

        public void setQuestionForUser(String questionForUser) {
            this.questionForUser = questionForUser;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCreatedOn() {
            return createdOn;
        }

        public void setCreatedOn(String createdOn) {
            this.createdOn = createdOn;
        }

        public List<SubQuestionDatum> getSubQuestionData() {
            return subQuestionData;
        }

        public void setSubQuestionData(List<SubQuestionDatum> subQuestionData) {
            this.subQuestionData = subQuestionData;
        }

        public class SubQuestionDatum implements Serializable
        {

            @SerializedName("id")
            @Expose
            private String id;
            @SerializedName("issue_id")
            @Expose
            private String issueId;
            @SerializedName("question_id")
            @Expose
            private String questionId;
            @SerializedName("sub_question_id")
            @Expose
            private String subQuestionId;
            @SerializedName("sub_question_text")
            @Expose
            private String subQuestionText;
            @SerializedName("sub_question_ans1")
            @Expose
            private String subQuestionAns1;
            @SerializedName("sub_question_ans2")
            @Expose
            private String subQuestionAns2;
            @SerializedName("sub_question_ans3")
            @Expose
            private String subQuestionAns3;
            @SerializedName("sub_question_ans4")
            @Expose
            private String subQuestionAns4;
            @SerializedName("ans_status_1")
            @Expose
            private String ansStatus1;
            @SerializedName("ans_status_2")
            @Expose
            private String ansStatus2;
            @SerializedName("ans_status_3")
            @Expose
            private String ansStatus3;
            @SerializedName("ans_status_4")
            @Expose
            private String ansStatus4;
            @SerializedName("status")
            @Expose
            private String status;
            @SerializedName("created_on")
            @Expose
            private String createdOn;
            private final static long serialVersionUID = 5866600217398880906L;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIssueId() {
                return issueId;
            }

            public void setIssueId(String issueId) {
                this.issueId = issueId;
            }

            public String getQuestionId() {
                return questionId;
            }

            public void setQuestionId(String questionId) {
                this.questionId = questionId;
            }

            public String getSubQuestionId() {
                return subQuestionId;
            }

            public void setSubQuestionId(String subQuestionId) {
                this.subQuestionId = subQuestionId;
            }

            public String getSubQuestionText() {
                return subQuestionText;
            }

            public void setSubQuestionText(String subQuestionText) {
                this.subQuestionText = subQuestionText;
            }

            public String getSubQuestionAns1() {
                return subQuestionAns1;
            }

            public void setSubQuestionAns1(String subQuestionAns1) {
                this.subQuestionAns1 = subQuestionAns1;
            }

            public String getSubQuestionAns2() {
                return subQuestionAns2;
            }

            public void setSubQuestionAns2(String subQuestionAns2) {
                this.subQuestionAns2 = subQuestionAns2;
            }

            public String getSubQuestionAns3() {
                return subQuestionAns3;
            }

            public void setSubQuestionAns3(String subQuestionAns3) {
                this.subQuestionAns3 = subQuestionAns3;
            }

            public String getSubQuestionAns4() {
                return subQuestionAns4;
            }

            public void setSubQuestionAns4(String subQuestionAns4) {
                this.subQuestionAns4 = subQuestionAns4;
            }

            public String getAnsStatus1() {
                return ansStatus1;
            }

            public void setAnsStatus1(String ansStatus1) {
                this.ansStatus1 = ansStatus1;
            }

            public String getAnsStatus2() {
                return ansStatus2;
            }

            public void setAnsStatus2(String ansStatus2) {
                this.ansStatus2 = ansStatus2;
            }

            public String getAnsStatus3() {
                return ansStatus3;
            }

            public void setAnsStatus3(String ansStatus3) {
                this.ansStatus3 = ansStatus3;
            }

            public String getAnsStatus4() {
                return ansStatus4;
            }

            public void setAnsStatus4(String ansStatus4) {
                this.ansStatus4 = ansStatus4;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getCreatedOn() {
                return createdOn;
            }

            public void setCreatedOn(String createdOn) {
                this.createdOn = createdOn;
            }

        }

    }
}
}
