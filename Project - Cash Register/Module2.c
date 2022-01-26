#include <stdio.h>
#include <string.h>
int main(void)
{
  
  char itemname[20][100] = {"Neozep forte tablet 8+2", "Alaxan FR 200 mg / 325 mg capsule 20s" , "Centrum Advance 20s", "Cherifer 120 ml Syrup", "Enervon 9 + 1 Tablet", "Healmed 3 Ply Surgical Face Mask", "Ceelin Plus Chewables Tablet", "Ritemed Ascorbic Acid 100 mg / 5 ml 120 ml Syrup", "Betadine 10% 15 ml Wound Solution", "Band Aid Wash Proof Adhesive Bandage", "Partners Elastic Bandage 3 inch x 5 yards", "Nexcare Micropore First Aid Paper Tape 12.7MM x 9.14M", "Efficascent Oil 50 ml",  "Katinko 10 g Medium Ointment", "Omega Pain Killer 60 ml Liniment", "Salonpas Medicated Patch" };
  float itemcost[20] = {40, 160, 210, 171, 58.50, 142.90, 60, 95, 60, 95, 54, 75.90, 57.75, 30, 63.75, 94.50 };
  int choose, order[2][100], i, ordernumber = 0;
  char a;
  while(strcmp(a, "n") != 1){
    choose = 0;
    for(i = 0;i < 16; i++)
    {
    printf("%d.%s \t, %.2f, \n", i+1,itemname[i] ,itemcost[i]);
    }
    while(choose > 1 && choose < 16)
    {
    printf("\n\nWhat is your order:");
    scanf("%d", &choose);
    if(choose > 1 && choose < 16)
    {
      printf("\nPlease choose from the appropriate menus");
    }
    }
    
    order[0][ordernumber] = choose;
    printf("Quantity of purchase:");
    scanf("%d", &choose);
    order[1][ordernumber] = choose;
    ordernumber += 1;

    printf("Item has been successfully added to cart!")
    while (a!='Y'|| a!='y' || a!='N' || a!='n'){
      printf("Do you want to add another item? Y/N: ");
      scanf(" %c", &a);
      if (a=='Y'|| a=='y'){
				break;
			}
			else if (a=='N' || a=='n'){
				//system("cls"); 
				break;
			}
			else{
				printf("\n\n\tInvalid entry, please enter Y or N.\n");
				//getch();
			}
    }
  }  
}