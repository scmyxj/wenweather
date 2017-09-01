package android.wenweather.com.wenweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 8/29/2017.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
