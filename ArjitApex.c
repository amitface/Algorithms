

    #include <bits/stdc++.h>
    using namespace std;
    void optimizeIO()
    {
    	ios_base::sync_with_stdio(false);
    	cin.tie(NULL);
    }
    const int maxm = 1e5 + 1;
    const int maxn = 1e5 + 1;
    int main()
    {
    	optimizeIO();
    	int t;
    	cin >> t;
    	while (t--)
    	{
    		int m, n;
    		cin >> m >> n;
    		multiset<int> bar[maxm], foo[maxn];
    		for (int i = 0; i < m; i++)
    		{
    			int u, v;
    			cin >> u >> v;
    			bar[u].insert(v);
    		}
    		for (int i = 0; i < n; i++)
    		{
    			int w, x;
    			cin >> w >> x;
    			foo[w].insert(x);
    		}
    		int good = 0, great = 0;
    		for (int skill = 1; skill <= maxm; skill++)
    		{
    			int tmp = 0;
    			for (auto proficiency: bar[skill])
    				if (foo[skill].count(proficiency))
    					tmp++, foo[skill].erase(foo[skill].find(proficiency));
    			int t1 = bar[skill].size();
    			int t2 = foo[skill].size();
    			good += tmp, great += tmp;
    			t1 -= tmp;
    			good += min(t1, t2);
    		}
    		int g, h;
    		cin >> g >> h;
    		if (good >= g and great >= h)
    			cout << "Great\n";
    		else if (good >= g)
    			cout << "Good\n";
    		else
    			cout << ":(\n";
    	}
    	return 0;
    }


