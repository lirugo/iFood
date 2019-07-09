<template>
    <div>
        APP
        <div class="text-xs-center">
            <v-btn round color="primary" dark>Rounded Button</v-btn>
        </div>
        <Hello/>
    </div>
</template>

<script>
    import Hello from 'components/Hello.vue'
    export default {
        components: {
            Hello
        }
    }
</script>
