package se.lexicon;

public enum Category {
    CHILD("For Children"), ADULT("For Adults"), NON_LOANABLE("Not loanable");
    private String category;
    Category(String category){
    this.category = category;
    }
    public String getCategory(){
        return category;
    }
}
