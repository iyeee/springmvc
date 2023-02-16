import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import UserHome from '@/components/UserHome'

Vue.use(Router)

export default new Router({
/* eslint-disable */
    routes: [{
                path: '/',
                name: 'HelloWorld',
                component: HelloWorld
            },
            {
                path: '/user',
                name: 'UserHome',
                component: UserHome
            }
        ]
        /* eslint-disable */
})