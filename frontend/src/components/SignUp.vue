<template>
  <el-dialog v-model="dialogVisible" append-to-body class=" w-1/4">
    <el-form :model="form" ref="form" :rules="rules">
      <el-form-item label="用户名" prop="userName" label-width="6rem">
        <el-input v-model="form.userName" placeholder="请输入用户名" maxlength="8"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password" label-width="6rem">
        <el-input type="password" show-password v-model="form.password" placeholder="请输入密码" maxlength="30"></el-input>
      </el-form-item>
      <el-form-item label="确认密码" prop="confirmPwd" label-width="6rem">
        <el-input type="confirmPwd" show-password v-model="form.confirmPwd" placeholder="请输入密码" maxlength="30"></el-input>
      </el-form-item>
      <el-form-item label="邮箱" prop="email" label-width="6rem">
        <el-input v-model="form.email" placeholder="请输入邮箱"></el-input>
      </el-form-item>
      <div class="flex items-center justify-center">
        <el-button type="primary" @click="submitForm" auto-insert-space class=" w-16 mr-8">注册</el-button>
        <p>已经有账号啦？</p>
        <router-link to="/login" class="text-blue-500">去登陆</router-link>
      </div>
    </el-form>
  </el-dialog>
</template>

<script>
export default {
  data() {
    return {
      dialogVisible: false,
      form: {
        userName: null,
        password: null,
        confirmPwd: null,
        email: null,
      },
      rules: {
        userName: [
          {required: true, message: '请输入用户名', trigger: 'blur'},
        ],
        password: [
          {required: true, message: '请输入密码', trigger: 'blur'}
        ],
        confirmPwd: [
          {required: true, message: '请确认密码', trigger: 'blur'},
          {validator: (rule, value, callback) => {
            if (value === this.form.password) {
              callback()
            }else {
              callback(new Error('两次输入密码不正确'))
            }
          }}
        ],
      },
    }
  },
  methods: {
    showDialog() {
      this.dialogVisible = true;
    },
    submitForm() {
      
    }
  }
  
}
</script>

<style>

</style>