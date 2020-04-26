<template>
  <header>
    <ul>
      <li><a href="/home">Home</a></li>
      <li><a href="#">About</a></li>
      <li><a href="#">News</a></li>
      <li><a href="#">Contact</a></li>
    </ul>
    <nav>
      <h2>메인메뉴</h2>
      <ul>
        <template v-for="(m, index) in mainmenus">
          <li v-bind:key="index">
            <a :href="m.link">{{m.name}}</a>
          </li>
        </template>
      </ul>
    </nav>
    <!-- <form action="#" method="get">
      <fieldset>
        <legend>검색</legend>
        <label for="sbox">검색어 입력</label>
        <input required type="search" name="" id="sbox" list="searchlist" pattern="\d{3}-\d{3,4}-\d{4}"
          title="이것은 타이틀입니다">
        <datalist id="searchlist">
          <option value="html5"/>
          <option value="javascript"/>
          <option value="css"/>
        </datalist>
        <input type="submit" value="검색">
      </fieldset>
    </form> -->
  </header>
</template>

<script>
export default {
  name: 'BaseHeader',
  data () {
    return {
      mainmenus: [
        {
          name: 'mainmenu1',
          link: 'link1'
        },
        {
          name: 'mainmenu2',
          link: 'link2'
        },
        {
          name: 'mainmenu3',
          link: 'link3'
        }
      ],
      msg: 'this is BaseHeader'
    }
  }
}
</script>

<style scoped>
nav ul {text-align: center;}
nav ul li {list-style: none;}
nav ul li a {display: inline-block;}
</style>
