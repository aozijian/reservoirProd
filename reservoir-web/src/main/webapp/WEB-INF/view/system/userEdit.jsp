<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/19
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../commom/ctx.jsp"></jsp:include>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>水库信息化管理系统</title>

    <link href="${ctx}/thirdParty/bootstrap/dist/css/bootstrap.min14ed.css" rel="stylesheet">
    <link href="${ctx}/thirdParty/bootstrap-switch/bootstrap-switch.min.css" rel="stylesheet">
    <link href="${ctx}/thirdParty/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="${ctx}/thirdParty/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="${ctx}/thirdParty/animate/animate.min.css" rel="stylesheet">
    <link href="${ctx}/thirdParty/style/style.min862f.css" rel="stylesheet">
    <link href="${ctx}/thirdParty/style/styles.css" rel="stylesheet">

    <style type="text/css">
        body {
            font: 14px/1.5 'Microsoft YaHei',arial,tahoma,\5b8b\4f53,sans-serif;
        }

        .ibox-content .btn-group > button {
            margin-bottom: 5px;
        }
    </style>
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content">
    <div class="row animated fadeInRight">
        <div class="ibox-content">
            <form class="form-horizontal" role="form" id="categoryInfofrm" method="post">

                <div class="ibox-content no-padding border-left-right text-center">
                    <img alt="image" class="img-responsive user-face" src="${ctx}/images/user_face.png"
                         style="margin: 0 auto; width: 120px; height: 120px;">
                    <div class="user-face">
                        <a><i class="fa fa-upload"></i>上传新头像</a>
                    </div>
                </div>

                <div class="form-group">
                    <label for="userName" class="col-sm-2 control-label">用户名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="userName" name="userName" value="" placeholder="这里填写用户名">
                    </div>
                </div>

                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="password" name="password" value="" placeholder="这里填写密码">
                    </div>
                </div>

                <div class="form-group">
                    <label for="passwordConfirm" class="col-sm-2 control-label">确认密码</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="passwordConfirm" name="passwordConfirm" value="" placeholder="确认密码">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">性别</label>
                    <div class="col-sm-10">
                        <input id="gender" name="gender" type="checkbox" />
                    </div>
                </div>

                <div class="form-group">
                    <label for="roleId" class="col-sm-2 control-label">角色</label>
                    <div class="col-sm-10">
                        <select class="form-control" id="roleId" name="roleId">

                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-2">
                    </div>
                    <div class="col-sm-10">
                        <button class="btn btn-primary" type="button" id="btn_submit">保存</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>


<script src="${ctx}/thirdParty/jquery/jquery-2.1.4.min.js"></script>
<script src="${ctx}/js/format.js"></script>
<script src="${ctx}/thirdParty/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${ctx}/thirdParty/bootstrap-switch/bootstrap-switch.min.js"></script>
<script src="${ctx}/thirdParty/jquery/peity/jquery.peity.min.js"></script>
<script src="${ctx}/thirdParty/content/content.min.js"></script>
<script src="${ctx}/thirdParty/jquery/jquery-validation-1.15.0/jquery.validate.min.js"></script>
<script src="${ctx}/thirdParty/bootbox/bootbox.min.js"></script>
<script src="${ctx}/thirdParty/bootstrap-table/bootstrap-table.min.js"></script>
<script src="${ctx}/thirdParty/bootstrap-table/bootstrap-table-zh-CN.min.js"></script>
<script src="${ctx}/thirdParty/layer/layer.js"></script>
<script>
    //初始化开关
    $('[name="gender"]').bootstrapSwitch({
        onText:"男",
        offText:"女",
        onColor:"success",
        offColor:"info",
        size:"normal",
        onSwitchChange:function(event,state){
            if(state==true){
                $(this).val(1);
            }else{
                $(this).val(2);
            }
        }
    });
</script>
</body>
</html>