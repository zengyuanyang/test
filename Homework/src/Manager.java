/**
 * 经理类，继承与员工类，新增奖金成员变量
 * @author 曾远洋
 *
 */
public class Manager extends Staff{
	int bonus;		//奖金
	public Manager() {
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
