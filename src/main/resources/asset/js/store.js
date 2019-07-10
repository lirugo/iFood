import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex);
import 'es6-promise/auto'

export default new Vuex.Store({
    state: {
        foods: []
    },
    getters: {
        getFood: state => state.foods
    },
    mutations: {
        storeFoodMutation (state, food) {
            state.foods = [
                food,
                ...state.foods,
            ]
        },
        fetchFoodMutation (state, foods) {
            state.foods = foods
        },
    },
    actions: {
        addFoodAction({commit}, food){
            commit('storeFoodMutation', food)
        },
        fetchFoodsAction({commit}, foods){
            commit('fetchFoodMutation', foods)
        }
    }
})