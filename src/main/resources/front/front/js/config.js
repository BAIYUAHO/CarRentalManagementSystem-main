
var projectName = 'Car Sales System';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: 'Personal Center',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: 'My Favorites',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: 'Information',
	url: './pages/cheliangxinxi/list.html'
}, 

{
	name: 'Announcement',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8088/springboot4c04d/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":
        [{"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"User","menuJump":"列表","tableName":"yonghu"}],"menu":"User Management"},
        {"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"Vehicle Brand","menuJump":"列表","tableName":"cheliangpinpai"}],"menu":"Brand Management"},
        {"child":[{"buttons":["Add","查看","Modify","Delete","查看评论"],"menu":"Information","menuJump":"列表","tableName":"cheliangxinxi"}],"menu":"Information Management"},
        {"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"Vehicle Color","menuJump":"列表","tableName":"cheliangyanse"}],"menu":"Color Management"},
        {"child":[{"buttons":["Add","查看","Modify","Delete","Review"],"menu":"Sales orders","menuJump":"列表","tableName":"zulindingdanliebiao"}],"menu":"Sales order management"},
        {"child":[{"buttons":["Add","查看","Modify","Delete","Review"],"menu":"Delivery Record","menuJump":"列表","tableName":"haichejilu"}],"menu":"Delivery Record Management"},
        {"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"Administrators","tableName":"users"}],"menu":"Administrator Management"},
        {"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},
        {"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"Rotating image management","tableName":"config"},{"buttons":["Add","查看","Modify","Delete"],"menu":"Announcement","tableName":"news"}],"menu":"System Management"}],
    "frontMenu":[{"child":[{"buttons":["查看","Buy"],"menu":"车辆信息列表","menuJump":"列表","tableName":"cheliangxinxi"}],"menu":"车辆信息模块"}],
    "hasBackLogin":"Yes","hasBackRegister":"No","hasFrontLogin":"No","hasFrontRegister":"No","roleName":"Administrators","tableName":"users"},



    {"backMenu":
            [{"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"User","menuJump":"列表","tableName":"yonghu"}],"menu":"User Management"},
                {"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"Vehicle Brand","menuJump":"列表","tableName":"cheliangpinpai"}],"menu":"Brand Management"},
                {"child":[{"buttons":["Add","查看","Modify","Delete","查看评论"],"menu":"Information","menuJump":"列表","tableName":"cheliangxinxi"}],"menu":"Information Management"},
                {"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"Vehicle Color","menuJump":"列表","tableName":"cheliangyanse"}],"menu":"Color Management"},
                {"child":[{"buttons":["Add","查看","Modify","Delete","Review"],"menu":"Sales orders","menuJump":"列表","tableName":"zulindingdanliebiao"}],"menu":"Sales order management"},
                {"child":[{"buttons":["Add","查看","Modify","Delete","Review"],"menu":"Delivery Record","menuJump":"列表","tableName":"haichejilu"}],"menu":"Delivery Record Management"},
                {"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},
                {"child":[{"buttons":["Add","查看","Modify","Delete"],"menu":"Rotating image management","tableName":"config"},{"buttons":["Add","查看","Modify","Delete"],"menu":"Announcement","tableName":"news"}],"menu":"System Management"}],
        "frontMenu":[{"child":[{"buttons":["查看","Buy"],"menu":"车辆信息列表","menuJump":"列表","tableName":"cheliangxinxi"}],"menu":"车辆信息模块"}],
        "hasBackLogin":"Yes","hasBackRegister":"No","hasFrontLogin":"No","hasFrontRegister":"No","roleName":"Salesperson","tableName":"users"},



    {"backMenu":[{"child":[{"buttons":["查看"],"menu":"Information","menuJump":"列表","tableName":"cheliangxinxi"}],"menu":"Information Management"},
            {"child":[{"buttons":["支付","查看","交车"],"menu":"Sales orders","menuJump":"列表","tableName":"zulindingdanliebiao"}],"menu":"Sales order management"},
            {"child":[{"buttons":["查看"],"menu":"Delivery Record","menuJump":"列表","tableName":"haichejilu"}],"menu":"Delivery Record Management"}],
        "frontMenu":[{"child":[{"buttons":["查看","Buy"],"menu":"车辆信息列表","menuJump":"列表","tableName":"cheliangxinxi"}],"menu":"车辆信息模块"}],
        "hasBackLogin":"Yes","hasBackRegister":"Yes","hasFrontLogin":"Yes","hasFrontRegister":"Yes","roleName":"User","tableName":"yonghu"}];


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    console.log("isAuth"+role);
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    console.log("isFrontAuth"+role);
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
