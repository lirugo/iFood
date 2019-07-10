import Vue from 'vue'
import App from 'App.vue'

import Vuetify from 'vuetify'

Vue.use(Vuetify)
import 'vuetify/dist/vuetify.min.css'

import VueRouter from 'vue-router'
Vue.use(VueRouter)

Vue.config.productionTip = false

import Welcome from './components/Welcome.vue'
import ListOfFood from './components/ListOfFood/ListOfFood.vue'
import AddFoodDialog from './components/ListOfFood/AddFoodDialog.vue'

const routes = [
    { path: '/welcome', component: Welcome },
    { path: '/ListOfFood', component: ListOfFood },
    { path: '/AddFood', component: AddFoodDialog },
]

const router = new VueRouter({
    routes
})


new Vue({
    render: h => h(App),
    router,
}).$mount('#app')
