#include <stdio.h>

int main(void)
{
  int P3_option=0, itemCode, editOption=0;
  do
  {
    printf("1. Checkout\n2. Edit\nEnter Choice: ");
    scanf("%d", &P3_option);
    switch(P3_option)
    {
      case 1:
        printf("Call phase 4");
        break;
      case 2:
        printf("Display item list");
        printf("\nWhich item to edit? (itemCode)");
        scanf("%d", &itemCode);
        printf("\n\n1. Add\n2. Remove\n3. Checkout");
        printf("\nChoice: ");
        scanf("%d", &editOption);
        switch(editOption)
        {
          case 1:
            phase2();
            break;
          case 2:
            Remove();
            break;
          case 3:
            phase4();
            break;
          default:
            break;
        }
      default:
        break;
    }
}while(P3_option>=1 || P3_option<=2);
}