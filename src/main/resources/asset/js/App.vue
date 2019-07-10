<template>
    <v-app>
        <v-container fluid>
            <Navigation/>
            <transition
                    name="fade"
                    mode="out-in"
            >
                <router-view></router-view>
            </transition>
        </v-container>
    </v-app>
</template>

<script>
    import {mapActions} from 'vuex'
    import Navigation from 'components/Navigation.vue'

    export default {
        components: {
            Navigation,
        },
        mounted() {
            //TODO move code belove it to store.js - fetchFoodsAction
            this.$http.get('/api/food/').then((response) => {
                this.fetchFoodsAction(response.body)
            });
        },
        methods: {
            ...mapActions(['fetchFoodsAction']),
        }
    }
</script>

<style>
    .fade-enter-active,
    .fade-leave-active {
        transition-duration: 0.3s;
        transition-property: opacity;
        transition-timing-function: ease;
    }

    .fade-enter,
    .fade-leave-active {
        opacity: 0
    }
</style>
