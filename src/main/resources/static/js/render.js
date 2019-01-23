function tr(){
    var questions = [{
        type: 1,
        title: '上网占据了我生活的大部分时间。',
    },{
        type: 1,
        title: '断网比断雕还要让我难以忍受。',
    },{
        type: 1,
        title: '我上网，越上越久、越上越长。',
    },{
        type: 1,
        title: '我曾因上严重网影响了学习、工作或其他社会活动。',
    },{
        type: 0,
        title: '对网络上的各种信息，我有非常理性的见解和判断。',
    },{
        type: 1,
        title: '网络曾改变过我的一些态度和观点。',
    },{
        type: 0,
        title: '被网友武断的贴标签我也毫不在乎。',
    },{
        type: 1,
        title: '大V的建议就是我的意见。',
    },{
        type: 1,
        title: '比起实体店，我更喜欢网上消费。',
    },{
        type: 1,
        title: '我是个王者，骚起来的时候，我妈都不知道我是谁。',
    },{
        type: 0,
        title: '我发的照片从来都不美颜或PS。',
    },{
        type: 1,
        title: '现实生活总是不尽人意',
    },{
        type: 1,
        title: '孤独是我的底色。',
    },{
        type: 1,
        title: '不在乎他人对我的评价，更喜欢一个人自由自在。',
    },{
        type: 1,
        title: '说起冲动消费，我不是针对谁，在座的各位都是垃圾。',
    },{
        type: 1,
        title: '我在网上不断寻求新世界的大门。',
    },{
        type: 1,
        title: '匿名的我更加放飞自己，好嗨哟，感觉灵魂达到了高潮。',
    },{
        type: 0,
        title: '我是一个有强烈想法但从不在网络上表达的人。',
    },{
        type: 1,
        title: '我上网是为了思考人生。',
    },{
        type: 1,
        title: '娱乐节目占据了我大部分的上网时间。',
    },{
        type: 1,
        title: '网上发生什么热门事件的时候，我总喜欢插上一脚，不怕事多。',
    },{
        type: 1,
        title: '我消费过爆款产品。',
    },{
        type: 1,
        title: '屎不一定拉得出来，手机一定要掏出来。',
    },{
        type: 1,
        title: '网友都说PHP是个极其优秀的艺术小组，我觉得对。',
    }];
    questions.forEach(function(item, index){
        item.key = index;
    })


    var ren = {
        render:function () {
            var randQuestions = questions.concat();
            randQuestions.sort(function(a,b){ return Math.random()>0.5 ? -1 : 1;})
            var str = "";
            randQuestions.forEach(function (item, index) {
                str += "<div class='item'>" +
                    "<div>" +(index + 1)+". " +"<span>"+item.title+"</span></div>" +
                    "<div><label><input name="+item.key+" type='radio' value='1' />是 </label> \n" +
                    "<label><input name="+item.key+" type='radio' value='0' />不确定 </label> \n" +
                    "<label><input name="+item.key+" type='radio' value='2' />否 </label> </div>"+
                    "</div>"
            })
            $("#list").html(str)
        },
        submit:function (data) {
            if(data.length < 2){
                alert("未完成！！")
            }else {
                var map = {};
                data.forEach(function (item) {
                    map[item.name] = item.value;
                })
                var result = [0,0,0,0,0,0];
                $("#qt").hide();
                $("#rp").show();
                $("#name").text(map.name);
                $("#name2").text(map.name);
                $("#age").text(map.age);
                $("#sex").text(map.sex);
                $("#id").text("0001");
                $("#date").text(getNowFormatDate());
                questions.forEach(function (value, index) {
                    var cgIndx = Math.ceil((index + 1)/4) - 1;
                    var val = map[index]
                    if(value.type === 1 && val == 1){
                        result[cgIndx] ++;
                    }else if(value.type === 0 && val == 2){
                        result[cgIndx] ++;
                    }else if(val == 0){
                        result[cgIndx] ++;
                    }
                });
                var hex = document.getElementById("chart");
                var ability_value = new Object;
                var ability_name = new Object;
                var total = 0;
                result.forEach(function (value, index) {
                    $('#qstar' + index).html(renderStars(value));
                    total += result[index];
                    ability_value[index] = result[index] / 4;
                })
                $("#result").text(parseResult(total));
                //设置能力属性名
                ability_name[0] = '网断人亡';
                ability_name[1] = '再造之恩';
                ability_name[2] = '超凡脱俗';
                ability_name[3] = '天资过人';
                ability_name[4] = '播穅眯目';
                ability_name[5] = '不明觉厉';
                polygon(hex, 6, 6, ability_value, ability_name);
                window.print();
            }
        }
    }
    return ren;
}




