import { Entity, Column, PrimaryColumn } from 'typeorm'

@Entity('erc20_balance')
export class Erc20BalanceView {
  @PrimaryColumn()
  public address: string

  @Column()
  public contract: string

  @Column()
  public amount: string
}
