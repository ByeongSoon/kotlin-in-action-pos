package printer

class PosPrinter {
  fun command() {
    println(
      """
        *****************작업 선택*****************
        1. 결재
        2. 상품관리
        3. 정산
        4. 종료
        5. 포스기 정보 출력
        ****************************************
      """.trimIndent()
    )
  }

  fun start() {
    println(
      """
        ***********Kotlin 편의점***********
        POS 실행중....
        *************환영합니다*************
      """.trimIndent()
    )
  }

  fun exit() {
    println(
      """
        *****************POS를 종료합니다*****************
        종료중...
      """.trimIndent()
    )
  }
}