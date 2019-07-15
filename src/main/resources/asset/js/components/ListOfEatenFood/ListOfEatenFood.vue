<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
  <v-flex
          class="mx-auto sm12 md5"
  >
    <v-timeline  dense>

      <!--Header-->
      <v-timeline-item
              fill-dot
              class="white--text"
              color="green"
              large
      >
        <template v-slot:icon>
          <span>Goal</span>
        </template>
        <v-layout justify-center>
          <v-tooltip bottom>
            <template v-slot:activator="{ on }">
              <v-btn outline label color="green" class="pa-0" small fab v-on="on">120</v-btn>
            </template>
            <span>Proteins</span>
          </v-tooltip>
          <v-tooltip bottom>
            <template v-slot:activator="{ on }">
              <v-btn outline label color="red" class="pa-0" small fab v-on="on">330</v-btn>
            </template>
            <span>Fat</span>
          </v-tooltip>
          <v-tooltip bottom>
            <template v-slot:activator="{ on }">
              <v-btn outline label color="orange" class="pa-0" small fab v-on="on">220</v-btn>
            </template>
            <span>Carbohydrates</span>
          </v-tooltip>
          <v-tooltip bottom>
            <template v-slot:activator="{ on }">
              <v-btn outline label color="green" class="pa-0" small fab v-on="on">1200</v-btn>
            </template>
            <span>Calories</span>
          </v-tooltip>
        </v-layout>

      </v-timeline-item>

      <!--List of Eaten Food-->
      <v-timeline-item
              v-for="food in eatenFoods"
              :key="food.id"
              color="white"
              large
      >
        <template v-slot:icon>
          <v-icon color="grey lighten-1" >restaurant</v-icon>
        </template>

        <template>
          <v-card class="elevation-2">
                        <v-system-bar status color="primary" lights-out class="pa-3">

                          <v-spacer></v-spacer>
                            <span><small>{{food.date}}</small></span>
                        </v-system-bar>
            <v-card-text class="pt-0 pb-2">
              {{food.food.name}} |
              <span><small>Proteins - {{food.food.proteins}} gr,&nbsp;</small></span>
              <span><small>Fat - {{food.food.fat}} gr,&nbsp;</small></span>
              <span><small>Carbohydrates - {{food.food.carbohydrates}} gr,&nbsp;</small></span>
              <span><small>kcal - {{food.food.calories}},&nbsp;</small></span>
              <span><small>Weight -  {{food.weight}} gr,&nbsp;</small></span>
            </v-card-text>
          </v-card>
        </template>

      </v-timeline-item>



    </v-timeline>

  </v-flex>
</template>

<script>
  import {mapState} from 'vuex'
  export default {
    computed: {
      ...mapState(['eatenFoods'])
    },
  }
</script>

<style scoped>
</style>
