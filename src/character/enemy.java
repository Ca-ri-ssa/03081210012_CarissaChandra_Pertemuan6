package character;

import util.poin;

public class enemy {
    private String nama;
    private int hp, speed,attack,tinggi;
    private poin posisi;
    

    public void lari(){
        posisi.setX(posisi.getX() + speed);
        System.out.println(nama + " berlari");
    }

    public int attack(player player_){
        System.out.println(nama + " menyerang");
        if(player_.getPosisi().getX()== this.getPosisi().getX() && player_.getPosisi().getY()==this.posisi.getY())
        {
            return player_.getHp()-this.attack;
        }
        else        
            return player_.getHp();
    }

    
    public void mati(){
        System.out.println(nama + " mati");
        player.skor+=10;
    }
    public void terkenaSinar(){
        System.out.println(nama + " menjerit : awawaawawawawawawa");
        
    }
    public void jerit(){
        System.out.println(nama + " menjerit : awawaawawawawawawa");
        player.hp-=10;
        
    }


    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public poin getPosisi() {
        return this.posisi;
    }

    public void setPosisi(poin posisi) {
        this.posisi = posisi;
    }
}