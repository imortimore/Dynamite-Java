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
            if (gamestate.getRounds().size() < 4) {
                DynamiteUsed++;
                return Move.D;
            } else {
                Round theirMove1Ago = (Round) gamestate.getRounds().get(gamestate.getRounds().size() - 1);
                Round theirMove2Ago = (Round) gamestate.getRounds().get(gamestate.getRounds().size() - 2);
                Round theirMove4Ago = (Round) gamestate.getRounds().get(gamestate.getRounds().size() - 4);
                if (theirMove1Ago == theirMove2Ago) {
                    return this.getCounterMove(theirMove1Ago.getP1());
                } else if (theirMove2Ago == theirMove4Ago) {
                    return this.getCounterMove(theirMove2Ago.getP1());
                } else {
                    DynamiteUsed++;
                    return Move.D;
            }
        }
    }
        return this.getRandomMove();
    }

    private Move getCounterMove(Move theirMove2Ago) {
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

    //test logic for this method
    //Round theirMove2Ago = (Round) gamestate.getRounds().get(gamestate.getRounds().size() - 2);
    //Round theirMove4Ago = (Round) gamestate.getRounds().get(gamestate.getRounds().size() - 4);

    public Move getRandomMove() {
        int randomNumberBetween0And3 = (int) Math.floor(Math.random() * 3.0);
        Move[] possibleMoves = new Move[]{Move.R, Move.P, Move.S};
        Move randomMove = possibleMoves[randomNumberBetween0And3];
        return randomMove;
    }
}

//Round theirMove1Ago = (Round) gamestate.getRounds().get(gamestate.getRounds().size() - 1);
//return this.getCounterMove(theirMove1Ago.getP1());

