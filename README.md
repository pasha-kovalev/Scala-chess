# Scala Chess Game

## Domains

* **Lobby**: waiting area for creating games and finding opponents
    + View list of games
    + Create/Join public game
    + Create/Join private game with link
* **Game**: chess game between two players
    + **Type**: classic, 960, etc
    + **Status**: created, waiting, finished, etc
    + **Board**: 8x8 board that holds pieces to its positions
    + **Move**: a player's action to move a piece from one to other position
    + **Player**: User with color within concrete game
* **Pieces**:  chess pieces that are used in the game
    + **Color**: White or Black
* **GameEngine**: event sourcing pattern realization

## Services

* **Move Validation**: (redo to all possible move) queries the event store to check if a move is valid based on the
  current state of the board.

## Event Sourcing

Example flow:

1) Command=MakeMove(Player1, Rook, from H1, to H8)
2) Validate command
3) Event1=MoveMade(...), Event2=PieceCaptured(Knight, H8), Event3=KingChecked(Player2)
4) Effect=SendSuccessMsg

### For future

* Tournaments