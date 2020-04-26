import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Home from '@/components/Home'
import Team from '@/components/team/Team'
Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/home',
      name: 'Home',
      component: Home
    },
    {
      path: '/team',
      name: 'Team',
      component: Team,
      children: [
        {
          path: 'match',
          name: 'TeamMatch',
          component: Team.TeamMatch
        },
        {
          path: 'member',
          name: 'TeamMember',
          component: Team.TeamMember
        },
        {
          path: 'record',
          name: 'TeamRecord',
          component: Team.TeamRecord
        },
        {
          path: 'recruit',
          name: 'TeamRecruit',
          component: Team.TeamRecruit
        }
      ]
    }
    // {
    //   path: '/team/match',
    //   name: 'TeamMatch',
    //   component: TeamMatch
    // }
  ]
})
