package com.example.hello.zhoukaomoni220170203.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */

public class showBean {
    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"好好学习","createTime":"2018-01-06T08:41:13","imgUrls":null,"jid":1009,"praiseNum":null,"shareNum":null,"uid":221,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"张倩","praiseNum":"null"}},{"commentNum":null,"content":"1111","createTime":"2017-12-31T14:48:44","imgUrls":null,"jid":1008,"praiseNum":null,"shareNum":null,"uid":10622,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"哈哈","createTime":"2017-12-30T11:39:31","imgUrls":"https://www.zhaoapi.cn/images/quarter/15146051717291514603586149.jpg","jid":1007,"praiseNum":null,"shareNum":null,"uid":92,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/151425855261420171226112227.jpg","nickname":"jinlin","praiseNum":"null"}},{"commentNum":null,"content":"我是傻逼范","createTime":"2017-12-29T17:00:43","imgUrls":"https://www.zhaoapi.cn/images/quarter/1514538043999com_bignox_app_store_hd_96x96.png","jid":1006,"praiseNum":null,"shareNum":null,"uid":160,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514537137140head.jpg","nickname":"范新华","praiseNum":"null"}},{"commentNum":null,"content":"efew","createTime":"2017-12-29T16:46:20","imgUrls":"https://www.zhaoapi.cn/images/quarter/1514537180484com_baway_liuhao1506b20170425_96x96.png","jid":1005,"praiseNum":null,"shareNum":null,"uid":160,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514537137140head.jpg","nickname":"范新华","praiseNum":"null"}},{"commentNum":null,"content":"efew","createTime":"2017-12-29T16:46:20","imgUrls":"https://www.zhaoapi.cn/images/quarter/1514537180437com_baway_liuhao1506b20170425_96x96.png","jid":1004,"praiseNum":null,"shareNum":null,"uid":160,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514537137140head.jpg","nickname":"范新华","praiseNum":"null"}},{"commentNum":null,"content":"6","createTime":"2017-12-29T09:45:34","imgUrls":"https://www.zhaoapi.cn/images/quarter/151451193490020171227-224704_clipboard.png|https://www.zhaoapi.cn/images/quarter/1514511934900big-thumbnail-1514386032712-clipboard.png","jid":1003,"praiseNum":null,"shareNum":null,"uid":169,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514355656170cropped_1514355656472.jpg","nickname":"不熟","praiseNum":"null"}},{"commentNum":null,"content":"你好世界","createTime":"2017-12-27T10:49:42","imgUrls":"https://www.zhaoapi.cn/images/quarter/1514342982944com_bignox_app_store_hd_96x96.png","jid":992,"praiseNum":null,"shareNum":null,"uid":106,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514536407781head.jpg","nickname":"刘浩","praiseNum":"null"}},{"commentNum":null,"content":"你好世界","createTime":"2017-12-27T10:45:40","imgUrls":"https://www.zhaoapi.cn/images/quarter/1514342740010com_bignox_app_store_hd_96x96.png|https://www.zhaoapi.cn/images/quarter/1514342740010com_example_ratingbar_96x96.png","jid":991,"praiseNum":null,"shareNum":null,"uid":106,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514536407781head.jpg","nickname":"刘浩","praiseNum":"null"}},{"commentNum":null,"content":"你好","createTime":"2017-12-26T11:27:12","imgUrls":"https://www.zhaoapi.cn/images/quarter/15142588320651514080581141.jpeg|https://www.zhaoapi.cn/images/quarter/15142588320651514080575785.jpeg","jid":990,"praiseNum":null,"shareNum":null,"uid":195,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514258580051mo.jpg","nickname":"nnnnnn","praiseNum":"null"}}]
     */

    private String msg;
    private String code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * commentNum : null
         * content : 好好学习
         * createTime : 2018-01-06T08:41:13
         * imgUrls : null
         * jid : 1009
         * praiseNum : null
         * shareNum : null
         * uid : 221
         * user : {"age":null,"fans":"null","follow":false,"icon":null,"nickname":"张倩","praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private Object imgUrls;
        private int jid;
        private Object praiseNum;
        private Object shareNum;
        private int uid;
        private UserBean user;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(Object imgUrls) {
            this.imgUrls = imgUrls;
        }

        public int getJid() {
            return jid;
        }

        public void setJid(int jid) {
            this.jid = jid;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public Object getShareNum() {
            return shareNum;
        }

        public void setShareNum(Object shareNum) {
            this.shareNum = shareNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : null
             * nickname : 张倩
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private Object icon;
            private String nickname;
            private String praiseNum;

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public Object getIcon() {
                return icon;
            }

            public void setIcon(Object icon) {
                this.icon = icon;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(String praiseNum) {
                this.praiseNum = praiseNum;
            }
        }
    }
}
