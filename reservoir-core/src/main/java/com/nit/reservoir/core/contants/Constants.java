package com.nit.reservoir.core.contants;

/**
 * Created by aozijian on 2017/4/21.
 */
public interface Constants {

    interface ResponseCode {
        /**
         * 通用错误码：返回成功
         */
        int SUCCESS = 0;

        /**
         * 通用错误码：参数错误.
         */
        int ERROR_PARAM = -1;

        /**
         * 通用错误码：未知错误
         */
        int ERROR_UNKNOWN = -9998;

        /**
         * 通用错误码：系统错误
         */
        int ERROR_SYSTEM = -9999;
    }

    String GLOBAL_USER = "globalUser";  // 用户Session
}
