class Solution {
    public boolean judgeCircle(String moves) {
     int vert = 0;
     int hor = 0;
     for(int i =0;i<moves.length();i++){
        if(moves.charAt(i)=='U') vert++;
       else if(moves.charAt(i)=='D') vert--;
        else if(moves.charAt(i)=='L') hor--;
        else if(moves.charAt(i)=='R') hor++;
     }   
     
     return vert==0 && hor==0;
    }
}