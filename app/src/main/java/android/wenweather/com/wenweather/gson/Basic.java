package android.wenweather.com.wenweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 8/29/2017.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
