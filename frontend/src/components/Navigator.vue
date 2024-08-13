<template>
    <div class=" w-2/4">
        <ul class=" h-16 flex justify-around items-center *:hover:cursor-pointer">
            <li class=" hover:bg-slate-400 h-16  flex justify-center items-center w-1/5" @click="onClickNavigator('/message-board')">
                <router-link to="message-board">留言板</router-link>
            </li>
            <li class=" hover:bg-slate-400 h-16 flex justify-center items-center w-1/5" @click="onClickNavigator('/misc')">
                <router-link to="/misc">杂谈</router-link>
            </li>
            <li class=" hover:bg-slate-400 h-16  flex justify-center items-center w-1/5" @click="onClickNavigator('/home')">
                <router-link to="/home">首页</router-link>
            </li>
            <li class=" hover:bg-slate-400 h-16  flex justify-center items-center w-1/5" @click="onClickNavigator('/friend-links')">
                <router-link to="/friend-links">友链</router-link>
            </li>
            <li class=" hover:bg-slate-400 h-16  flex justify-center items-center w-1/5" @click="onClickNavigator('/about')">
                <router-link to="/about">关于我</router-link>
            </li>
        </ul>
    </div>
</template>

<script>

export default {
    methods: {
        onClickNavigator(path) {
            this.$router.push(path)
        }   
    }
}
</script>

<style>

</style>