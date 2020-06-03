function [x, e] = bisection_method(func,a,b,n)
% function [x, e] = bisection_method(func,a,b,n)
% Does n iterations of the bisection method for a function f
% Inputs: func -- an inline function
%         a,b -- left and right edges of the interval
%         n -- the number of bisections to do.
% Outputs: x -- the estimated solution of f(x) = 0
%          e -- an upper bound on the error
format long
c = func(a); d = func(b);
if c*d > 0.0
    error('Function has same sign at both endpoints.')
end

for i = 1:n
    x = (a + b)/2;
    y = func(x);
    if y == 0.0     % solved the equation exactly
        e = 0;
        break      % jumps out of the for loop
    end
    if c*y < 0
        b=x;
    else
        a=x;
    end
end
e = (b-a)/2;