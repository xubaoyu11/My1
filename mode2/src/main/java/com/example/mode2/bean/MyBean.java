package com.example.mode2.bean;

import java.util.List;

/**
 * @ProjectName: My Application1
 * @Package: com.example.mode2.bean
 * @ClassName: MyBean
 * @Description: java类作用描述
 * @Author: deshuai
 * @CreateDate: 2020/1/7 15:54
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 15:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyBean {


    /**
     * result : success
     * data : [{"ID":"39eb7ad5cf3848449a579dbb88db9a3f","TITLE":"李建兴挂任甘肃省张掖市人民政府副市长","SUBTITLE":"3月21日，中央统战部在京召开全国党外代表人士实践锻炼第七批总结交流暨第八批启动","IMAGEURL":"http://www.93.gov.cn/11002/upload/webcms/content/image/2019/4/4/e66496709ccc4348a0b6cc9ab6dbe3e5_2.jpg","FROMNAME":"九三学社四川省委","SHOWTIME":"2019-04-04","RN":11},{"ID":"483dc62ea1b64230beda2131ec2dd04e","TITLE":"社员顾也力、王卫红获聘广东省人民政府参事","SUBTITLE":"2月25日，为贯彻落实习近平总书记关于建设新型智库的重要批示精神，广东省政府决定","IMAGEURL":null,"FROMNAME":"九三学社广东省委","SHOWTIME":"2019-02-27","RN":12},{"ID":"58f59a25c8914caf8eaba3e4e471021d","TITLE":"全国政协委员李学林：\u201c脱贫走向振兴\u201d路还有多远？","SUBTITLE":"一年之计在于春，春耕的农资、种子备下来了吗？如何落实乡村振兴战略？ 2月10日，","IMAGEURL":"http://www.93.gov.cn/11002/upload/webcms/content/image/2019/2/14/4eef4b81ba854ef39b75e75a69bb7162_8d1a11fb-1fb6-40c9-9a1e-44b4210ab268.jpg","FROMNAME":"九三学社云南省委","SHOWTIME":"2019-02-14","RN":13},{"ID":"a93a244b25124d6b8e764c3de9fac775","TITLE":"\u201c金牌智囊\u201d\u201c人民的代表\u201d\u201c钉子户\u201d","SUBTITLE":"记社员、市人大代表许丽萍","IMAGEURL":"http://www.93.gov.cn/11002/upload/webcms/content/image/2019/1/28/4f14dbb6781a4aeb957fb0ea26e686c1_0124-34%E8%AE%B0%E7%A4%BE%E5%91%98%E3%80%81%E5%B8%82%E4%BA%BA%E5%A4%A7%E4%BB%A3%E8%A1%A8%E8%AE%B8%E4%B8%BD%E8%90%8D04.webp.jpg","FROMNAME":"九三学社上海市委","SHOWTIME":"2019-01-28","RN":14},{"ID":"11194e9e341940c8ad94289acab05571","TITLE":"九三学社吉林省委专职副主委兼秘书长金国庆、常委李启云受聘成为吉林省监察委员会第一届特邀监督员","SUBTITLE":"1月8日上午，吉林省省监察委员会第一届特邀监督员会议在长春召开。中共吉林省委常委","IMAGEURL":null,"FROMNAME":"九三学社吉林省委","SHOWTIME":"2019-01-10","RN":15},{"ID":"a7c423d8f424401d8bcfd9e6734e5fec","TITLE":"云南省七名社员入选中共云南省委联系专家","SUBTITLE":"日前，根据中共云南省委联系专家服务管理有关规定，经单位推荐、行业评审、主管部门研","IMAGEURL":null,"FROMNAME":"九三学社云南省委","SHOWTIME":"2019-01-10","RN":16},{"ID":"c504ae81b0694becae68077980a794bf","TITLE":"九三学社天津市委5位市监委特约监察员列席中共天津市纪委十一届四次全会","SUBTITLE":"2018年12月13日，中共天津市纪委召开十一届四次全体会议，各区党委、政府党组","IMAGEURL":null,"FROMNAME":"九三学社天津市委","SHOWTIME":"2019-01-02","RN":17},{"ID":"7544148867bb4edda4ee63eabc1a61fb","TITLE":"贵州电视台拍摄专题片宣传九三学社社员苏跃扶贫工作先进事迹","SUBTITLE":"贵州电视台6频道《黔农再叙》栏目，以《校企桥梁\u2014\u2014苏跃》为题，拍摄了九三学社中央","IMAGEURL":null,"FROMNAME":"九三学社贵州省委","SHOWTIME":"2018-12-12","RN":18},{"ID":"6e1a10400b574486974414b0880ad87d","TITLE":"三名九三社员受聘教育部高等学校教学指导委员会","SUBTITLE":"日前，2018－2022年教育部高等学校教学指导委员会成立大会在北京国际会议中心","IMAGEURL":null,"FROMNAME":"九三学社陕西省委","SHOWTIME":"2018-11-30","RN":19},{"ID":"19b5821491994ec78520ebf25673644e","TITLE":"九三学社福建省委副主委赵静参加全国人大预算审查联系代表暨预算审查监督干部学习班","SUBTITLE":"11月12日至14日,全国人大预算审查联系代表暨预算审查监督干部学习班在福建厦门","IMAGEURL":"http://www.93.gov.cn/11002/upload/webcms/content/image/2018/11/30/eb66759a1eab45dcbf7bb358df653e7d_1127%E8%B5%B5%E9%9D%99%E5%8F%82%E5%8A%A0%E5%85%A8%E5%9B%BD%E4%BA%BA%E5%A4%A7%E9%A2%84%E7%AE%97%E5%AE%A1%E6%9F%A5%E8%81%94%E7%B3%BB%E4%BB%A3%E8%A1%A8%E6%9A%A8%E9%A2%84%E7%AE%97%E5%AE%A1%E6%9F%A5%E7%9B%91%E7%9D%A3%E5%B9%B2%E9%83%A8%E5%AD%A6%E4%B9%A0%E7%8F%AD.jpg","FROMNAME":"九三学社福建省委","SHOWTIME":"2018-11-30","RN":20},{"ID":"a52013e5e0b64460aeb1b08d9066737d","TITLE":"九三学社云南省委机关干部陈怀奇喜获云南省\u201c扶贫先进工作者\u201d荣誉称号","SUBTITLE":"10月17日，为表彰云南省在决战脱贫攻坚、决胜全面小康以来作出不懈努力和重要贡献","IMAGEURL":null,"FROMNAME":"九三学社云南省委","SHOWTIME":"2018-11-07","RN":21},{"ID":"adaf92de25c64465a6fe3bb62e29054b","TITLE":"九三社员高楠当选全国妇联第十二届执行委员会委员","SUBTITLE":"左二为高楠 中国妇女第十二次全国代表大会于2018年10月29日至11月2日在北","IMAGEURL":"http://www.93.gov.cn/11002/upload/webcms/content/image/2018/11/06/12_19_09_548_12256_e05dfc1699624f67863794192d1d24ea_hndbtdxdwmzwzewgn.png","FROMNAME":"九三学社湖南省委","SHOWTIME":"2018-11-06","RN":22},{"ID":"3a8fb45655cd4f229fb26e40885da764","TITLE":"浙江七名社员受聘为省政协应用型智库人员","SUBTITLE":"10月24日下午，浙江省政协应用型智库正式成立，王浩杰、钱前、王珂、谭健荣、赵爱","IMAGEURL":null,"FROMNAME":"九三学社浙江省委","SHOWTIME":"2018-10-26","RN":23},{"ID":"31719731","TITLE":"阎建国等8位九三学社社员被最高人民法院聘任为第三届特约监督员","SUBTITLE":"10月11日，最高人民法院举行第三届特约监督员聘任活动，阎建国、徐国权、侯华梅、","IMAGEURL":null,"FROMNAME":"九三学社中央宣传部","SHOWTIME":"2018-10-16","RN":24},{"ID":"43190cc105ae49cda839c857f777b941","TITLE":"与昆明市政府参事陈增会、王蜀面对面！听听他们都说了啥","SUBTITLE":"近日，在昆明市政府参事、市文史研究馆馆员聘任工作会上，九三学社昆明市委社员王蜀被","IMAGEURL":null,"FROMNAME":"九三学社昆明市委","SHOWTIME":"2018-07-27","RN":25},{"ID":"de4daa498e304e188b91f5fb4ffb9242","TITLE":"罗家均等5位社员受聘担任天津市监察委员会第一届特约监察员","SUBTITLE":"6月27日，天津市监察委员会召开了第一届特约监察员聘任暨培训会议，会议宣读了关于","IMAGEURL":null,"FROMNAME":"九三学社天津市委","SHOWTIME":"2018-07-09","RN":26},{"ID":"2e5594be99564c5fbc1f8d5fd5221cd4","TITLE":"叶真谭建荣被聘为浙江省政府参事","SUBTITLE":"近日，浙江省政府参事馆员工作座谈会暨新聘参事馆员聘任仪式在杭州举行。省长袁家军为","IMAGEURL":null,"FROMNAME":"九三学社浙江省委","SHOWTIME":"2018-07-04","RN":27},{"ID":"31654015","TITLE":"赵金云任读者出版集团总经理","SUBTITLE":"这一次，赵金云充当了\u201c救火员\u201d。 6月5日，读者出版集团有限公司董事长王永生被有","IMAGEURL":"http://www.93.gov.cn/11002/upload/webcms/content/image/2018/07/03/09_03_06_621_21941_64006a5c80a51c8981a623(1).jpg","FROMNAME":"团结网","SHOWTIME":"2018-07-03","RN":28},{"ID":"b7d3771c1b8144af9f09f0880b5e5750","TITLE":"黄爱龙任重庆医科大学校长","SUBTITLE":"4月11日下午，重庆医科大学在校国际学术报告厅召开干部大会，宣布重庆市委市政府关","IMAGEURL":null,"FROMNAME":"九三学社重庆市委","SHOWTIME":"2018-04-27","RN":29},{"ID":"626efe7a377a49ecb36ffbdb28e34c35","TITLE":"个旧社员被聘为市人民检察院特约检察员","SUBTITLE":"近日，个旧市人民检察院举行特约检察员聘任仪式，九三学社个旧市委专职副主委肖剑等5","IMAGEURL":null,"FROMNAME":"九三学社红河州委","SHOWTIME":"2018-04-04","RN":30}]
     */

    private String result;
    private List<DataBean> data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * ID : 39eb7ad5cf3848449a579dbb88db9a3f
         * TITLE : 李建兴挂任甘肃省张掖市人民政府副市长
         * SUBTITLE : 3月21日，中央统战部在京召开全国党外代表人士实践锻炼第七批总结交流暨第八批启动
         * IMAGEURL : http://www.93.gov.cn/11002/upload/webcms/content/image/2019/4/4/e66496709ccc4348a0b6cc9ab6dbe3e5_2.jpg
         * FROMNAME : 九三学社四川省委
         * SHOWTIME : 2019-04-04
         * RN : 11
         */

        private String ID;
        private String TITLE;
        private String SUBTITLE;
        private String IMAGEURL;
        private String FROMNAME;
        private String SHOWTIME;
        private int RN;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getTITLE() {
            return TITLE;
        }

        public void setTITLE(String TITLE) {
            this.TITLE = TITLE;
        }

        public String getSUBTITLE() {
            return SUBTITLE;
        }

        public void setSUBTITLE(String SUBTITLE) {
            this.SUBTITLE = SUBTITLE;
        }

        public String getIMAGEURL() {
            return IMAGEURL;
        }

        public void setIMAGEURL(String IMAGEURL) {
            this.IMAGEURL = IMAGEURL;
        }

        public String getFROMNAME() {
            return FROMNAME;
        }

        public void setFROMNAME(String FROMNAME) {
            this.FROMNAME = FROMNAME;
        }

        public String getSHOWTIME() {
            return SHOWTIME;
        }

        public void setSHOWTIME(String SHOWTIME) {
            this.SHOWTIME = SHOWTIME;
        }

        public int getRN() {
            return RN;
        }

        public void setRN(int RN) {
            this.RN = RN;
        }
    }
}
