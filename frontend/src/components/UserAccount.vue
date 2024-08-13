<template>
  <div class=" w-1/4 flex items-center justify-around *:h-16 *:justify-center *:items-center *:flex">
    <div class=" w-1/2"></div>
    <div @click="onClickLogin" class=" cursor-pointer ">登录</div>
    <div @click="onClickSignUp" class=" cursor-pointer transition">注册</div>
  </div>
</template>

<script>
export default {
  methods: {
    onClickSignUp() {
      this.$emit('handleClickSignUp')
    },
    onClickLogin() {
      this.$emit('handleClickLogin')
    },
  }
}
</script>

<style>

</style>