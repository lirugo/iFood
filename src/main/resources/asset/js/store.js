import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex);
import 'es6-promise/auto'

export default new Vuex.Store({
    state: {
        user: null,
        snackbar: {
            show: false,
            showBtn: false,
            text: 'asd',
            y: 'top',
            x: 'left',
            mode: '',
            timeout: 4000,
        },
        foods: [],
        eatenFoods: [],
    },
    getters: {
        getUser: state => state.user,
        getFood: state => state.foods,
        getEatenFoods: state => state.eatenFoods
    },
    mutations: {
        addSnackbarMutation(state, snackbar){
            let snackbarFull = {
                show: true,
                showBtn: false,
                text: snackbar.text,
                color: snackbar.color,
                y: 'top',
                x: 'left',
                mode: '',
                timeout: 4000,
            }
            state.snackbar = snackbarFull
        },
        addFoodMutation(state, food) {
            state.foods = [
                food,
                ...state.foods,
            ]
        },
        addEatenFoodMutation(state, eatenFood){
            state.eatenFoods = [
                eatenFood,
                ...state.eatenFoods
            ]
        },
        deleteFoodMutation(state, id) {
            const index = state.foods.findIndex(item => item.id === id)
            if(index > -1){
                state.foods = [
                    ...state.foods.slice(0,index),
                    ...state.foods.slice(index+1)
                ]
            }
        },
        fetchUserNameMutation(state, username) {
            state.user = username
        },
        fetchFoodMutation(state, foods) {
            state.foods = foods
        },
        fetchEatenFoodMutation(state, eatenFoods){
            //Sorting
            eatenFoods.sort((a, b) => b.id - a.id)
            state.eatenFoods = eatenFoods
        }
    },
    actions: {
        addSnackbarAction({commit}, snackbar){
            commit('addSnackbarMutation', snackbar)
        },
        addFoodAction({commit}, food){
            commit('addFoodMutation', food)
        },
        addEatenFoodAction({commit}, eatenFood){
            commit('addEatenFoodMutation', eatenFood)
        },
        deleteFoodAction({commit}, food){
            commit('deleteFoodMutation', food)
        },
        fetchFoodsAction({commit}){
            Vue.http.get('/api/food/').then(response => {
                commit('fetchFoodMutation', response.body)
            });
        },
        fetchUserName({commit}){
            Vue.http.get('/auth/user').then(response => {
                commit('fetchUserNameMutation', response.body)
            });
        },
        fetchEatenFoodsAction({commit}){
            Vue.http.get('/api/eaten-foods').then(response => {
                commit('fetchEatenFoodMutation', response.body._embedded.eatenFoods)
            })
        }
    }
})