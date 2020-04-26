<template>
  <div id="app">
    <base-layout></base-layout>
  </div>
</template>

<script>
import BaseLayout from '@/components/layouts/BaseLayout'

export default {
  name: 'App',
  components: {
    BaseLayout
  }
}
</script>

<style>
a {text-decoration: none;}
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;

}
.router-wrapper {
  border: 2px solid #000000;
}
.router-view {
  border: 1px solid #000000;
}
</style>
