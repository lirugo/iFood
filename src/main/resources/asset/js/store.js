import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex);
import 'es6-promise/auto'

export default new Vuex.Store({
    state: {
        foods: [
            {
                name: "Name",
                proteins: 11,
                fat: 22,
                carbohydrates: 33,
                calories: 44,
            },
        ]
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
        }
    },
    actions: {
        addFoodAction({commit}, food){
            commit('storeFoodMutation', food)
        }
    }
})