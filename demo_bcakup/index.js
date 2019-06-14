// 应用管理
{ path: 'applicationManage', 
redirect: '/manageHome/applicationManage/OEM', 
name: 'applicationManage',
component: resolve => require(['views/ApplicationManage/ApplicationManage'], resolve),
children: [
  { path: 'OEM', 
    name: 'OEM',
    component: resolve => require(['views/ApplicationManage/OEMApply'], resolve),
    meta: {
      activeMenu: '/manageHome/applicationManage'
    }
  },
  { path: 'SDK', 
    name: 'SDK',
    component: resolve => require(['views/ApplicationManage/SDKApply'], resolve),
    meta: {
      activeMenu: '/manageHome/applicationManage'
    }
  },
]
},
// 产品管理
{ path: 'productManage', 
  name: 'productManage',
  component: resolve => require(['views/ProductManage/ProductManage'], resolve) 
},
// 文档管理
{ path: 'docManage', 
  name: 'docManage',
  component: resolve => require(['views/DocManage/DocManage'], resolve),
},