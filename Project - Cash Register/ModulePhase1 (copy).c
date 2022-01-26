#include <stdio.h>

int main(void)
{
  int option=0;
  do
  {
    printf("1. Cash Register\n2. Exit\nEnter Choice: ");
    scanf("%d", &option);
    if(option==1)
    {
      phase2();
    }
    else if (option==2)
    {
      return 0;
    }
    else
      continue;
  }
  while(option>=1 || option<=2);
}