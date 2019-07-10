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
        addFoodMutation (state, food) {
            state.foods = [
                food,
                ...state.foods,
            ]
        },
        deleteFoodMutation (state, id) {
            const index = state.foods.findIndex(item => item.id === id)
            if(index > -1){
                state.foods = [
                    ...state.foods.slice(0,index),
                    ...state.foods.slice(index+1)
                ]
            }
        },
        fetchFoodMutation (state, foods) {
            state.foods = foods
        },
    },
    actions: {
        addFoodAction({commit}, food){
            commit('addFoodMutation', food)
        },
        deleteFoodAction({commit}, food){
            commit('deleteFoodMutation', food)
        },
        fetchFoodsAction({commit}){
            Vue.http.get('/api/food/').then(response => {
                commit('fetchFoodMutation', response.body)
            });
        }
    }
})