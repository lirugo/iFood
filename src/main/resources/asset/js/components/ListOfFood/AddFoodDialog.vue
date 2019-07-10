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
                            v-model="name"
                            :counter="40"
                            label="Name"
                            required
                            class="mb-3"
                    ></v-text-field>

                    <v-slider
                            v-model="proteins"
                            label="Proteins"
                            thumb-label
                            :thumb-size="24"
                            min="0"
                            max="100"
                            append-icon="add"
                    ></v-slider>
                    <v-slider
                            v-model="fat"
                            label="Fat"
                            thumb-label
                            :thumb-size="24"
                            min="0"
                            max="100"
                            append-icon="add"
                    ></v-slider>
                    <v-slider
                            v-model="carbohydrates"
                            label="Carbohydrates"
                            thumb-label
                            :thumb-size="24"
                            min="0"
                            max="100"
                            append-icon="add"
                    ></v-slider>
                    <v-slider
                            v-model="calories"
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
                    >
                        Create
                    </v-btn>
                </v-card-actions>
            </v-card>
        </v-dialog>
    </div>
</template>

<script>
    export default {
        props: ['addFoodDialog'],
        data(){
            return {
                name: null,
                proteins: null,
                fat: null,
                carbohydrates: null,
                calories: null,
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
        }
    }
</script>

<style scoped>
</style>
