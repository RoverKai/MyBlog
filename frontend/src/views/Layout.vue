<template>
  <div class="common-layout">
    <el-container>
      <el-header>
        <blog-head @handleSignUpDialog="showSignUp" @handleLoginDialog="showLogin"/>
      </el-header>
      <el-main class="flex justify-center">
        <router-view class=" h-screen"></router-view>
      </el-main>
      <el-footer>
        <blog-footer/>
      </el-footer>  
    </el-container>
    <sign-up ref="signUp"/>
    <login/>
  </div>
</template>

<script>
import BlogFooter from './BlogFooter.vue'
import BlogHead from './BlogHead.vue'
import SignUp from '../components/SignUp.vue';
import Login from '../components/Login.vue';
export default {
  components: {
    BlogHead,
    BlogFooter,
    SignUp,
    Login
  },
  data() {
    return {
      isLogin: false,
      showSignUpDialog: false,
      showLoginDialog: false,
    }
  },
  methods: {
    showSignUp() {
      this.$refs.signUp.showDialog()
    },
    showLogin() {
      this.showLoginDialog = true;
    }
  }
}
</script>

<style>

</style>