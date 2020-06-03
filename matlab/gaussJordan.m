function [ sol ] = gaussJordan( matrix )
%Applying Gauss Jordan Method to a given system of equation
%   First triangulizing then solving and returning solutions

sol = rref(matrix);
[m,n] = size(matrix);
columnMatrix = zeros(n,1);
columnMatrix(n) = 1;
sol = sol * columnMatrix;
end

