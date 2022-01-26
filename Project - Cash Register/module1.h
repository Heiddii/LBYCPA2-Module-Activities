#include <stdio.h>
#include <string.h>
#define module1_h

char usernameDatabase[100][20];
char passwordDatabase[100][20];

int countLine(char* fileName) {
    FILE *fp;
    int count = 0;
    char c;

    fp = fopen(fileName, "r");
    c = getc(fp);
    while (c != EOF) {
        c = getc(fp);
        if (c == ';') {
            count++;
            continue;
        }
    }
    fclose(fp);
    return count;
}

void loadRegistration() {
    FILE *fp;
    fp = fopen("user_passcpatwo.txt", "r");
    char c[3];

    for(int i = 0; i < numAccounts; i++) {
        fscanf(fp, "%s", usernameDatabase[i]);
        fscanf(fp, "%s", passwordDatabase[i]);
        fscanf(fp, "%s", c);
    }
    fclose(fp);
}

int checkUsername(char* user) {
    for(int i = 0; i < numAccounts; i++) {
        if(strcmp(user, usernameDatabase[i]) == 0) {
            return 1;
        }
    }
    return 0;
}

int checkPassword(char* pass) {
    for(int i = 0; i < numAccounts; i++) {
        if(strcmp(pass, passwordDatabase[i]) == 0) {
            return 1;
        }
    }
    return 0;
}

//this will be the login interface for the program
int logIn() {
    char username[20];
    char password[20];
    int count = 1;
    int i = 0;

    do{
        printf("\n\t\t\t\t\t=================================================================");
        printf("\n\t\t\t\t\t=============title here==============");
        printf("\n\t\t\t\t\t=====================  =======================");
        printf("\n\t\t\t\t\t=================================================================");
        printf("\n\t\t\t\t\tEnter the username: ");
        scanf("%s", username);
        printf("\t\t\t\t\tEnter the password: ");
        
        for(i = 0; (password[i] = getch()) != '\r'; i++)
        {
          printf("*");
        }
        password[i] = '\0';
        


        count += 1;
        system("clear");
    }
    while(!checkPassword(password) && !checkUsername(username)  && count <= 3);
  
    if(count > 3) {
        printf("Maximum Tries reached. Please try again after a while.");
        return 0;
    } else {
        return 1;
    }
}