package Libraly;
class Books {
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Books (int id,String title,String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }
}

class Members {
    private int memberid;
    private String memberName;
    private int issuedBookId = -1;

    public Members(int memberid,String name) {
        this.memberid = memberid;
        this.memberName = name;
    }

    public void setIssuedBookId(int issuedBookId) {
            this.issuedBookId = issuedBookId;
    }

    public int getMemberid() {
        return memberid;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getIssuedBookId() {
        return issuedBookId;
    }
}
