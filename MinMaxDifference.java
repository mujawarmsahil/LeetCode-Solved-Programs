class MinMaxDifference {
    public int minMaxDifference(int num) {
        char []digits_array = String.valueOf(num).toCharArray();
        char non_nine = '9';
        char non_zero = '0';

        for(char digit : digits_array){
            if(digit != '9' && non_nine == '9'){
                non_nine = digit;
            }

            if(digit != '0' && non_zero == '0'){
                non_zero = digit;
            }

            if(non_zero != '0' && non_nine != '9')
                break;
        }

        int min = 0 ;
        int max = 0 ;

        for(char digit : digits_array){
            if(digit == non_nine){
                max = max * 10 + 9 ;
            }else{
                max = max * 10 + (digit - '0');
            }

            if(digit == non_zero){
                min = min * 10 ;
            }else{
                min = min * 10 + (digit - '0');
            }
        }

        return max - min ;
    }
}
