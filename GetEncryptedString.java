class GetEncryptedString {
    public String getEncryptedString(String s, int k) {
        String result = "";
        for(int i = 0 ; i < s.length() ; i++){
            int charIndex = (i + k) % s.length() ;
            result+=s.charAt(charIndex);
        }
        return result;
    }
}
