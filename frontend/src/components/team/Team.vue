<template>
  <div class="team">
    <ul>
      <li><router-link to="/team/match">경기</router-link></li>
      <li><router-link to="/team/member">선수</router-link></li>
      <li><router-link to="/team/record">지난날</router-link></li>
      <li><router-link to="/team/recruit">찾기</router-link></li>
    </ul>
    <router-view></router-view>
  </div>
</template>

<script>
import TeamMatch from '@/components/team/TeamMatch'
import TeamMember from '@/components/team/TeamMember'
import TeamRecord from '@/components/team/TeamRecord'
import TeamRecruit from '@/components/team/TeamRecruit'

export default {
  name: 'Team',
  data () {
    return {
      msg: 'this is Team'
    }
  },
  components: {
    TeamMatch,
    TeamMember,
    TeamRecord,
    TeamRecruit
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
