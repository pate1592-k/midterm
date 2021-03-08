/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * March 8th
 * @author srinivsi
 */
public class StausUser 
{
    public String value;
    public String Status;
    
    public StausUser(String value,String status)
    {
        this.value = value;
        this.Status = status;
    }
    enum status {
    REJECTED,
    PENDING,
    PROCESSING,
    APPROVED,
    INVALID
  }
   public void statusDetail(String code)
{
 switch(code.toUpperCase())
        {
        case "ZERO": System.out.println(status.REJECTED);
        break;
        case "ONE": System.out.println(status.PENDING);
        break;
        case "TWO":
        System.out.println(status.PROCESSING);
        break;
        case "THREE": 
            System.out.println(status.APPROVED);
        break;
        default:
         System.out.println(status.INVALID);
        break;
        }
}
 
}
