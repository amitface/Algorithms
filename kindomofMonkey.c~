

    #include<bits/stdc++.h>
    using namespace std;
    #define vi vector < int >
    #define pii pair < int , int >
    #define pb push_back
    #define mp make_pair
    #define ff first
    #define ss second
    #define foreach(it,v) for( __typeof((v).begin())it = (v).begin() ; it != (v).end() ; it++ )
    #define ll long long
    #define llu unsigned long long
    #define MOD 1000000007
    #define INF 0x3f3f3f3f
    #define dbg(x) { cout<< #x << ": " << (x) << endl; }
    #define dbg2(x,y) { cout<< #x << ": " << (x) << " , " << #y << ": " << (y) << endl; }
    #define all(x) x.begin(),x.end()
    #define mset(x,v) memset(x, v, sizeof(x))
    #define sz(x) (int)x.size()
    vi adj[100005];
    ll v[100005];
    int vis[100005];
    ll dfs(int u)
    {
        int i;
        ll sum = v[u];
        vis[u] = 1;
        for(i=0;i<sz(adj[i]);i++)
        {
            int v = adj[u][i];
            if(!vis[v])
            {
                dbg(v);
                sum += dfs(v);
            }
        }
        return sum;
    }
    int main()
    {
        int t;
        scanf("%d",&t);
        assert(1 <= t && t <= 100);
        while(t--)
        {
            int n,m,i;
            scanf("%d%d",&n,&m);
            assert(1 <= n && n <= 100000);
            assert(1 <= m && m <= 100000);
            for(i=1;i<=n;i++)
            {
                vis[i] = 1;
                adj[i].clear();
            }
            while(m--)
            {
                int u,v;
                scanf("%d%d",&u,&v);
                adj[u].pb(v);
                adj[v].pb(u);
            }
            for(i=1;i<=n;i++)
            {
                scanf("%lld",&v[i]);
                assert(0 <= v[i] && v[i] <= (ll)1e12);
            }
            ll ans = 0;
            for(i=1;i<=n;i++)
            {
                if(!vis[i])
                {
                    ans = max(ans,dfs(i));
                    dbg(ans);
                }
            }
            printf("%lld\n",ans);
        }
        return 0;
    }


