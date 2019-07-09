import Vue from 'vue'
import App from 'App.vue'

import Vuetify from 'vuetify'

Vue.use(Vuetify)
import 'vuetify/dist/vuetify.min.css'

import VueRouter from 'vue-router'
Vue.use(VueRouter)

Vue.config.productionTip = false

import Welcome from './components/Welcome.vue'

const routes = [
    { path: '/welcome', component: Welcome },
]

const router = new VueRouter({
    routes
})


new Vue({
    render: h => h(App),
    router,
}).$mount('#app')
