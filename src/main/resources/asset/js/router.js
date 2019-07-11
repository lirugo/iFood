import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)

import Welcome from './components/Welcome.vue'
import ListOfFood from './components/ListOfFood/ListOfFood.vue'
import AddFoodDialog from './components/ListOfFood/AddFoodDialog.vue'
import ListOfEatenFood from './components/ListOfEatenFood/ListOfEatenFood.vue'

const routes = [
    { path: '/welcome', component: Welcome },
    { path: '/ListOfFood', component: ListOfFood },
    { path: '/AddFood', component: AddFoodDialog },
    { path: '/ListOfEatenFood', component: ListOfEatenFood },
]

export const router = new VueRouter({
    routes
})