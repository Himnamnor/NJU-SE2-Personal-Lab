public class AppleTV extends TV {

    private String isAirPlay = "No";
    public AppleTV(){

        System.out.println("AppleTV is created.");
        //todo:add code here to set brand to "Apple"
        setBrand("Apple");
    }



    public void airPlay(){
        //todo:add code here to implement airPlay function
        if(isAirPlay.equals("Yes")){

            isAirPlay = "No";
            System.out.println("AirPlay is off");
        }
        else {
            isAirPlay = "Yes";
            System.out.println("AirPlay is started.");
        }
    }

    public String getAirPlay(){

        return isAirPlay;
    }

}
