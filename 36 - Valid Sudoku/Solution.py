class Solution:
    def isValidSodoku(self, board: List[List[str]]) -> bool:
        # Initialize defaultdicts for rows, columns, and sqaures
        rows = defaultdict(set)
        cols = defaultdict(set)
        squares = defaultdict(set)
        #Iterate through the board
        for r in range(9):
            for c in range(9):
                # Skip empty cells
                if board[r][c] == ".":
                    continue
                # Check if the value is in the row, column, or square
                if (board[r][c] in rows[r] or
                    board[r][c] in cols[c] or
                    board[r][c] in squares[(r//3, c//3)]):
                    return False
                # Add the value to the row, column, and square
                rows[r].add(board[r][c])
                cols[c].add(board[r][c])
                squares[(r//3, c//3)].add(board[r][c])
        # Return True if the board is valid
        return True