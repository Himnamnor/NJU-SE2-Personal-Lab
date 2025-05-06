class Button {
    private String label="";
    private OnClickListener onClickListener;

    public Button(String label) {
        //initialize label
        this.label = label;

    }

    public void setOnClick(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void click() {
        onClickListener.onClick();
    }

}