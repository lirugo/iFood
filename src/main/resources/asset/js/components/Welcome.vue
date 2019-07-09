<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
  <v-layout row>
    <v-flex xs12 sm6 offset-sm3>
      <v-card class="elevation-1">
        <v-toolbar color="grey lighten-3 elevation-1">
          <v-toolbar-title class="elevation-0">iFood</v-toolbar-title>
          <v-spacer></v-spacer>
        </v-toolbar>
        <v-card-text>
          Welcome to our app.<br/>
          For continue you need login
        </v-card-text>
        <v-card-actions>
          <v-btn color="green" dark block>Login with Google</v-btn>
        </v-card-actions>
      </v-card>
    </v-flex>
  </v-layout>
</template>

<script>
  export default {
  }
</script>

<style scoped>
</style>
