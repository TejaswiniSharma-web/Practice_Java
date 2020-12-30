package day9;


public class EncapsExample {
    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCardName() {
        return cardName;
    }

    public void setCardName(Long cardName) {
        this.cardName = cardName;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
//variables
    private String name;
   private Long cardName;
   private int cvv;
   private int exp;

}
