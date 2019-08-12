<template>
    <v-toolbar class="elevation-0" color="grey lighten-5 mb-4">
        <v-spacer></v-spacer>

        <v-btn icon to="/AddEatenFood">
            <v-icon>add</v-icon>
        </v-btn>
        <v-btn icon to="/ListOfFood">
            <v-icon>list</v-icon>
        </v-btn>

        <v-btn icon to="/ListOfEatenFood">
            <v-icon>assignment</v-icon>
        </v-btn>

        <v-btn icon to="/Information">
            <v-icon>info</v-icon>
        </v-btn>

        <v-btn icon to="/Setting">
            <v-icon>settings</v-icon>
        </v-btn>

        <v-spacer></v-spacer>
        <v-chip>
            <v-icon left color="green" class="user-icon">account_circle</v-icon>
            <span class="user-label">
                {{user}}
            </span>
        </v-chip>
        <v-btn icon href="/logout">
            <v-icon>exit_to_app</v-icon>
        </v-btn>
    </v-toolbar>
</template>
<script>
    import {mapState} from 'vuex'

    export default {
        computed: mapState(
            ['user']
        ),
    }
</script>

<style scoped>
    @media (max-width: 480px) {
        .user-label {
            display: none;
        }
        .user-icon {
            margin: auto !important;
        }
    }
    .user-label{
    }
</style>