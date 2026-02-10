package Libraly;

class Libraly{
    private Books[] bookadding;
    private Members[] membersadding;
    private int countForBooks = 0;
    private int countForMembers = 0;

    public Libraly() {
        bookadding = new Books[10];
        membersadding = new Members[10];
    }

    public boolean addBook(Books entity) {
        if(countForBooks<bookadding.length) {
            if(entity != null) {
                bookadding[countForBooks++] = entity;
                return true;
            }
        }
        return false;
    }

    public boolean addMember(Members addMember) {
        if (countForMembers < membersadding.length) {
            if (addMember != null) {
                membersadding[countForMembers++] = addMember;
                return true;
            }
        }
        return false;
    }

    public Members issueBook(int issueID,int memberID) {
        for (int i=0;i<countForBooks;i++) {
            if (bookadding[i].getId() == issueID && bookadding[i].isAvailable()) {
                    for(int j=0;j<countForMembers;j++) {
                        if (membersadding[j].getMemberid() == memberID) {
                            if(membersadding[j].getIssuedBookId() == -1) {
                                membersadding[j].setIssuedBookId(issueID);
                                bookadding[i].setAvailable(false);
                                return membersadding[j];
                            }
                        }
                    }
                }
            }
        return null;
    }

    public boolean returnBook(int id) {
        for (int i=0;i<countForMembers;i++) {
            if (id == membersadding[i].getIssuedBookId()) {
                membersadding[i].setIssuedBookId(-1);
                for (int j = 0;j<countForBooks;j++) {
                    if (id == bookadding[j].getId()) {
                        bookadding[j].setAvailable(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Books searchBook(int id) {
        for (int i=0;i<countForBooks;i++) {
            if (id == bookadding[i].getId()) {
                return bookadding[i];
            }
        }
        return null;
    }

}