import java.util.Scanner;

public class foursquare
{
	public static void question()
	{
		board();
		System.out.Println(print_board);
		game();
	}

	public static array board()
	{
		Row 1 = {“ “,” “, “ “, “ “};
		Row 2 = {“ “,” “, “ “, “ “};
		Row 3 = {“ “,” “, “ “, “ “};
		Row 4 = {“ “,” “, “ “, “ “};
		Return {row1. Row2, row3, row4)
		Return an array of four string arrays.
	}

	public static xxx print_board()
	{
		Nested loop (first for loop goes through the array of arrays and pulls out one row array at a time)
		Loop (goes through each element in the called array and prints it with the board)
			Print “----”
			Proint “|”
			Print each element of 1st array;
	}

	public static xxx game()
	{
		
		For int i=0; i< (possible number of moves+1);i++)
			If i%2=0
				Then it is x’s  turn
			Else
				ITS O’S TURN
				
			n = User moves
			If (move_checker(n)==true)
			{
				placement();
				print_board();
				if(win_check()==true);
				{
					Break;
				}

			}
	}

	public static boolean move_check()
	{

	}

	public static array placement()
	{

	}

	public static boolean win_check()
	{

	}
