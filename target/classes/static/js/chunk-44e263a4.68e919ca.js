(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-44e263a4"],{"3a0c":function(t,i,e){"use strict";e.r(i);var o=function(){var t=this,i=t.$createElement,e=t._self._c||i;return e("div",{staticStyle:{"background-color":"#F5F5F5"}},[e("el-container",{staticStyle:{width:"70%",margin:"0 auto"}},[e("el-header",{staticStyle:{width:"0",height:"0"}}),e("Header"),e("el-carousel",{attrs:{height:"250px"}},t._l(t.urls,(function(t){return e("el-carousel-item",{key:t.id},[e("img",{staticStyle:{width:"100%"},attrs:{src:t.idView}})])})),1),e("el-main",{staticStyle:{height:"1000px","background-color":"#8FC0A9"}},[e("div",[e("div",{staticStyle:{display:"flex"}},[e("div",{staticClass:"spr1"},[e("h3",[t._v("-聚焦社会新公益-")]),e("div",[e("ul",[e("li",{staticStyle:{"margin-top":"20px"},on:{click:function(i){return t.goOut(0)}}},[t._v("在中国推广“循环农业”的日本老头")]),e("li",{staticStyle:{"margin-top":"20px"},on:{click:function(i){return t.goOut(1)}}},[t._v("第七届中国环境院所长论坛在南京举行")]),e("li",{staticStyle:{"margin-top":"20px"},on:{click:function(i){return t.goOut(2)}}},[t._v("科技赋能文物保护：让千年海外流失文物魂归故里")]),e("li",{staticStyle:{"margin-top":"20px"},on:{click:function(i){return t.goOut(3)}}},[t._v("无需言说的故事")]),e("li",{staticStyle:{"margin-top":"20px"},on:{click:function(i){return t.goOut(4)}}},[t._v("彩虹桥·为半心宝贝加油！系列活动")])])])]),e("div",{staticClass:"spr"},[e("h3",[t._v("-校园公益活动-")]),t._l(t.sports,(function(i){return e("div",{key:i.postId,staticStyle:{"background-color":"#FAF3DD","margin-top":"20px",display:"flex","text-align":"center"}},[e("img",{staticStyle:{width:"150px",height:"120px"},attrs:{src:i.sportOther}}),e("div",{staticStyle:{"margin-left":"80px"}},[e("h4",[t._v(t._s(i.sportName))]),e("el-button",{attrs:{type:"danger"},on:{click:function(e){return t.sportDetail(i.sportId)}}},[t._v("参与")])],1)])}))],2)]),e("div",{staticStyle:{display:"flex"}},[e("div",{staticClass:"spr1"},[e("h3",[t._v("-财报公示-")]),e("ul",[e("li",{staticStyle:{"margin-top":"10px"}},[t._v("一月份收益：15")]),e("li",{staticStyle:{"margin-top":"10px"}},[t._v("二月份收益：10")]),e("li",{staticStyle:{"margin-top":"10px"}},[t._v("三月份收益：8")]),e("li",{staticStyle:{"margin-top":"10px"}},[t._v("四月份收益：6")]),e("li",{staticStyle:{"margin-top":"10px"}},[t._v("五月份收益：25")])])]),e("div",{staticClass:"spr"},[e("h3",[t._v("-绿色价值观-")]),e("img",{staticStyle:{width:"400px"},attrs:{src:t.greenImg}})])])])]),e("Footer")],1)],1)},r=[],a=e("0418"),s=e("fd2d"),n={name:"Sport",components:{Header:a["a"],Footer:s["a"]},data:function(){return{greenImg:e("7fad"),page:1,urls:[{id:0,idView:e("fcb4")},{id:1,idView:e("a0db")},{id:2,idView:e("f7fc")}],hrefUrl:["http://gongyi.163.com/16/0518/18/BNCBEHNU009364A3.html","http://gongyi.163.com/18/0604/14/DJFCL20F00933KC8.html","https://dy.163.com/article/FKFCKMRL0514R9KE.html?referFrom=","https://go.163.com/web/20180703_netease_charity/index.html","http://gongyi.163.com/16/0407/10/BK1T530A009364A4.html"],sports:[],sport:{sportId:null,sportName:null,sportOther:""}}},methods:{goOut:function(t){window.location.href=this.hrefUrl[t]},sportDetail:function(t){localStorage.setItem("sportID",t),this.$router.push("/sportDetail")}},created:function(){var t=this;this.$http({method:"POST",url:"http://localhost:8083/sport/showAll",params:{page:this.page}}).then((function(i){for(var o in console.log(i.data),i.data)t.sport=i.data[o],t.sport.sportOther=e("0786")("./"+i.data[o].sportOther),t.sports.push(t.sport)})).catch((function(t){console.log(t)}))}},c=n,l=(e("c76e"),e("2877")),p=Object(l["a"])(c,o,r,!1,null,"588e5288",null);i["default"]=p.exports},"7fad":function(t,i,e){t.exports=e.p+"img/ccc.154e7fd6.jpg"},"8f7e":function(t,i,e){},c76e:function(t,i,e){"use strict";var o=e("8f7e"),r=e.n(o);r.a}}]);
//# sourceMappingURL=chunk-44e263a4.68e919ca.js.map