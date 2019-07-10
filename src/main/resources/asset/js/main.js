import Vue from 'vue'
import App from 'App.vue'
import '@babel/polyfill'

//Vuetify
import Vuetify from 'vuetify'
Vue.use(Vuetify)
import 'vuetify/dist/vuetify.min.css'

//Vue router
import {router} from 'router'

//Vuex
import store from 'store'

import VueResource from 'vue-resource';
Vue.use(VueResource);

new Vue({
    render: h => h(App),
    router,
    store,
}).$mount('#app')
