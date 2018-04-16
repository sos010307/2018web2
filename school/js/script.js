var img = $(".slider");
var cnt = 0;
var max = img.length-1;
function slide(){
    $(img[cnt]).siblings("img").css({left:"100%"});
    $(img[cnt]).animate({left:"-100%"},function(){
      $(this).css({left:"100%"})
    })
    console.log(cnt);
    cnt++;
    if(cnt>max)cnt=0;
    $(img[cnt]).animate({left:"0"});
}
setInterval(slide,2500);
