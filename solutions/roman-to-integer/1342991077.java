class Solution {
    public int romanToInt(String s) {
        int val = 0;
        int res=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            switch(s.charAt(i)){
            case 'I':
            val += 1;
            break;
            case 'V':
            val += 5;
            break;
            case 'X':
            val += 10;
            break;
            case 'L':
            val += 50; 
            break;
            case 'C':
            val += 100;
            break;
            case 'D':
            val += 500;
            break;
            case 'M':
            val += 1000;
            break;
            }
            if(i<n-1){
                switch(s.charAt(i)){
                    case 'I':
                    if(s.charAt(i+1)=='V' || s.charAt(i+1)=='X'){
                        val -=2;
                    }
                    break;
                    case 'X':
                    if(s.charAt(i+1)=='L' || s.charAt(i+1)=='C'){
                        val -= 20;
                    }
                    break;
                    case 'C':
                    if(s.charAt(i+1)=='D' || s.charAt(i+1)=='M'){
                        val -= 200;
                    }
                    break;
                }
            }
          
    }
    return val;
}
}