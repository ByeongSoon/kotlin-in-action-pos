package domain

data class Pos(
  val version: String,
  val staff: String
) {
  override fun toString(): String {
    return "POS기 버전 : $version, 직원 이름 : $staff"
  }
}
