// write program that takes 1 integer & 1 array of points of size n. Array will be given in one line in following format :
// N
// x1y1x2y2.....xNyN
// 2nd line will contain 2*n integers representing array of points.
// program should output total no of triplets of collinear points from inputted array of points.
// example:
// Case 1:
// input given
// 3
// 0 0 0 4 0 5
// Output given
// 1

// Sample code in python

// def collinear_triplets(n, points):
//   count = 0
//   for i in range(n):
//     for j in range(i+1, n):
//       for k in range(j+1, n):
//         # Check if the three points are collinear
//         if (points[j][1] - points[i][1]) * (points[k][0] - points[j][0]) == (points[k][1] - points[j][1]) * (points[j][0] - points[i][0]):
//           count += 1
//   return count

// # Read the input from the user
// num_points = int(input())
// points_str = input()

// # Parse the input string and create a list of points
// points = []
// for i in range(0, len(points_str), 2):
//   x = int(points_str[i])
//   y = int(points_str[i+1])
//   points.append((x, y))

// # Print the result
// print(collinear_triplets(num_points, points))

// # Example input and output
// """
// Input:
// 3
// 0 0 0 4 0 5
// Output:
// 1
// """

import java.util.Scanner;

class App {
    public static int collinear_triplets(int n, int[][] points) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if the three points are collinear
                    if (points[j][1] - points[i][1] * (points[k][0] - points[j][0]) == points[k][1]
                            - points[j][1] * (points[j][0] - points[i][0])) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_points = sc.nextInt();
        sc.nextLine();
        String points_str = sc.nextLine();
        sc.close();

        // Parse the input string and create a list of points
        int[][] points = new int[num_points][2];
        for (int i = 0, j = 0; i < points_str.length(); i += 2, j++) {
            // int x = Integer.parseInt(points_str.substring(i, i + 1));
            // int y = Integer.parseInt(points_str.substring(i + 1, i + 2));
            int x = Integer.parseInt(Character.toString(points_str.charAt(i)));
            int y = Integer.parseInt(Character.toString(points_str.charAt(i + 1)));
            points[j][0] = x;
            points[j][1] = y;
        }

        // Print the result
        System.out.println(collinear_triplets(num_points, points));

        // Example input and output
        /*
         * Input:
         * 3
         * 0 0 0 4 0 5
         * Output:
         */
    }
}
