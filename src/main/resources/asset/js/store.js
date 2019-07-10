import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex);
import 'es6-promise/auto'

export default new Vuex.Store({
    state: {
        food: [
            {
                avatar: 'https://cdn.vuetifyjs.com/images/lists/1.jpg',
                title: 'Oatmeal',
                subtitle: "100gr of food contains - 10gr proteins, 10gr fat, 10gr carbohydrates, 300 calories"
            },
            { divider: true, inset: true },
            {
                avatar: 'https://cdn.vuetifyjs.com/images/lists/2.jpg',
                title: 'Buckwheat',
                subtitle: "100gr of food contains - 10gr proteins, 10gr fat, 10gr carbohydrates, 300 calories"
            },
            { divider: true, inset: true },
            {
                avatar: 'https://cdn.vuetifyjs.com/images/lists/3.jpg',
                title: 'Rice',
                subtitle: "100gr of food contains - 10gr proteins, 10gr fat, 10gr carbohydrates, 300 calories"
            }
        ]
    },
    getters: {
        getFood: state => state.food
    },
    mutations: {
        increment (state) {
            state.count++
        }
    }
})