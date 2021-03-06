package scorex.transaction

import scorex.account.Account


trait BalanceSheet {
  def balance(address: String, height: Option[Int] = None): Long

  /**
   *
   * @return Minimum balance from current block to balance confirmation blocks ago
   */
  def balanceWithConfirmations(address: String, confirmations: Int): Long
}
