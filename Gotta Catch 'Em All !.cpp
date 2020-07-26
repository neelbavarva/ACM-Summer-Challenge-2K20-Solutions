#include <bits/stdc++.h>
#define llu long long int
using namespace std;

struct Point {
 
    llu x, y;
 
    bool operator<(Point p)
    {
        return x < p.x || (x == p.x && y < p.y);
    }
};
 

llu cross_product(Point O, Point A, Point B)
{
    return (A.x - O.x) * (B.y - O.y)
           - (A.y - O.y) * (B.x - O.x);
}
 

vector<Point> convex_hull(vector<Point> A)
{
    int n = A.size(), k = 0;
 
    if (n <= 3)
        return A;
 
    vector<Point> ans(2 * n);
 
    // Sort points lexicographically
    sort(A.begin(), A.end());
 
    // Build lower hull
    for (int i = 0; i < n; ++i) {
 
        
        while (k >= 2 && cross_product(ans[k - 2],
                          ans[k - 1], A[i]) <= 0)
            k--;
        ans[k++] = A[i];
    }
 
    // Build upper hull
    for (size_t i = n - 1, t = k + 1; i > 0; --i) {
 
        
        while (k >= t && cross_product(ans[k - 2],
                           ans[k - 1], A[i - 1]) <= 0)
            k--;
        ans[k++] = A[i - 1];
    }
 
    
    ans.resize(k - 1);
 
    return ans;
}
 
// Driver code
int main()
{
    int n;
    cin>>n;
    vector<Point> points(n);
 
 
    for(int i=0;i<n;i++)
    {
        cin>>points[i].x>>points[i].y;
    }
    // Add points
 
 
    // Find the convex hull
    vector<Point> ans = convex_hull(points);
 
    // Print the convex hull
    long long sum=0;
    for (int i = 0; i < ans.size()-1; i++)
        sum+=ans[i].x*ans[i+1].y-ans[i].y*ans[i+1].x;
    sum+=ans[ans.size()-1].x*ans[0].y-ans[ans.size()-1].y*ans[0].x;
    if(sum<0)
    sum=sum*(-1);
    if(sum==0)
    sum=-1;
    cout<<sum;
    return 0;
}