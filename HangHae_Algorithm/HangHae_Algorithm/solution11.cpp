//x만큼 간격이 있는
#include <string>
#include <vector>

using namespace std;

vector<long long> solution(int x, int n) {
    vector<long long> answer;
    int tmp = x;
    for (int i = 0; i < n; i++)
    {
        answer.push_back(x);
        x += tmp;
    }

    return answer;
}
