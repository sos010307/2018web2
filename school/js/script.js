var img = $(".slider");
var img2 = $("#popslide > img");
var cnt = 0;
var cnt2 = 0;
var max = img.length-1;
var max2 = img2.length-1;
var ntctype = "";
var today = new Date();
var date = today.getDate();
var month = today.getMonth()+1;
var year = today.getFullYear();
var weekset = new Array('일요일','월요일','화요일','수요일','목요일','금요일','토요일');
var week = today.getDay();

function getdate(){
    $(".year").html(year);
    $(".month").html(month);
    $(".date").html(date);
    $(".dof").html(weekset[today.week]);
}
function nextday(){

}
$(window).on("load",getdate)
function slide(){
    $(img[cnt]).siblings(".slider").css({left:"100%"});
    $(img[cnt]).animate({left:"-100%"},function(){
        $(this).css({left:"100%"})
    })
    cnt++;
    if(cnt>max)cnt=0;
    $(img[cnt]).animate({left:"0"});
}
setInterval(slide,4000);

$(".ntc > .fl").on("click",function(){
    ntctype = $(this).attr("data");
    $(this).addClass("selntc");
    $(this).siblings().removeClass("selntc");
    $("."+ntctype).show();
    $("."+ntctype).siblings(".ncnt").hide();
})
function popslide(){
    $(img2[cnt2]).siblings(".pop").fadeOut();
    $(img2[cnt2]).fadeOut();
    cnt2++;
    if(cnt2>max2)cnt2=0;
    $(img2[cnt2]).fadeIn(1500);
}

setInterval(popslide,3000);
