<template>
  <Main>
    <h1>{{msg}}</h1>
    <router-view></router-view>
  </Main>
</template>

<script>
export default {
  name: 'BaseMain',
  data () {
    return {
      msg: 'this is BaseMain'
    }
  }
}
</script>

<style scoped>

</style>
