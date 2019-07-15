<template>
    <v-snackbar
            v-model="snackbar.show"
            :bottom="snackbar.y === 'bottom'"
            :left="snackbar.x === 'left'"
            :multi-line="snackbar.mode === 'multi-line'"
            :right="snackbar.x === 'right'"
            :timeout="snackbar.timeout"
            :top="snackbar.y === 'bottom'"
            :vertical="snackbar.mode === 'vertical'"
            :color="snackbar.color"
    >
        {{ snackbar.text }}
        <v-btn
                v-if="snackbar.showBtn"
                color="pink"
                flat
                @click="snackbar.show = false"
        >
            Close
        </v-btn>
    </v-snackbar>
</template>
<script>
    import {mapState} from 'vuex'

    export default {
        props: ['text'],
        computed: {
            ...mapState(['snackbar'])
        },
    }
</script>