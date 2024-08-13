import { createRouter, createWebHashHistory,} from "vue-router";
const routes = [
  {
    path: '/',
    component: () => import('../views/Layout.vue'),
    redirect: '/home',
    children: [
      {
        path: '/home',
        component: () => import('../views/Home.vue')
      },{
        path: '/misc',
        component: () => import('../views/Misc.vue')
      },{
        path: '/message-board',
        component: () => import('../views/MessageBoard.vue')
      },{
        path: '/about',
        component: () => import('../views/About.vue')
      },{
        path: '/friend-links',
        component: () => import('../views/FriendLinks.vue')
      }
    ]
  },
]

const router = createRouter({
  history: createWebHashHistory(),
  routes: routes,
})

export default router


