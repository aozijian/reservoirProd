<%--
  Created by IntelliJ IDEA.
  User: aozijian
  Date: 2017/5/15
  Time: 上午1:37
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

            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5><i class="fa fa-info"></i> 用户信息管理</h5>
                        <div class="ibox-tools pull-right">
                            <a class="collapse-link" title="收起/展开">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="close-link" title="关闭">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <div class="btn-group">
                            <button data-toggle="dropdown" class="btn btn-primary btn-sm dropdown-toggle"
                                    aria-expanded="true">
                                <i class="glyphicon glyphicon-edit"></i> 操作 <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <li><a href="#"><i class="fa fa-plus-circle" aria-hidden="true"></i> 添加用户</a></li>
                                <li class="divider"></li>
                                <li><a href="#"><i class="fa fa-trash" aria-hidden="true"></i> 删除所选用户</a></li>
                            </ul>
                        </div>

                        <%--搜索框--%>
                        <form class="form-inline" style="float: right">

                            <div class="form-group">
                                <input id="idSearch" class="form-control" type="text" placeholder="用户ID" />
                                <input id="userNameSearch" class="form-control" type="text" placeholder="用户名" />
                                <select class="form-control" id="roleIdSearch" name="roleId">
                                    <option>用户角色</option>
                                </select>
                                <select class="form-control" id="genderSearch" name="roleId">
                                    <option>用户性别</option>
                                    <option value="1">男</option>
                                    <option value="2">女</option>
                                </select>
                            </div>
                            <button type="button" id="searchBtn" class="btn btn-primary"><i class="fa fa-search"></i>筛选</button>
                        </form>

                        <div class="table-responsive">
                            <table id="userList" data-mobile-responsive="true"></table>
                        </div>
                    </div>
                </div>
            </div>

    </div>
</div>

<script src="${ctx}/thirdParty/jquery/jquery-2.1.4.min.js"></script>
<script src="${ctx}/js/format.js"></script>
<script src="${ctx}/thirdParty/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${ctx}/thirdParty/jquery/peity/jquery.peity.min.js"></script>
<script src="${ctx}/thirdParty/content/content.min.js"></script>
<script src="${ctx}/thirdParty/jquery/jquery-validation-1.15.0/jquery.validate.min.js"></script>
<script src="${ctx}/thirdParty/bootbox/bootbox.min.js"></script>
<script src="${ctx}/thirdParty/bootstrap-table/bootstrap-table.min.js"></script>
<script src="${ctx}/thirdParty/bootstrap-table/bootstrap-table-zh-CN.min.js"></script>

<script>
    $(document).ready(function() {
        loadTable();
    });

    /**
     * 加载表
     */
    function loadTable() {
        var $table = $('#userList');
        $table.bootstrapTable({
            method:'get',
            url:'${ctx}/admin/system/user/getUserList.do',
            dataType: "json",
            striped: true,	 //使表格带有条纹
            pagination: true,	//在表格底部显示分页工具栏
            pageSize: 10,
            pageList: [10, 20, 50, 100, 200, 500],

            queryParamsType: "limit", //参数格式,发送标准的RESTFul类型的参数请求
            //查询参数,每次调用是会带上这个参数，可自定义
            queryParams: function(params) {
                var idSearch = $("#idSearch").val();
                var userNameSearch = $("#userNameSearch").val();
                var roleIdSearch = $("#roleIdSearch").val();
                var genderSearch = $("#genderSearch").prop("value");
                return {
                    pageIndex : params.offset,
                    pageSize : params.limit,
                    idSearch : idSearch,
                    userNameSearch : userNameSearch,
                    roleIdSearch : roleIdSearch,
                    genderSearch : genderSearch
                };
            },
            sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）

            idField: "id",  //标识哪个字段为id主键
            showToggle: true,   //名片格式
            cardView: true,//设置为True时显示名片（card）布局
            showColumns: true, //显示隐藏列
            showRefresh: true,  //显示刷新按钮
            search: false,//是否显示右上角的搜索框
            columns:[{
                checkbox: true
            }, {
                field: 'id',
                title: '用户ID',
                sortable: true
            }, {
                field: 'userName',
                title: '用户名',
                sortable: true
            }, {
                field: 'roleId',
                title: '角色',
                sortable: true,
                formatter: function (value) {
                    if (value == 1) {
                        return '后台管理员';
                    } else if (value == 2) {
                        return '水库监测员';
                    } else if (value == 3) {
                        return '水库系统管理员';
                    } else if (value == 4) {
                        return '水库调度员';
                    } else if (value == 5) {
                        return '超级管理员';
                    } else {
                        return '';
                    }
                }
            }, {
                field: 'gender',
                title: '性别',
                sortable: true,
                formatter: function (value) {
                    if (value == 1) {
                        return '男';
                    } else {
                        return '女';
                    }
                }
            }, {
                field: 'createTime',
                title: '创建时间',
                sortable: true,
                formatter: function (value, row, index) {
                    if (value == "") {
                        return "";
                    } else {
                        var date = new Date(value);
                        return date.format("yyyy-MM-dd hh:mm:ss");
                    }
                }
            }, {
                field: 'modifyTime',
                title: '修改时间',
                sortable: true,
                formatter: function (value, row, index) {
                    if (value == "" || null == value) {
                        return "";
                    } else {
                        var date = new Date(value);
                        return date.format("yyyy-MM-dd hh:mm:ss");
                    }
                }
            }, {
                title: '操作',
                align: 'center',
                formatter: operateFormatter
            }],
            formatLoadingMessage: function () {
                return "请稍等，正在加载中...";
            },
            formatNoMatches: function () {  //没有匹配的结果
                return '无符合条件的记录';
            },
            onLoadError: function (data) {
                $('#articleList').bootstrapTable('removeAll');
            },
            onDblClickRow: function (row) {
                showDetails(row.id);
            },
            formatShowingRows: function (pageFrom, pageTo, totalRows) {
                return '显示第 ' + pageFrom + ' 到第 ' + pageTo + ' 条记录，总共 ' + totalRows + ' 条记录';
            },
            formatRecordsPerPage: function (pageNumber) {
                return '每页显示 ' + pageNumber + ' 条记录';
            }
        });
    }

    /**
     * 操作
     * @param value
     * @param row
     * @param index
     * @returns {string}
     */
    function operateFormatter(value, row, index) {
        return [
            "<button class='btn btn-xs btn-default' onclick='edit(\""+row.id+"\" , \""+row.type+"\")'>编辑</button>"
        ].join("");
    }

    /**
     * 查看详情
     * @param id
     */
    function showDetails(id) {

    }

    //搜索
    $("#searchBtn").click(function () {
        $('#userList').bootstrapTable('refresh');
    });

</script>

</body>
</html>
