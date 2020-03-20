package com.example.day13.bean;

import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.day13.bean
 * @ClassName: MyBean
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/12 8:57
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/12 8:57
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyBean  {



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
