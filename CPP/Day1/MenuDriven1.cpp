#include <iostream>

using namespace std;

int main() {
    int choice, quantity, totalBill;
    char nextOrder;


        totalBill = 0;
        cout << "\nWelcome to the Small Hotel!" << endl;

        do {
            cout << "\n==>> Menu: <<==\n";
            cout << "=> 1. Tea - Rs. 10\n";
            cout << "=> 2. Coffee - Rs. 20\n";
            cout << "=> 3. Sandwich - Rs. 50\n";
            cout << "=> 4. Burger - Rs. 80\n";
            cout << "=> 5. Pizza - Rs. 150\n";
            cout << "=> 6. Exit\n";

            cout << "\nEnter your choice: ";
            cin >> choice;

            switch(choice)
            {

                     case 1:
                        {
                            cout << "Enter quantity: ";
                            cin >> quantity;
                            totalBill += 10 * quantity;
                            cout << "Added " << quantity << " Tea(s) to your order.\n";
                            break;
                        }
                     case 2 :
                         {
                            cout << "Enter quantity: ";
                            cin >> quantity;
                            totalBill += 20 * quantity;
                            cout << "Added " << quantity << " Coffee(s) to your order.\n";
                            break;
                         }
                     case 3 :
                        {
                            cout << "Enter quantity: ";
                            cin >> quantity;
                            totalBill += 50 * quantity;
                            cout << "Added " << quantity << " Sandwich(es) to your order.\n";
                            break;
                        }
                    case 4 :
                        {
                            cout << "Enter quantity: ";
                            cin >> quantity;
                            totalBill += 80 * quantity;
                            cout << "Added " << quantity << " Burger(s) to your order.\n";
                            break;
                        }
                    case 5 :
                        {
                            cout << "Enter quantity: ";
                            cin >> quantity;
                            totalBill += 150 * quantity;
                            cout << "Added " << quantity << " Pizza(s) to your order.\n";
                            break;
                        }
                    case 6 :
                        {
                        cout << "\nTotal Bill Amount: Rs. ==>> " << totalBill << endl;
                        break;

                        }
                    default:
                        {
                        cout << "Invalid choice! Please select a valid option.\n";
                        }

            }


        } while (choice != 6);



    cout << "\nThank You For Visit...\n Have a great day!\n";
    return 0;
}
