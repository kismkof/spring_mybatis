<template>
  <footer>
    <h1>{{msg}}</h1>
    <nav class="nav-footer">
      <ul>
        <li><a href="/home">home</a></li>
        <li><a href="/team">team</a></li>
        <li><a href="/me">me</a></li>
        <li><a href="/trade">trade</a></li>
        <li><a href="/mypage">mypage</a></li>
      </ul>
    </nav>
  </footer>
</template>

<script>
export default {
  name: 'BaseFooter',
  data () {
    return {
      msg: 'this is BaseFooter'
    }
  }
}
</script>

<style scoped>
footer {position: fixed; bottom: 0; text-align: center;}
footer::after {clear: both;}
.nav-footer li {display: inline-block;}
.nav-footer li:after {content: '|';}
.nav-footer li:last-child {content: none;}
</style>
