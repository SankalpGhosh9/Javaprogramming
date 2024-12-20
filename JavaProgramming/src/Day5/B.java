package Day5;

class B extends A {
    private int roll_num;
    private String player_name;

    public int getRoll_num() {
        return roll_num;
    }

    public void setRoll_num(int roll_num) {
        this.roll_num = roll_num;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    void show() {
        System.out.println("Batch No: " + getBatch_no());
        System.out.println("Group Name: " + getGroup_name());
        System.out.println("Player Name: " + getPlayer_name());
        System.out.println("Roll Number: " + getRoll_num());
    }
}

