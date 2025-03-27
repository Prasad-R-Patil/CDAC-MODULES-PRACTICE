#include <iostream>
#include <fstream>

using namespace std;

class FileManager 
{

public:
    void createFile(const string& filename) 
    {
        ofstream file(filename);
        if (file) 
        {
            cout << "File created successfully: " << filename << endl;
        } 
        else 
        {
            cout << "Error creating file: " << filename << endl;
        }
    }

    void writeFile(const string& filename, const string& content) 
    {
        ofstream file(filename);
        if (file) 
        {
            file << content;
            cout << "Data written successfully to " << filename << endl;
        } 
        else 
        {
            cout << "Error writing to file: " << filename << endl;
        }
    }

    void readFile(const string& filename) 
    {
        ifstream file(filename);
        if (file) 
        {
            string line;
            while (getline(file, line)) 
            {
                cout << line << endl;
            }
        } 
        else 
        {
            cout << "Error reading file: " << filename << endl;
        }
    }

    void copyFile(const string& src, const string& dest) 
    {
        ifstream inFile(src, ios::binary);
        ofstream outFile(dest, ios::binary);
        if (inFile && outFile) 
        {
            outFile << inFile.rdbuf();
            cout << "File copied from " << src << " to " << dest << endl;
        } 
        else 
        {
            cout << "Error copying file." << endl;
        }
    }

    void renameFile(const string& oldName, const string& newName) 
    {
        if (rename(oldName.c_str(), newName.c_str()) == 0) 
        {
            cout << "File renamed successfully from " << oldName << " to " << newName << endl;
        } 
        else 
        {
            cout << "Error renaming file." << endl;
        }
    }

    void deleteFile(const string& filename) 
    {
        if (remove(filename.c_str()) == 0) 
        {
            cout << "File deleted successfully: " << filename << endl;
        } 
        else 
        {
            cout << "Error deleting file: " << filename << endl;
        }
    }
};

int main() {
    FileManager fm;
    
    string file1 = "FileFirst.txt";
    string file2 = "FileCopy.txt";
    string file3 = "FileRenamed.txt";
    string content = "(: Thank you so much :) ....";
    
    fm.createFile(file1);
    fm.writeFile(file1, content);
    fm.readFile(file1);
    fm.copyFile(file1, file2);
    fm.renameFile(file2, file3);
    fm.deleteFile(file3);
    
    return 0;
}
