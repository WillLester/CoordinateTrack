
#include "stdafx.h"
#include<iostream>
#include<cmath>
using namespace std;
void wdj(double *a,double *b,double *c,double *d,double *e,double *f,int n,double *x)
{
	double l[1000], m[1000], s[1000], p[1000], q[1000];
	int i;
	for (i = 0; i < n - 2; i++)
	{
		s[i] = a[i];
	}
	m[0] = b[0];
	for (i = 1; i < n - 1; i++)
	{
		m[i] = b[i] - s[i - 1] * p[i - 1];
	}
	l[0] = c[0]; l[1] = c[1] - m[0] * p[0];
	for (i = 2; i < n; i++)
	{
		l[i] = c[i] - s[i - 2] * q[i - 2] - m[i - 1] * p[i - 1];
	}
	p[0] = d[0] / c[0];
	for (i = 1; i < n - 1; i++)
	{
		p[i] = (d[i] - m[i - 1] * q[i - 1]) / l[i];
	}
	for (i = 0; i < n - 2; i++)
	{
		q[i] = e[i] / l[i];
	}
	double y[1000];
	y[0] = f[0] / l[0];
	y[1] = (f[1]-m[0]*y[0]) / l[1];
	for (i = 2; i < n; i++)
	{
		y[i] = (f[i] - s[i - 2] * y[i - 2] - m[i - 1] * y[i - 1]) / l[i];
	}
	x[n - 1] = y[n - 1];
	x[n - 2] = y[n - 2] - p[n - 2] * x[n - 1];
	for (i = n - 3; i >= 0; i--)
	{
		x[i] = y[i] - p[i] * x[i + 1] - q[i] * x[i + 2];
	}
}
void slt(double *y1,double lmd ,int T,double *x)
{
	int i;
	double y[1000];
	for (i = 0; i < T; i++)
	{
		y[1] = 2*y1[i];
	}
	double a[1000], b[1000], c[1000];
	c[0] = 2 + 2 * lmd; c[T - 1] = 2 + 2 * lmd;
	for (i = 1; i < T-1; i++)
	{
		c[i] = 2 + 10 * lmd;
	}
	for (i = 0; i < T - 1; i++)
	{
		a[i] = 2 * lmd;
	}
	b[0] = -4 * lmd; b[T-2] = -4 * lmd;
	for (i = 1; i < T - 2; i++)
	{
		b[i] = -8 * lmd;
	}
	wdj(a, b, c, b, a, y, T, x);
	
}
double aimf(double *y,double *t,double lmd,int T)
{
	double s1 = 0;
	double s2 = 0;
	int i;
	for (i = 0; i < T; i++)
	{
		s1 = s1 + (y[i] - t[i])*(y[i] - t[i]);
		s2 = s2 + (t[i + 1] - 2 * t[i] + t[i - 1])*(t[i + 1] - 2 * t[i] + t[i - 1]);
	}
	return s1 + lmd*s2;
}
int main()
{
	double y[1000];
	double lmd;
	int T,i;
	cout << "inp T lmd" << endl;
	cin >> T >> lmd ;
	cout << endl << "inp y" << endl;
	for (i = 0; i < T; i++)
		cin >> y[i];
	double x[1000];
	slt(y, lmd, T, x);
		for (i = 0; i < T; i++)
			cout << x[i] << endl;
    return 0;
}

