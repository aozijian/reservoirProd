<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String ctx = request.getContextPath();
    request.setAttribute("ctx", ctx);
%>
<!DOCTYPE html>

<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>水库信息化管理系统 | </title>

    <!-- Bootstrap -->
    <link href="${ctx}/thirdParty/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${ctx}/thirdParty/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${ctx}/thirdParty/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="${ctx}/thirdParty/animate/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${ctx}/build/css/custom.min.css" rel="stylesheet">
</head>

<body class="login">
<div>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form>
                    <h1>Login Form</h1>
                    <div>
                        <input type="text" id="userName" class="form-control" placeholder="用户名" required="" />
                    </div>
                    <div>
                        <input type="password" id="password" class="form-control" placeholder="密码" required="" />
                    </div>
                    <div>
                        <a class="btn btn-default submit" href="#" onclick="login()">登录</a>
                        <a class="reset_pass" href="#">忘记密码?</a>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">

                        <div class="clearfix"></div>
                        <br />

                        <div>
                            <h1><i class="fa fa-paw"></i> 水库信息化管理系统</h1>
                            <p>©2017 All Rights Reserved. </p>
                        </div>
                    </div>
                </form>
            </section>
        </div>

        <div id="register" class="animate form registration_form">
            <section class="login_content">
                <form>
                    <h1>Create Account</h1>
                    <div>
                        <input type="text" class="form-control" placeholder="Username" required="" />
                    </div>
                    <div>
                        <input type="email" class="form-control" placeholder="Email" required="" />
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="Password" required="" />
                    </div>
                    <div>
                        <a class="btn btn-default submit" href="index.html">Submit</a>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">
                        <p class="change_link">Already a member ?
                            <a href="#signin" class="to_register"> Log in </a>
                        </p>

                        <div class="clearfix"></div>
                        <br />

                        <div>
                            <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                            <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    </div>
</div>

<script src="${ctx}/thirdParty/jquery/jquery-2.1.4.min.js"></script>
<script src="${ctx}/thirdParty/layer/layer.js"></script>
<script>

    /**
     * 登录
     */
    function login() {
        if ($("#userName").val() == '') {
            $("#userName").focus();
            layer.msg('请输入用户名');
        } else if ($("#password").val() == '') {
            $("#password").focus();
            layer.msg('请输入密码');
        } else {

            layer.load(2);
            $.ajax({
                url: '${ctx}/admin/system/user/login.do',
                type: 'post',
                data: {
                    userName : $("#userName").val(),
                    password : $("#password").val()
                },
                dataType: 'json',
                success: function(result) {
                    if (result.code == 0) {
                        if (result.data == 1) {
                            window.location.href = "${ctx}/admin/index.do";
                        } else {
                            $("#userName").val('');
                            $("#password").val('');
                            layer.msg('用户名或密码错误', function() {});
                        }
                    } else {
                        layer.msg('登录异常，请与后台管理员联系');
                    }
                }

            });
        }
    }
</script>

</body>
</html>
