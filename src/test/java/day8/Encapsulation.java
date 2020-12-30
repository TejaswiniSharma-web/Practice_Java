package day8;

public class Encapsulation {
 private    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCardName() {
        return cardName;
    }

    public void setCardName() {
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
    private Long cardName;
  private   int cvv;
  private   int exp;
}
