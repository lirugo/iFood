<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
  <v-layout row>
    <v-flex xs12 sm6 offset-sm3>
      <v-card>
        <v-toolbar color="grey lighten-3" class="elevation-0">
          <v-toolbar-title>Add Eaten Food</v-toolbar-title>
          <v-spacer></v-spacer>

          <v-btn icon
                 @click="addEatenFood()">
            <v-icon>add</v-icon>
          </v-btn>
        </v-toolbar>

        <v-card-text>
          <v-form
                  lazy-validation
          >
            <v-select
                    v-model="food.id"
                    :items="foods"
                    data-vv-name="food"
                    v-validate="'required'"
                    :error-messages="errors.collect('food')"
                    item-text="name"
                    item-value="id"
                    label="Select food"
                    required
            ></v-select>

            <v-slider
                    v-model="food.weight"
                    v-validate="'required|min:1|max:1000'"
                    :error-messages="errors.collect('food.weight')"
                    data-vv-name="food.weight"
                    required
                    label="Weight in gram"
                    thumb-label
                    :thumb-size="24"
                    step="10"
                    min="0"
                    max="500"
                    append-icon="add"
            ></v-slider>

          </v-form>
        </v-card-text>

      </v-card>
    </v-flex>
  </v-layout>
</template>

<script>
  import {mapState} from 'vuex'
  import {mapActions} from 'vuex'

  export default {
    $_veeValidate: {
      validator: 'new'
    },
    computed: mapState(
            ['foods']
    ),
    data: () => ({
      food: {
        id: null,
        weight: 100,
      },
    }),
    methods: {
      ...mapActions(['addSnackbarAction']),
      async addEatenFood(){
        //Send to server
        let valid = await this.$validator.validate();

        //If data valid
        if(valid) {
          this.$http.post('/api/eaten-food/', this.food).then((response) => {
            // TODO Update vuex
            // this.addFoodAction(response.body)
          })

          //Show notification
          this.addSnackbarAction({
            text: 'Successful created',
            color: 'success'
          })
          //Clear
          this.errors.items = []
          this.food = {
            id: null,
            weight: 100,
          }
        }
        //TODO Save to vuex
      }
    }
  }
</script>

<style scoped>
</style>
