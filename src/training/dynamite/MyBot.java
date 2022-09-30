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
        while (DynamiteUsed >= 100) {
            if (gamestate.getRounds().size() == 0) {
                DynamiteUsed++;
                return Move.D;


            }else{
                int randomNumberBetween0And3 = (int) Math.floor(Math.random() * 3.0);
                Move[] possibleMoves = new Move[]{Move.R, Move.P, Move.S};
                Move randomMove = possibleMoves[randomNumberBetween0And3];
                return randomMove;
        }
    }
}









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