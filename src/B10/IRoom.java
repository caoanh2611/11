
package B10;

/**
 *
 * @author TGDD
 */
public interface IRoom {
    abstract double calculateCost ( );
    abstract void enterRoomInfo( );
    abstract void updateRoomById(String id);
    abstract void  displayDetails ( );
}
