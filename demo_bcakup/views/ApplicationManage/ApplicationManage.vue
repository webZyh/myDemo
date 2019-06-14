<template>
  <div class="application-manage">
    应用管理
    <el-row type="flex" :gutter="20" justify="space-between">
      <el-col :span="3" class="menu-wrapper">
        <el-menu
          :default-active="$route.path"
          mode="vertical"
          :unique-opened="true"
          :router="true"
          background-color="#545c64"
          text-color="#fff"
          :collapse-transition="false"
          class="side-menu"
          id="menu">
          <el-menu-item index="/manageHome/applicationManage/OEM">
            <span>公版OEM申请</span>
          </el-menu-item>
          <el-menu-item index="/manageHome/applicationManage/SDK">
            <span>SDK申请</span>
          </el-menu-item>
        </el-menu>
      </el-col>
      <el-col :span="21" class="content-wrapper" id="content">
        <router-view></router-view>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: '',
  data() { 
    return {

    }
  },
  created() {
    
  },
  /* mounted() {
    this.$nextTick(() => {
      this.setElMenuHeight()
    })
  },
  computed: {
    menuHeight() {
      const oCont = document.getElementById('content');
      return oCont.offsetHeight;
    },
  },
  methods: {
    setElMenuHeight() {
      const oMenu = document.getElementById('menu');
      oMenu.style.height = `${this.menuHeight}px`;
    }
  }, */
}
</script>

<style lang="stylus" scoped>
.application-manage
  padding 10px 20px 0 10px
  min-width 1250px
  margin 0 auto 
  .menu-wrapper
    .el-menu  
      min-height 150px
      border-radius 0 0 5px 5px
  .content-wrapper
    border 1px solid #ccc
    border-radius 5px
    padding 0 20px
</style>
