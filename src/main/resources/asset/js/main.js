import Vue from 'vue'
import App from 'App.vue'

//Vuetify
import Vuetify from 'vuetify'
Vue.use(Vuetify)
import 'vuetify/dist/vuetify.min.css'

//Vue router
import {router} from 'router'

//Vuex
import Vuex from 'vuex';
Vue.use(Vuex);
import 'es6-promise/auto';


new Vue({
    render: h => h(App),
    router,
}).$mount('#app')
