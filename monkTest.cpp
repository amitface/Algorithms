    #include <bits/stdc++.h>
    using namespace std;
    int arr [100005]; 
    int main()
    {
        ios_base::sync_with_stdio(0); 
        int N; cin >> N;
        assert (N>=1 and N<=100000); 
        for (int g=1; g<=N; g++)
        {
        	cin >> arr[g]; 
        	assert(arr[g]>=0 and arr[g]<=1000000); 
        }
        priority_queue <int> store; 
        for (int g=1; g<=N; g++)
        {
        	if (g<=2)
        	{
        		cout << -1 << '\n'; 
        		store.push(arr[g]); continue; 
        	}
        	store.push(arr[g]);
        	int first = store.top();store.pop();
        	int second = store.top();store.pop();
        	int third = store.top();store.pop(); 
       		store.push(first); store.push(second); store.push(third); 
        	cout << 1LL*first*second*third << '\n'; 
        }//
        return 0;
    }
    //
