import java.util.Scanner;

class RectangleArea{
    public int computeArea(
        int rect1BottomLeftX, int rect1BottomLeftY, 
        int rect1TopRightX, int rect1TopRightY, 
        int rect2BottomLeftX, int rect2BottomLeftY, 
        int rect2TopRightX, int rect2TopRightY
    ) {
        int areaOfRect1 = (rect1TopRightX - rect1BottomLeftX) * (rect1TopRightY - rect1BottomLeftY);
        int areaOfRect2 = (rect2TopRightX - rect2BottomLeftX) * (rect2TopRightY - rect2BottomLeftY);
        int overlapLeft = Math.max(rect1BottomLeftX, rect2BottomLeftX);
        int overlapRight = Math.min(rect1TopRightX, rect2TopRightX);
        int overlapBottom = Math.max(rect1BottomLeftY, rect2BottomLeftY);
        int overlapTop = Math.min(rect1TopRightY, rect2TopRightY);
        int overlapWidth = overlapRight - overlapLeft;
        int overlapHeight = overlapTop - overlapBottom;
        int overlapArea = 0;
        if (overlapWidth > 0 && overlapHeight > 0) {
            overlapArea = overlapWidth * overlapHeight;
        }
        return areaOfRect1 + areaOfRect2 - overlapArea;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first rectangle:");
        System.out.print("Bottom-left X: ");
        int rect1BottomLeftX = scanner.nextInt();
        System.out.print("Bottom-left Y: ");
        int rect1BottomLeftY = scanner.nextInt();
        System.out.print("Top-right X: ");
        int rect1TopRightX = scanner.nextInt();
        System.out.print("Top-right Y: ");
        int rect1TopRightY = scanner.nextInt();
        System.out.println("Enter the coordinates of the second rectangle:");
        System.out.print("Bottom-left X: ");
        int rect2BottomLeftX = scanner.nextInt();
        System.out.print("Bottom-left Y: ");
        int rect2BottomLeftY = scanner.nextInt();
        System.out.print("Top-right X: ");
        int rect2TopRightX = scanner.nextInt();
        System.out.print("Top-right Y: ");
        int rect2TopRightY = scanner.nextInt();
        Solution solution = new Solution();
        int totalArea = solution.computeArea(
            rect1BottomLeftX, rect1BottomLeftY, rect1TopRightX, rect1TopRightY, 
            rect2BottomLeftX, rect2BottomLeftY, rect2TopRightX, rect2TopRightY
        );
        System.out.println("The total area covered by both rectangles is: " + totalArea);
        scanner.close();
    }
}
