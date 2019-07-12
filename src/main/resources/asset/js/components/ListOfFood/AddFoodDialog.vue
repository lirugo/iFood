<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
    <div class="text-xs-center">
        <v-dialog
                v-model="dialog"
                width="500"
        >
            <v-card>
                <v-card-title
                        class="headline grey lighten-2"
                        primary-title
                >
                    Add new food
                </v-card-title>

                <v-card-text>
                    <small>Set value for 100 gr of product*</small>
                    <v-text-field
                            v-model="food.name"
                            data-vv-name="food.name"
                            v-validate="'required|max:40|min:2'"
                            :error-messages="errors.collect('food.name')"
                            :counter="40"
                            label="Name"
                            required
                    ></v-text-field>

                    <v-slider
                            v-model="food.proteins"
                            v-validate="'required|min:1|max:100'"
                            :error-messages="errors.collect('food.proteins')"
                            data-vv-name="food.proteins"
                            required
                            label="Proteins"
                            thumb-label
                            :thumb-size="24"
                            min="0"
                            max="100"
                            append-icon="add"
                    ></v-slider>
                    <v-slider
                            v-model="food.fat"
                            v-validate="'required|min:1|max:100'"
                            :error-messages="errors.collect('food.fat')"
                            data-vv-name="food.fat"
                            required
                            label="Fat"
                            thumb-label
                            :thumb-size="24"
                            min="0"
                            max="100"
                            append-icon="add"
                    ></v-slider>
                    <v-slider
                            v-model="food.carbohydrates"
                            v-validate="'required|min:1|max:100'"
                            :error-messages="errors.collect('food.carbohydrates')"
                            data-vv-name="food.carbohydrates"
                            required
                            label="Carbohydrates"
                            thumb-label
                            :thumb-size="24"
                            min="0"
                            max="100"
                            append-icon="add"
                    ></v-slider>
                    <v-slider
                            v-model="food.calories"
                            v-validate="'required|min:1|max:100'"
                            :error-messages="errors.collect('food.calories')"
                            data-vv-name="food.calories"
                            required
                            label="Calories"
                            thumb-label
                            :thumb-size="24"
                            step="10"
                            min="0"
                            max="500"
                            append-icon="add"
                    ></v-slider>

                </v-card-text>

                <v-divider></v-divider>

                <v-card-actions>
                    <v-btn
                            color="red"
                            @click="dialog = false"
                            flat
                    >
                        Close
                    </v-btn>
                    <v-spacer></v-spacer>
                    <v-btn
                            color="primary"
                            flat
                            @click="addFood"
                    >
                        Create
                    </v-btn>
                </v-card-actions>
            </v-card>
        </v-dialog>
    </div>
</template>

<script>
    import {mapActions} from 'vuex'

    export default {
        $_veeValidate: {
            validator: 'new'
        },
        props: ['addFoodDialog'],
        mounted(){
        },
        data(){
            return {
                food: {
                    name: null,
                    proteins: null,
                    fat: null,
                    carbohydrates: null,
                    calories: null,
                },
            }
        },
        computed: {
            dialog: {
                get () {
                    return this.addFoodDialog
                },
                set (value) {
                    if (!value) {
                        this.$emit('close')
                    }
                }
            }
        },
        methods: {
            ...mapActions(['addFoodAction']),
            async addFood() {
                let valid = await this.$validator.validate();

                //If data valid
                if(valid) {
                    this.$http.post('/api/food/', this.food).then((response) => {
                        //Update vuex
                        this.addFoodAction(response.body)
                    })

                    //Clear
                    this.errors.items = []
                    this.dialog = false
                    this.food = {
                        name: null,
                        proteins: null,
                        fat: null,
                        carbohydrates: null,
                        calories: null,
                    }
                }
            }
        }
    }
</script>

<style scoped>
</style>
