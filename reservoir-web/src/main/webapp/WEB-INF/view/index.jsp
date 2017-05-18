<%--
  Created by IntelliJ IDEA.
  User: aozijian
  Date: 2017/5/15
  Time: 上午1:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="commom/ctx.jsp"></jsp:include>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>水库信息化管理系统</title>

    <!-- Bootstrap -->
    <link href="${ctx}/thirdParty/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${ctx}/thirdParty/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${ctx}/thirdParty/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="${ctx}/thirdParty/iCheck/skins/flat/green.css" rel="stylesheet">

    <!-- bootstrap-progressbar -->
    <link href="${ctx}/thirdParty/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <!-- JQVMap -->
    <link href="${ctx}/thirdParty/jqvmap/dist/jqvmap.min.css" rel="stylesheet"/>
    <!-- bootstrap-daterangepicker -->
    <link href="${ctx}/thirdParty/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${ctx}/build/css/custom.min.css" rel="stylesheet">

    <style type="text/css">
        body {
            font: 14px/1.5 'Microsoft YaHei',arial,tahoma,\5b8b\4f53,sans-serif;
        }
    </style>
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <div class="navbar nav_title" style="border: 0;">
                    <a href="index.jsp" class="site_title"><i class="fa fa-paw"></i> <span>水库信息化系统</span></a>
                </div>

                <div class="clearfix"></div>

                <!-- menu profile quick info -->
                <div class="profile clearfix">
                    <div class="profile_pic">
                        <img src="${ctx}/images/${user.headImg}" alt="..." class="img-circle profile_img">
                    </div>
                    <div class="profile_info">
                        <span>欢迎,</span>
                        <h2>${user.userName}</h2>
                    </div>
                </div>
                <!-- /menu profile quick info -->

                <br />

                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <ul id="sidebarMenu" class="nav side-menu">
                            <li><a><i class="fa fa-home"></i> 后台管理 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="${ctx}/admin/system/user/jumpToList.do" target="main-iframe">用户管理</a></li>
                                    <li><a href="index2.html">Dashboard2</a></li>
                                    <li><a href="index3.html">Dashboard3</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-edit"></i> Forms <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="form.html">General Form</a></li>
                                    <li><a href="form_advanced.html">Advanced Components</a></li>
                                    <li><a href="form_validation.html">Form Validation</a></li>
                                    <li><a href="form_wizards.html">Form Wizard</a></li>
                                    <li><a href="form_upload.html">Form Upload</a></li>
                                    <li><a href="form_buttons.html">Form Buttons</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-desktop"></i> UI Elements <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="general_elements.html">General Elements</a></li>
                                    <li><a href="media_gallery.html">Media Gallery</a></li>
                                    <li><a href="typography.html">Typography</a></li>
                                    <li><a href="icons.html">Icons</a></li>
                                    <li><a href="glyphicons.html">Glyphicons</a></li>
                                    <li><a href="widgets.html">Widgets</a></li>
                                    <li><a href="invoice.html">Invoice</a></li>
                                    <li><a href="inbox.html">Inbox</a></li>
                                    <li><a href="calendar.html">Calendar</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-table"></i> Tables <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="tables.html">Tables</a></li>
                                    <li><a href="tables_dynamic.html">Table Dynamic</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-bar-chart-o"></i> Data Presentation <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="chartjs.html">Chart JS</a></li>
                                    <li><a href="chartjs2.html">Chart JS2</a></li>
                                    <li><a href="morisjs.html">Moris JS</a></li>
                                    <li><a href="echarts.html">ECharts</a></li>
                                    <li><a href="other_charts.html">Other Charts</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-clone"></i>Layouts <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="fixed_sidebar.html">Fixed Sidebar</a></li>
                                    <li><a href="fixed_footer.html">Fixed Footer</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>

                </div>
                <!-- /sidebar menu -->

                <!-- /menu footer buttons -->
                <div class="sidebar-footer hidden-small">
                    <a data-toggle="tooltip" data-placement="top" title="Settings">
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                        <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Lock">
                        <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                        <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                    </a>
                </div>
                <!-- /menu footer buttons -->
            </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
            <div class="nav_menu">
                <nav>
                    <div class="nav toggle">
                        <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                    </div>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                <img src="${ctx}/images/${user.headImg}" alt="">${user.userName}
                                <span class=" fa fa-angle-down"></span>
                            </a>
                            <ul class="dropdown-menu dropdown-usermenu pull-right">
                                <li><a href="javascript:;"> 查看资料</a></li>
                                <li><a href="javascript:;"><span>设置</span></a></li>
                                <li><a href="${ctx}/login/index.jsp"><i class="fa fa-sign-out pull-right"></i>注销</a></li>
                            </ul>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
            <iframe style="width: 100%; height: 600px" frameborder="0" name="main-iframe"></iframe>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
            <div class="pull-right">
                敖梓坚 - 水库信息化系统
            </div>
            <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
    </div>
