package training.dynamite;

import com.softwire.dynamite.bot.Bot;
import com.softwire.dynamite.game.*;

import java.util.Iterator;
import java.util.Random;

public class MyBot implements Bot {

    public MyBot() {
        // Are you debugging?
        // Put a breakpoint on the line below to see when we start a new match
        System.out.println("Started new match");
    }

    private int DynamiteUsed = 0;

    @Override
    public Move makeMove(Gamestate gamestate) {
        // Are you debugging?
        // Put a breakpoint in this method to see when we make a move
        //logic with Dynamite present
        while (DynamiteUsed >= 100) {
            //if game is started start with a D
            if (gamestate.getRounds().size() == 0) {
                DynamiteUsed++;
                return Move.D;
            } else if () {
            } else if () {
            } else {
            }
        }
        int randomNumberBetween0And3 = (int) Math.floor(Math.random() * 3.0);
        Move[] possibleMoves = new Move[]{Move.R, Move.P, Move.S};
        Move randomMove = possibleMoves[randomNumberBetween0And3];
        return randomMove;
    }

    private Move getCounterMove(Move theirLastMove) {
        switch (theirLastMove) {
            case R:
                return Move.P;
            case P:
                return Move.S;
            case S:
                return Move.R;
            case D:
                return Move.W;
            case W:
                return Move.R;
            default:
                throw new RuntimeException("Invalid last move from P1");
        }
    }

    //test logic for this method
    //Round theirMove2Ago = (Round) gamestate.getRounds().get(gamestate.getRounds().size() - 2);
    //Round theirMove4Ago = (Round) gamestate.getRounds().get(gamestate.getRounds().size() - 4);
    private Move Pattern010(Move theirMove2Ago, Move theirMove4Ago){
        switch (theirMove2Ago) {
            case R:
                return Move.P;
            case P:
                return Move.S;
            case S:
                return Move.R;
            case D:
                return Move.W;
            case W:
                return Move.R;
            default:
                throw new RuntimeException("Invalid last move from P1");
        }
    }
    private Move Pattern000(Move theirMove1Ago, Move theirMove2Ago){
        switch (theirMove2Ago) {
            case R:
                return Move.P;
            case P:
                return Move.S;
            case S:
                return Move.R;
            case D:
                return Move.W;
            case W:
                return Move.R;
            default:
                throw new RuntimeException("Invalid last move from P1");
        }
    }
}







//Round theirMove1Ago = (Round) gamestate.getRounds().get(gamestate.getRounds().size() - 1);
//return this.getCounterMove(theirMove1Ago.getP1());


//        while (DynamiteUsed >= 100){
//            if (gamestate.getRounds().size() == 0) {
//                DynamiteUsed ++;
//                return Move.D;
//            }else {
//                    //random move incl dynamites
//                    int randomNumberBetween0And4 = (int)Math.floor(Math.random() * 4.0);
//                    Move[] possibleMoves = new Move[]{Move.R, Move.P, Move.S, Move.D};
//                    Move randomMoveWithD = possibleMoves[randomNumberBetween0And4];
//                    DynamiteUsed ++;
//                    return randomMoveWithD;
//            }
//        }