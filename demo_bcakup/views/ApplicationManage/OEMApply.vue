<template>
  <div class="OEM-wrapper">
    <el-row class="breadcrumb">
      <el-breadcrumb separator-class="el-icon-arrow-right">
        <el-breadcrumb-item :to="{ name:'applicationManage' }">应用管理</el-breadcrumb-item>
        <el-breadcrumb-item>公版OEM申请</el-breadcrumb-item>
      </el-breadcrumb>
    </el-row>
    <el-row type="flex" justify="space-between" class="table-top">
      <el-col :span="4">
        <el-input v-model="keywords" suffix-icon="el-icon-search"></el-input>
      </el-col>
      <el-col :span="4">
        状态： 
        <el-select v-model="value" placeholder="请选择">
          <el-option
            v-for="item in options"
            :key="item.value"
            :label="item.label"
            :value="item.value">
          </el-option>
        </el-select>
      </el-col>
    </el-row>
    <el-row class="table-content">
      <el-table
          :data="tableData"
          border
          style="width: 100%;margin-bottom: 20px;"
          class="table">
          <el-table-column
            fixed
            prop="date"
            label="日期"
            align="center"
            width="100">
          </el-table-column>
          <el-table-column
            prop="name"
            label="姓名"
            align="center">
          </el-table-column>
          <el-table-column
            prop="province"
            label="省份"
            align="center">
          </el-table-column>
          <el-table-column
            prop="city"
            label="市区"
            align="center">
          </el-table-column>
          <el-table-column
            prop="address"
            label="地址"
            width="300"
            align="center">
          </el-table-column>
          <el-table-column
            prop="zip"
            label="邮编"
            align="center">
          </el-table-column>
          <el-table-column
            fixed="right"
            label="操作"
            align="center"
            width="100">
            <template slot-scope="scope">
              <el-button @click="handleClick(scope)" type="text" size="small">查看</el-button>
              <el-button type="text" size="small">编辑</el-button>
            </template>
          </el-table-column>
        </el-table>

        <el-pagination
          background
          layout="prev, pager, next"
          :total="100"
          class="pagination">
        </el-pagination>
    </el-row>
  </div>
</template>

<script>
export default {
  name: '',
  data() { 
    return {
      options: [
        {
          value: '全部',
          label: '全部'
        }, {
          value: '启用',
          label: '启用'
        }, {
          value: '禁用',
          label: '禁用'
        }
      ],
      value: '',
      keywords: '',
      tableData: [
        {
          date: '2016-05-02',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333
        }, {
          date: '2016-05-04',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1517 弄',
          zip: 200333
        }, {
          date: '2016-05-01',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1519 弄',
          zip: 200333
        }, {
          date: '2016-05-03',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1516 弄',
          zip: 200333
        }
      ]
    }
  },
  methods: {
    handleClick(scope) {
      console.log(scope)
    }
  }
}
</script>

<style lang="stylus" scoped>
.OEM-wrapper
  padding 20px 0
  .breadcrumb
    margin-bottom 50px
    .el-breadcrumb
      height 60px
      line-height 60px
      font-size 16px
  .table-top
    margin-bottom 20px
    .el-input 
      width 200px
    .el-select
      width 100px
</style>
