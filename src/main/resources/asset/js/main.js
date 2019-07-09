import Vue from 'vue'
import App from 'App.vue'

import Vuetify from 'vuetify'

Vue.use(Vuetify)
import 'vuetify/dist/vuetify.min.css'

new Vue({
    el: '#app',
    render: a => a(App)
})