window.onload = function (ev) {
    var ren = tr();
    ren.render();
    $('#sub').click(function () {
        ren.submit($('#form').serializeArray())
    })
}

function renderStars(num) {
    var str = "<ul class='cleanfloat'>";
    for (var i=0; i< num; i++){
        str += "<li>&#9733;</li>"
    }
    for (var i=num; i<4; i++){
        str += "<li>&#9734;</li>"
    }
    str += "</ul>";
    return str;
}

function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + '年' + month + '月' + strDate + '日';
    return currentdate;
}


//绘制多边形能力图
function polygon(obj, side, part, ability_value, ability_name) {
    var ability = obj.getContext('2d');
    ability.canvas.width = 500;
    ability.canvas.height = 250;
    var width = obj.width;
    var height = obj.height;
    var xCenter = width * 0.5;
    var yCenter = height * 0.5;
    var radius = width * 0.2;
    var space = radius/part;
    var theta = Math.PI*2/side;
    var points = [];
    //绘制渐变多边形底层
    for (var j=part;j>=part;j--) {
        ability.beginPath();

        for (var i=0; i<=side; i++) {
            var point = {x: Math.cos(i*theta)*space*j+xCenter, y: -Math.sin(i*theta)*space*j+yCenter};
            ability.lineTo(point.x, point.y);
            points.push(point)
        }
        var r=73, g=101,b=115;
        ability.strokeStyle="rgba(0,0,0,1)";
        ability.lineWidth = 1;
        ability.stroke();
        // ability.fillStyle = "rgba("+73+","+101+","+115+"," + 0.4 + ")";
        // ability.fill();
        ability.closePath();
    }
    for (var i=0; i<side/2; i++){
        ability.beginPath();
        ability.lineTo(points[i].x, points[i].y);
        ability.lineTo(points[i + side/2].x, points[i + side/2].y);
        ability.strokeStyle="rgba(0,0,0,1)";
        ability.lineWidth = 1;
        ability.stroke();
        ability.closePath();
    }

    //绘制能力多边形
    ability.beginPath();
    var pointsAb = [];
    for (var i=0; i<=side; i++) {
        var x = Math.cos(i*theta)*radius*ability_value[i%side]+xCenter;
        var y = -Math.sin(i*theta)*radius*ability_value[i%side]+yCenter;
        ability.lineTo(x,y);
        pointsAb.push({x:x, y:y});

    }
    ability.strokeStyle="rgba(26, 120, 240, 0.8)";
    ability.lineWidth = 5;
    ability.stroke();
    ability.closePath();
    pointsAb.forEach(function (point) {
        drawPoint(ability, point.x, point.y, 5);
    })

    //绘制字体
    for (var i=0; i<side; i++) {
        ability.fillStyle="rgba(0,0,0,1)";
        ability.font = "normal 15px Microsoft Yahei";
        var x;
        var y;
        if (Math.cos(i*theta)*radius>0) {
            x = Math.cos(i*theta)*radius-24 + xCenter;
            y = -Math.sin(i*theta)*radius*1.3 + yCenter;
        } else {
            x = Math.cos(i*theta)*radius-24 + xCenter;
            y = -Math.sin(i*theta)*radius*1.3 + yCenter;
        }
        if(i<= Math.floor(side/2)){
            y += 10;
            if(i == 0){
                x+=30;
                y -= 5;
            }else if(i==Math.floor(side/2)) {
                x-=40;
                y -= 5;
            }
        }
        ability.fillText(ability_name[i],x,y);
    }
}

function drawPoint(ctx, x, y, r) {
    ctx.beginPath();
    ctx.arc(x, y, r, 0, 2*Math.PI, true);
    ctx.fillStyle ="#000000";
    ctx.fill();
    ctx.closePath();
}


function parseResult(result) {
    if(result<4){
        return "妙不可言"
    }
    if(result<8){
        return "很轻"
    }
    if(result < 12){
        return "轻度"
    }
    if(result < 16){
        return "中度"
    }
    if(result < 20){
        return "偏重"
    }
    if(result < 24){
        return "重度"
    }
    return "天下无双"
}
