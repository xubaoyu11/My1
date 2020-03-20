package com.example.day9.bean;

import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.day9.bean
 * @ClassName: MyBean
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/8 9:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/8 9:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyBean {


    /**
     * code : 200
     * msg : 请求成功
     * result : [{"title":"中国联通：eSIM一号双终端业务即将全国开通","digest":"12月31日消息中国联通刚刚宣布，中国联通eSIM一号双终端","imgsrc":"http://cms-bucket.ws.126.net/2019/1231/756c933ep00q3cz59002pc0009c005uc.png","ptime":"2019-12-31 12:00:56","type":0},{"title":"苹果认可京东方OLED屏：将大规模采购","digest":"据外媒最新报道称，苹果计划在2020年向中国京东方订购OLE","imgsrc":"http://cms-bucket.ws.126.net/2019/1231/8bb5c3dep00q3cwjl0039c0009c005uc.png","ptime":"2019-12-31 11:04:59","type":1},{"title":"微软正A/B测试Edge全新用户界面：提高易用性","digest":"为提高基于Chromium的新版Edge浏览器易用性，微软似","imgsrc":"http://cms-bucket.ws.126.net/2019/1231/6264c4cap00q3cunh001hc0009c005uc.png","ptime":"2019-12-31 10:23:49","type":2},{"title":"苹果或为2020款5G iPhone引入无刘海+屏下指纹设计","digest":"早在2019年中，就有许多人在猜测苹果会为2020年的5Gi","imgsrc":"http://cms-bucket.ws.126.net/2019/1231/a3da485bp00q3cuc6002uc0009c005uc.png","ptime":"2019-12-31 10:17:00","type":0},{"title":"安卓10来了！三星S10系列国行推送One UI 2.0正式版","digest":"12月31日消息今天三星S10系列国行手机开始推送最新的基于","imgsrc":"http://cms-bucket.ws.126.net/2019/1231/2970f2b3p00q3cu5v000pc0009c005uc.png","ptime":"2019-12-31 10:13:23","type":1}]
     */

    private int code;
    private String msg;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * title : 中国联通：eSIM一号双终端业务即将全国开通
         * digest : 12月31日消息中国联通刚刚宣布，中国联通eSIM一号双终端
         * imgsrc : http://cms-bucket.ws.126.net/2019/1231/756c933ep00q3cz59002pc0009c005uc.png
         * ptime : 2019-12-31 12:00:56
         * type : 0
         */

        private String title;
        private String digest;
        private String imgsrc;
        private String ptime;
        private int type;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
