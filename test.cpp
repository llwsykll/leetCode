#include <cstdio>
#include <iostream>
#include <string>
#include <map>
using namespace std;

int main(){
    char d1, d2;
    string s;
    while (cin >>d1 >> d2 >> s) {
        map<string,string> res;
        for (auto p=s.begin(), q = p; p != s.end();p = q == s.end()?q : ++q){
            q = find(p, s.end(), d1);
            if(q - p < 3){
                continue;
            }
            auto d = find(p, s.end(), d2);
            if (d -p > q -p || d - p == 0) {
                continue;
            }
            res[s.substr(p - s.begin(), d-p)] = s.substr(d - s.begin() + 1, q-d-1);
        }
        cout<<res.size()<<endl;
        for(auto kv:res) {
            cout<<kv.first << ' ' << kv.second << endl; 
        }
    }
    return 0;
}