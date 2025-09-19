#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Structure for student node
struct Student {
    char usn[15];
    char name[50];
    char branch[20];
    int sem;
    char phone[15];
    struct Student* next;
};

struct Student* head = NULL;

// Function prototypes
void createList(int n);
void displayList();
int countNodes();
void insertAtEnd();
void deleteAtEnd();
void insertAtBeginning();
void deleteAtBeginning();
struct Student* createNode();

int main() {
    int choice, n;

    while(1) {
        printf("\n--- Menu ---\n");
        printf("1. Create list of n students\n");
        printf("2. Display list and count nodes\n");
        printf("3. Insert at end\n");
        printf("4. Delete at end\n");
        printf("5. Insert at beginning\n");
        printf("6. Delete at beginning\n");
        printf("7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1:
                printf("Enter number of students to create: ");
                scanf("%d", &n);
                createList(n);
                break;
            case 2:
                displayList();
                printf("Total nodes: %d\n", countNodes());
                break;
            case 3:
                insertAtEnd();
                break;
            case 4:
                deleteAtEnd();
                break;
            case 5:
                insertAtBeginning();
                break;
            case 6:
                deleteAtBeginning();
                break;
            case 7:
                printf("Exiting...\n");
                exit(0);
            default:
                printf("Invalid choice, try again.\n");
        }
    }

    return 0;
}

// Create a new node by taking input
struct Student* createNode() {
    struct Student* newNode = (struct Student*)malloc(sizeof(struct Student));
    if (!newNode) {
        printf("Memory allocation failed\n");
        return NULL;
    }

    printf("Enter USN: ");
    scanf("%s", newNode->usn);
    printf("Enter Name: ");
    scanf(" %[^\n]", newNode->name);
    printf("Enter Branch: ");
    scanf("%s", newNode->branch);
    printf("Enter Semester: ");
    scanf("%d", &newNode->sem);
    printf("Enter Phone Number: ");
    scanf("%s", newNode->phone);

    newNode->next = NULL;
    return newNode;
}

// Create list with n students
void createList(int n) {
    struct Student *newNode, *temp;
    int i;

    for (i = 0; i < n; i++) {
        printf("\nEnter details of student %d:\n", i+1);
        newNode = createNode();
        if (newNode == NULL) return;

        if (head == NULL) {
            head = newNode;
        } else {
            temp = head;
            while (temp->next != NULL)
                temp = temp->next;
            temp->next = newNode;
        }
    }
    printf("%d students added to the list.\n", n);
}

// Display the list
void displayList() {
    struct Student* temp = head;
    if (temp == NULL) {
        printf("List is empty.\n");
        return;
    }
    printf("\nStudent List:\n");
    printf("USN\tName\tBranch\tSem\tPhone\n");
    while (temp != NULL) {
        printf("%s\t%s\t%s\t%d\t%s\n", temp->usn, temp->name, temp->branch, temp->sem, temp->phone);
        temp = temp->next;
    }
}

// Count nodes
int countNodes() {
    struct Student* temp = head;
    int count = 0;
    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    return count;
}

// Insert node at end
void insertAtEnd() {
    struct Student* newNode = createNode();
    if (newNode == NULL) return;

    if (head == NULL) {
        head = newNode;
        printf("Inserted at the end as the first node.\n");
        return;
    }

    struct Student* temp = head;
    while (temp->next != NULL)
        temp = temp->next;
    temp->next = newNode;
    printf("Inserted at the end successfully.\n");
}

// Delete node at end
void deleteAtEnd() {
    if (head == NULL) {
        printf("List is empty, cannot delete.\n");
        return;
    }

    if (head->next == NULL) {
        free(head);
        head = NULL;
        printf("Last node deleted, list is now empty.\n");
        return;
    }

    struct Student* temp = head;
    struct Student* prev = NULL;
    while (temp->next != NULL) {
        prev = temp;
        temp = temp->next;
    }
    prev->next = NULL;
    free(temp);
    printf("Last node deleted successfully.\n");
}

// Insert node at beginning
void insertAtBeginning() {
    struct Student* newNode = createNode();
    if (newNode == NULL) return;

    newNode->next = head;
    head = newNode;
    printf("Inserted at beginning successfully.\n");
}

// Delete node at beginning
void deleteAtBeginning() {
    if (head == NULL) {
        printf("List is empty, cannot delete.\n");
        return;
    }

    struct Student* temp = head;
    head = head->next;
    free(temp);
    printf("First node deleted successfully.\n");
}
