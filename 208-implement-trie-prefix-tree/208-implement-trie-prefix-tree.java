class Trie {

    char c;
    Trie[] arr = new Trie[26];
    boolean end = false;
    public Trie() {
        
    }
    
    public Trie(char x){
        this.c = x;
    }
    
    public void insert(String word) {
        int n = word.length();
        Trie curr = this;
        for(int i=0;i<n;i++){
            if(curr.arr[word.charAt(i)-'a']==null){
                Trie x = new Trie(word.charAt(i));
                curr.arr[word.charAt(i)-'a'] = x;
            }
            curr = curr.arr[word.charAt(i)-'a'];
        }
        curr.end = true;
    }
    
    public boolean search(String word) {
        int n = word.length();
        Trie curr = this;
        for(int i=0;i<n;i++){
            if(curr.arr[word.charAt(i)-'a']==null||curr.arr[word.charAt(i)-'a'].c !=word.charAt(i)){
                return false;
            }
            curr = curr.arr[word.charAt(i)-'a'];
        }
        return curr.end;
    }
    
    public boolean startsWith(String word) {
        int n = word.length();
        Trie curr = this;
        for(int i=0;i<n;i++){
            if(curr.arr[word.charAt(i)-'a']==null||curr.arr[word.charAt(i)-'a'].c !=word.charAt(i)){
                return false;
            }
            curr = curr.arr[word.charAt(i)-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */