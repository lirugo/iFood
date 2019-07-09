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
    import Navigation from 'components/Navigation.vue'

    export default {
        components: {
            Navigation,
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
