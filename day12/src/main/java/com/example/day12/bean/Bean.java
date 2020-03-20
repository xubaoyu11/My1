package com.example.day12.bean;

import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.day12.bean
 * @ClassName: Bean
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/12 11:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/12 11:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Bean {
    public List<ResultsBean> results;

    public static class ResultsBean {
        private String desc;
        private List<String> images;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public List<String> getImages() {
            return images;
        }
    }
}
