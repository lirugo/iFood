<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
    <v-layout row>
        <v-flex xs12 sm12 md6 offset-md3>

            <!--Add food dialog-->
            <add-food-dialog :addFoodDialog="addFoodDialog" @close="addFoodDialog=false"/>

            <v-card>
                <v-toolbar color="grey lighten-3" class="elevation-0">
                    <div class="text-xs-center">
                        <v-chip>Total {{foods.totalElements}}</v-chip>
                    </div>

                    <v-toolbar-title>List of my food</v-toolbar-title>

                    <v-spacer></v-spacer>

                    <v-pagination
                            circle
                            v-model="pagination.pageable.pageNumber"
                            :length="foods.totalPages"
                    ></v-pagination>

                    <v-btn icon
                           @click.stop="addFoodDialog = true"
                    >
                        <v-icon>add</v-icon>
                    </v-btn>
                </v-toolbar>

                <v-list two-line class="pa-0">
                    <template v-for="item in foods.content">

                        <v-divider/>

                        <v-list-tile
                                :key="item.id"
                                avatar
                                @click=""
                        >
                            <v-list-tile-avatar>
                                <v-icon color="grey lighten-1" large>fastfood</v-icon>
                            </v-list-tile-avatar>

                            <v-list-tile-content>
                                <v-list-tile-title v-html="item.name"></v-list-tile-title>
                                <v-list-tile-sub-title>
                                    100 gr of product contains -
                                    proteins {{item.proteins}}gr,
                                    fat {{item.fat}}gr,
                                    carbohydrates {{item.carbohydrates}}gr,
                                    calories {{item.calories}}gr.
                                </v-list-tile-sub-title>
                            </v-list-tile-content>

                            <v-list-tile-action>
                                <v-btn icon ripple
                                       @click="deleteFood(item.id)"
                                >
                                    <v-icon color="grey lighten-1">delete</v-icon>
                                </v-btn>
                            </v-list-tile-action>
                        </v-list-tile>
                    </template>
                </v-list>
            </v-card>
        </v-flex>
    </v-layout>
</template>

<script>
    import AddFoodDialog from 'components/ListOfFood/AddFoodDialog.vue'
    import {mapActions, mapState} from 'vuex'

    export default {
        components: {
            AddFoodDialog,
        },
        computed: mapState(
            ['foods']
        ),
        data () {
            return {
                pagination: {
                    pageable:{
                        pageNumber: 1
                    },
                },
                addFoodDialog : false,
            }
        },
        watch: {
            pagination: {
                handler(){
                    this.fetchFoodsAction(this.pagination)
                },
                deep: true,
            }
        },
        methods: {
            ...mapActions(['deleteFoodAction', 'fetchFoodsAction']),
            deleteFood(id){
                //Delete in server
                this.$http.delete('/api/food/' + id)
                //Delete in vuex
                this.deleteFoodAction(id)
            }
        }
    }
</script>

<style scoped>
</style>
