<template>
    <v-app>
        <v-container fluid>
            <navigation/>
            <snackbar/>

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
    import Snackbar from 'components/Snackbar.vue'

    export default {
        components: {
            Navigation,
            Snackbar,
        },
        mounted() {
            this.fetchUserName()
            this.fetchFoodsAction()
            this.fetchEatenFoodsAction()
        },
        methods: {
            ...mapActions(['fetchUserName', 'fetchFoodsAction', 'fetchEatenFoodsAction']),
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
