/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoSlotLogic;

import Domain.Position;
import Domain.SPosition;
import Domain.Spin;
import Domain.Symbol;
import SO.CreateSpinSO;
import Transfer.WebServerTransferObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author User
 */
public class VideoSlotLogic {

    WebServerTransferObject transferObject;
    int mat[][];
    List<Symbol> symbols;
    List<Position> positions;
    List<SPosition> sPositions;
    Spin spin;

    public VideoSlotLogic(WebServerTransferObject transferObject) {
        this.transferObject = transferObject;
        mat = new int[3][5];
        this.sPositions = new ArrayList<>();
        this.symbols = transferObject.vratiSymbols();
        this.positions = transferObject.vratiPositions();
        this.spin = transferObject.vratiSpin();
    }

    public void randomizeMatValues() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                mat[x][y] = new Random().nextInt(symbols.size());
            }
        }
        handleSPositions();
    }

    void handleSPositions() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                SPosition sp = new SPosition();
                sp.setSymbol(symbols.get(mat[x][y]));
                sp.setPosition(getPosition(x, y));
                //sp.setGameId(transferObject.getGameId());
                sp.setGameId(1);
                sPositions.add(sp);
            }
        }
        transferObject.sPositions = sPositions;
    }

    Position getPosition(int x, int y) {
        return positions.stream().filter(p -> p.getX() == x && p.getY() == y).findFirst().get();
    }

}