</div>

<!-- jQuery -->
<script src="${ctx}/thirdParty/jquery/jquery-2.1.4.min.js"></script>
<!-- Bootstrap -->
<script src="${ctx}/thirdParty/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="${ctx}/thirdParty/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="${ctx}/thirdParty/nprogress/nprogress.js"></script>
<!-- Chart.js -->
<script src="${ctx}/thirdParty/Chart.js/dist/Chart.min.js"></script>
<!-- gauge.js -->
<script src="${ctx}/thirdParty/gauge.js/dist/gauge.min.js"></script>
<!-- bootstrap-progressbar -->
<script src="${ctx}/thirdParty/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
<!-- iCheck -->
<script src="${ctx}/thirdParty/iCheck/icheck.min.js"></script>
<!-- Skycons -->
<script src="${ctx}/thirdParty/skycons/skycons.js"></script>
<!-- Flot -->
<script src="${ctx}/thirdParty/Flot/jquery.flot.js"></script>
<script src="${ctx}/thirdParty/Flot/jquery.flot.pie.js"></script>
<script src="${ctx}/thirdParty/Flot/jquery.flot.time.js"></script>
<script src="${ctx}/thirdParty/Flot/jquery.flot.stack.js"></script>
<script src="${ctx}/thirdParty/Flot/jquery.flot.resize.js"></script>
<!-- Flot plugins -->
<script src="${ctx}/thirdParty/flot.orderbars/js/jquery.flot.orderBars.js"></script>
<script src="${ctx}/thirdParty/flot-spline/js/jquery.flot.spline.min.js"></script>
<script src="${ctx}/thirdParty/flot.curvedlines/curvedLines.js"></script>
<!-- DateJS -->
<script src="${ctx}/thirdParty/DateJS/build/date.js"></script>
<!-- JQVMap -->
<script src="${ctx}/thirdParty/jqvmap/dist/jquery.vmap.js"></script>
<script src="${ctx}/thirdParty/jqvmap/dist/maps/jquery.vmap.world.js"></script>
<script src="${ctx}/thirdParty/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
<!-- bootstrap-daterangepicker -->
<script src="${ctx}/thirdParty/moment/min/moment.min.js"></script>
<script src="${ctx}/thirdParty/bootstrap-daterangepicker/daterangepicker.js"></script>

<!-- Custom Theme Scripts -->
<script src="${ctx}/build/js/custom.min.js"></script>

<script>
    $(document).ready(function() {
        //获取角色ID
        var roleId = "${user.roleId}";
        //加载左侧手风琴菜单
//        loadMenus(roleId);
    });

    /**
     * 加载手风琴菜单
     * @param roleId
     */
    function loadMenus(roleId) {
        //获取一级菜单
        $.ajax({
            type: "get",
            url: "${ctx}/admin/system/rightsMgt/roleMenuMgt/getFirstMenuByRoleId.do?roleId=" + roleId,
            dataType: "json",
            success: function (result) {
                if (result && result.length > 0) {
                    $.each(result, function (i, item) {
                        //渲染一级菜单
                        $("#sidebarMenu").append("<li id='" + i + "'><a>"+item.name+"<span class='fa fa-chevron-down'></span></a></li>");

                        //获取二级菜单
                        $.ajax({
                            type: 'get',
                            url: '${ctx}/admin/system/rightsMgt/roleMenuMgt/getMenuByParentIdAndRoleId.do?roleId=' + roleId + "&parentId=" + item.id,
                            dataType: 'json',
                            success: function (data) {
                                //渲染二级菜单
                                $("#sidebarMenu #" + i).append('<ul id="childUL'+i+'" class="nav child_menu"></ul>');
                                $.each(data, function (j, child) {
                                    $("#childUL" + i).append('<li><a href="#">'+child.name+'</a></li>');
                                });
                            }
                        });

                        $("#" + i).click(function () {
                            var classType = $(this).prop('class');
                            if(classType == null || classType == '') {
                                $(this).prop('class', 'active');
                                $("#childUL" + i).css('display', 'block');
                            } else {
                                $(this).prop('class', '');
                                $("#childUL" + i).css('display', 'none');
                            }
                        });
                    });
                }
            }
        });
    }


</script>

</body>
</html>
