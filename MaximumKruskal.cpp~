/*#include <bits/stdc++.h>
#define bs 1000000007
using namespace std;
int n,m,tests,a[1<<20],b[1<<20],c[1<<20],w[1<<20];
int ans;
int get(int x)
{
	if (x==w[x])
		return x;
	return w[x]=get(w[x]);
}
void merge(int a,int b)
{
	w[a]=b;
}
vector<pair<int, int> > v;
int main(){
ios_base::sync_with_stdio(0);
//cin.tie(0);
cin>>tests;
for (;tests;--tests)
{
	cin>>n>>m;
	v.clear();
	for (int i=1;i<=m;i++)
	{
		cin>>a[i]>>b[i]>>c[i];
		v.push_back(make_pair(c[i],i));
	}
	ans=1;
	sort(v.begin(),v.end());
	for (int i=1;i<=n;i++)
		w[i]=i;
	for (int i=0;i<v.size();i++)
	{
		int id=v[i].second;
		int ta,tb;
		ta=a[id];
		tb=b[id];
		ta=get(ta);
		tb=get(tb);
		if (ta==tb)
			continue;
		//ans=1ll*ans*c[id]%bs;
		 ans+=c[id];
		merge(ta,tb);
	}
	cout<<ans<<endl;
}
return 0;}*/
#include <iostream>
#include <vector>
#include <utility>
#include <algorithm>
#define bs 1000000007
using namespace std;
const int MAX = 1e5 + 5;
int id[MAX], nodes, edges;
pair <long long, pair<int, int> > p[MAX];

void initialize()
{
    for(int i = 0;i < MAX;++i)
        id[i] = i;
}

int root(int x)
{
    while(id[x] != x)
    {
        id[x] = id[id[x]];
        x = id[x];
    }
    return x;
}

void union1(int x, int y)
{
    int p = root(x);
    int q = root(y);
    id[p] = id[q];
}
void merge(int a,int b)
{
	id[a]=b;
}

long long kruskal(pair<long long, pair<int, int> > p[])
{
    int x, y;
    long long cost, minimumCost = 1;
    for(int i = 0;i < edges;++i)
	//for(int i = edges-1;i >=0;i--)
    {
        // Selecting edges one by one in increasing order from the beginning
        x = p[i].second.first;
        y = p[i].second.second;
        cost = p[i].first;
        // Check if the selected edge is creating a cycle or not
        if(root(x) != root(y))
        {
            minimumCost =(1ll*minimumCost* cost)%bs;
		//minimumCost+=cost;
            union1(x, y);
	//	merge(x,y);
        }    
    }
    return minimumCost;
}

int main()
{
    int T;
	cin>>T;
    for(int j=0;j<T;j++){	
    int x, y;
    long long weight, cost, minimumCost;
    initialize();
    cin >> nodes >> edges;
    for(int i = 0;i < edges;++i)
    {
        cin >> x >> y >> weight;
        p[i] = make_pair(weight, make_pair(x, y));
    }
    // Sort the edges in the ascending order
    sort(p, p + edges);
    minimumCost = kruskal(p);
    cout << minimumCost << endl;}
    return 0;
}
