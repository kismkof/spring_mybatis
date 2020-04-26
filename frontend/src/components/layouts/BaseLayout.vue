<template>
  <div class="base-layout">
    <base-header></base-header>
    <hr>
    <base-main></base-main>
    <hr>
    <base-footer></base-footer>
  </div>
</template>

<script>
import BaseHeader from '@/components/layouts/BaseHeader'
import BaseMain from '@/components/layouts/BaseMain'
import BaseFooter from '@/components/layouts/BaseFooter'

export default {
  name: 'BaseLayout',
  components: {
    BaseHeader,
    BaseMain,
    BaseFooter
  }
}
</script>

<style scoped>

</style>
