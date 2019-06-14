<template>
  <el-header class="wrapper">
    <el-row>
      <el-col class="logo">
        <router-link to="/">
          <img src="./imgs/logo.svg" alt="">
        </router-link>
      </el-col>
      <el-col class="managecenter-menu">
        <el-menu :default-active="activeMenu" active-text-color="#1890ff" mode="horizontal" :router="true">
          <el-menu-item index="/manageHome/applicationManage">应用管理</el-menu-item>
          <el-menu-item index="/manageHome/productManage">产品管理</el-menu-item>
          <el-menu-item index="">订单管理</el-menu-item>
          <el-menu-item index="">数据分析</el-menu-item>
          <el-menu-item index="/manageHome/corporateCertify">企业认证审核</el-menu-item>
          <el-menu-item index="/manageHome/authorityManage">权限管理</el-menu-item>
          <el-menu-item index="/manageHome/docManage">文档管理</el-menu-item>
          <el-menu-item index="">设备管理</el-menu-item>
          <el-menu-item index="">首页管理</el-menu-item>
        </el-menu>
      </el-col>
      <el-col class="right-box">
        <div v-if="!username">
          <router-link to="/login" class="login">登录</router-link>
        </div>
        <el-dropdown class="welcome-container" trigger="hover" v-else>
            <div class="welcome-wrap">
              <div class="welcome">hello,{{username}}</div>
              <!-- <i class="el-icon-caret-bottom"/> -->
            </div>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>
                <span @click="logout">退出</span>
              </el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
      </el-col>
    </el-row>
  </el-header>
</template>

<script>

export default {
  name: '',
  data() { 
    return {
      username: this.$cookies.get('username')
    }
  },
  computed: {
    activeMenu() {
      const route = this.$route;
      const { meta, path } = route;
      if (meta.activeMenu) {
        return meta.activeMenu
      }
      return path;
    },
  },
  methods: {
    logout() {
      this.$axios.delete('/userinfo/logout').then((res) => {
        if (res.data.success === true) {
          this.$message({
            message: '退出成功',
            type: 'success'
          });
          this.$cookies.remove('username')
          this.$router.replace('/login');
        }  
      })
    }
  },
  mounted() {
    
  }
}
</script>

<style lang="stylus" scoped>
.el-menu.el-menu--horizontal
.el-menu--horizontal>.el-menu-item.is-active
  border-bottom none
  border-bottom-color transparent!important
.wrapper
  min-width 1250px
  height 60px
  box-shadow 1px 1px 5px #999
  .el-row
    display flex
    align-items center
    .logo 
      flex 1
      min-width 180px
      height 40px
      img
        height 40px
    .managecenter-menu
      flex 4
      min-width 800px
      .el-menu-item
        padding 0 15px
    .right-box
      flex 1
      min-width 180px
      float right
      display flex
      justify-content flex-end 
      .login
        font-size 14px
        color blue
        margin-right 30px
      .welcome-wrap
        margin 0 30px
        padding-top 2px
        position relative
        .welcome
          cursor pointer
          font-size 14px
        .el-icon-caret-bottom
          cursor pointer
          position absolute
          right -12px
          top 4px
          font-size 12px
</style>
