function setXY(conn){
  var con = $(conn);
  var cw = con.width();
  var ch = con.height();
  var ww = $(window).width();
  var wh = $(window).height();
  con.css({left:(ww-cw)/2+"px"});
}
var img = $(".image");
var cnt = 0;
var max = img.length-1;

function next(){
    if(img.is(":animated"))return false;
    $(img[cnt]).siblings().css({"left":"100%"});
    $(img[cnt]).animate({"left":"-100%"},function(){
        $(this).css({"left":"100%"});
    });
    cnt++;
    if(cnt>max)cnt=0;
    $(img[cnt]).animate({"left":0});
};

function prev(){
    if(img.is(":animated"))return false;
    $(img[cnt]).siblings().css({"left":"-100%"});
    $(img[cnt]).animate({"left":"100%"},function(){
        $(this).css({"left":"-100%"});
    });
    cnt--;
    if(cnt<0)cnt=max;
    $(img[cnt]).animate({"left":0,});
};

$(window).on("load",setXY("#slideBox"));
$(window).on("resize",function(){
  setXY("#slideBox");
});
// setInterval(next,2000);
$(document).keydown(function(event) {
  if (event.keyCode == '37') {
    prev();
  }
  else if (event.keyCode == '39') {
    next();
  }
});
