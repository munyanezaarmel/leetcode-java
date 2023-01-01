#include <iostream>

int binarySearch(int arr[], int n, int x) {
    int low = 0;
    int high = n - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == x) {
            return mid;
        }
        if (arr[mid] < x) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 3;
    int result = binarySearch(arr, n, x);
    if (result == -1) {
        std::cout << "Element not found in the array" << std::endl;
    } else {
        std::cout << "Element found at index: " << result << std::endl;
    }
    return 0;
}
