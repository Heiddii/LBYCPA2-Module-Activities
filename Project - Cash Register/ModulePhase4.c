#include <stdio.h>

int main(void)
{
  int discount_option, total_cost, payment_option, cash_amount, discount;
  printf("Discount Options\n1. Elderly Discount\n2. Membership Discount\n 3. None\nEnter Discount Option: ");
  scanf("%d", &discount_option);
  switch(discount_option)
  {
    case 1:
      discount = total_cost*0.20;
      total_cost=total_cost - discount;
      break;
    case 2:
      discount = total_cost*0.10;
      total_cost=total_cost - discount;
      break;
    default:
      discount=total_cost*0;
      total_cost=total_cost - discount;
      break;
  }

  printf("\n\n1. Credit Card\n2. Cash \n3. Mix\n4. Cancel \nPayment Option: ");
  scanf("%d", &payment_option);
  switch(payment_option)
  {
    case 1:
      //Credit Card option
    case 2:
      do
      {
        printf("Input cash amount: ");
        scanf("%d", &cash_amount);
        total_cost=total_cost-cash_amount;
        if (total_cost>0)
          printf("\nInsufficient amount\n");
      }
      while(total_cost>0);
      break;
    case 3:
      //
      break;
  }

}