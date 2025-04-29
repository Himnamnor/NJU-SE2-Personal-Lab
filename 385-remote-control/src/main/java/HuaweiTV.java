public class HuaweiTV extends TV {
    String isScreenSharing = "No";
    public HuaweiTV(){
        //todo:add code here to set brand to "Huawei"
        setBrand("Huawei");

        System.out.println("HuaweiTV is created.");
    }

    public void screenShare(){
        //todo:add code here to implement screenShare function
        //todo:if screen sharing is Yes, set it to "No" and print "Screen sharing is off."
        //todo:if screen sharing is No, set it to "Yes" and print "Screen sharing is started."
        if(isScreenSharing.equals("Yes")){
            System.out.println("Screen sharing is off.");
            isScreenSharing = "No";
        }
        else {
            isScreenSharing = "Yes";
            System.out.println("Screen sharing is started.");
        }
    }
    public String getScreenSharing(){
        return isScreenSharing;
    }
}
