// Version: 1.0
// Date: 2020.7.12
// Author: 67
// Content: 设备接口
public interface Device {

    //获得品牌
    public String getBrand();

    //设置品牌
    public void setBrand(String brand);

    //获得是否开启
    public boolean isEnabled();

    //开启
    public void enable();

    //关闭
    public void disable();

    //获得音量
    public int getVolume();

    //
    public void setVolume(int percent);

    //调整到下一个频道
    public void next();

    //是否正在播放
    public boolean isPlaying();

    //播放
    public void play();

    //暂停
    public void pause();

    //调整到上一个频道
    public void previous();
}