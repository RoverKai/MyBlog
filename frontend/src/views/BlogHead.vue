<template>
    <div class=" flex flex-row justify-between bg-gradient-to-t from-white to-slate-300">
        <logo/>
        <Navigator/>
        <user-account @handleClickLogin="emitStatusToParent('login')" @handleClickSignUp="emitStatusToParent('sign-up')"/>
    </div>
</template>

<script>
import Logo from '../components/Logo.vue'
import Navigator from '../components/Navigator.vue'
import UserAccount from '../components/UserAccount.vue'
export default {
    components: {
        Navigator,
        Logo,
        UserAccount,
    },
    methods: {
        emitStatusToParent(status) {
            if (status === 'login') {
                this.$emit('handleLoginDialog')
            } else if (status === 'sign-up') {
                this.$emit('handleSignUpDialog')
            } else {
                new Error('错误')
            }
        }
    }
}
</script>

<style>

</style>